import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Péter Ferenc Gyarmati
 * @id 11913446
 */
public class BigCalcProgVisitorImpl extends BigCalcProgBaseVisitor<BigDecimal> {
    private final Map<String, BigDecimal> variables = new HashMap<>();
    private static final BigDecimal DEFAULT_VALUE = new BigDecimal(0);

    /* statement+ EOF */
    @Override
    public BigDecimal visitProgram(BigCalcProgParser.ProgramContext ctx) {
        BigDecimal value = DEFAULT_VALUE;
        for (BigCalcProgParser.StatementContext statementContext : ctx.statement())
            value = visit(statementContext);
        return value;
    }

    /* expression END_OF_STAT */
    @Override
    public BigDecimal visitExpressionStatement(BigCalcProgParser.ExpressionStatementContext ctx) {
        return visit(ctx.expression());
    }

    /* assignment END_OF_STAT */
    @Override
    public BigDecimal visitAssignmentStatement(BigCalcProgParser.AssignmentStatementContext ctx) {
        return visit(ctx.assignment());
    }

    /* VAR OP_ASSIGN expression */
    @Override
    public BigDecimal visitVarAssignment(BigCalcProgParser.VarAssignmentContext ctx) {
        String variableName = ctx.VAR().getText();
        BigDecimal variableValue = visit(ctx.expression());
        variables.put(variableName, variableValue);
        return variableValue;
    }

    /* VAR op=(OP_MUL| OP_DIV | OP_ADD | OP_SUB) OP_ASSIGN expression */
    @Override
    public BigDecimal visitCompoundAssignment(BigCalcProgParser.CompoundAssignmentContext ctx) {
        String variableName = ctx.VAR().getText();
        BigDecimal oldValue = variables.getOrDefault(variableName, DEFAULT_VALUE);
        BigDecimal arg = visit(ctx.expression());
        BigDecimal newValue = DEFAULT_VALUE;
        switch (ctx.op.getType()) {
            case BigCalcProgParser.OP_MUL: newValue = oldValue.multiply(arg); break;
            case BigCalcProgParser.OP_DIV: newValue = oldValue.divide(arg, 10, RoundingMode.HALF_UP); break;
            case BigCalcProgParser.OP_ADD: newValue = oldValue.add(arg); break;
            case BigCalcProgParser.OP_SUB: newValue = oldValue.subtract(arg); break;
        }
        variables.put(variableName, newValue);
        return newValue;
    }

    /* PAR_LEFT expression PAR_RIGHT */
    @Override
    public BigDecimal visitParExpression(BigCalcProgParser.ParExpressionContext ctx) {
        return visit(ctx.expression());
    }

    /* ABS_OPEN expression ABS_CLOSE */
    @Override
    public BigDecimal visitAbs(BigCalcProgParser.AbsContext ctx) {
        BigDecimal arg = visit(ctx.expression());
        return arg.abs();
    }

    /* op=(OP_ADD | OP_SUB) expression */
    @Override
    public BigDecimal visitPlusMinus(BigCalcProgParser.PlusMinusContext ctx) {
        BigDecimal value = visit(ctx.expression());
        boolean isPlus = ctx.op.getType() == BigCalcProgParser.OP_ADD;
        return isPlus ? value : value.negate();
    }

    /* left=expression op=(OP_MUL | OP_DIV) right=expression */
    @Override
    public BigDecimal visitMulDiv(BigCalcProgParser.MulDivContext ctx) {
        BigDecimal leftValue = visit(ctx.left);
        BigDecimal rightValue = visit(ctx.right);
        boolean isMultiplication = ctx.op.getType() == BigCalcProgParser.OP_MUL;
        return isMultiplication
                ? leftValue.multiply(rightValue)
                : leftValue.divide(rightValue, 10, RoundingMode.HALF_UP);
    }

    /* left=expression OP_POW<assoc=right> right=expression */
    @Override
    public BigDecimal visitPow(BigCalcProgParser.PowContext ctx) {
        BigDecimal leftValue = visit(ctx.left);
        BigDecimal rightValue = visit(ctx.right);
        return leftValue.pow(rightValue.intValue());
    }

    /* left=expression op=(OP_ADD | OP_SUB) right=expression */
    @Override
    public BigDecimal visitAddSub(BigCalcProgParser.AddSubContext ctx) {
        BigDecimal leftValue = visit(ctx.left);
        BigDecimal rightValue = visit(ctx.right);
        boolean isAddition = ctx.op.getType() == BigCalcProgParser.OP_ADD;
        return isAddition ? leftValue.add(rightValue) : leftValue.subtract(rightValue);
    }

    /* NUMBER */
    @Override
    public BigDecimal visitNum(BigCalcProgParser.NumContext ctx) {
        return new BigDecimal(ctx.NUMBER().getText());
    }

    /* VAR */
    @Override
    public BigDecimal visitVariable(BigCalcProgParser.VariableContext ctx) {
        String variableName = ctx.VAR().getText();
        if (variables.containsKey(variableName)) return variables.get(variableName);
        return DEFAULT_VALUE;
    }
}
