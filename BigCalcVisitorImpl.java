import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class BigCalcVisitorImpl extends BigCalcBaseVisitor<BigDecimal> {
    private final Map<String, BigDecimal> variables = new HashMap<>();
    private static final BigDecimal DEFAULT_VALUE = new BigDecimal(0);

    /* statement+ EOF */
    @Override
    public BigDecimal visitProgram(BigCalcParser.ProgramContext ctx) {
        BigDecimal value = DEFAULT_VALUE;
        for (BigCalcParser.StatementContext statementContext : ctx.statement())
            value = visit(statementContext);
        return value;
    }

    /* expression END_OF_STAT */
    @Override
    public BigDecimal visitExpressionStatement(BigCalcParser.ExpressionStatementContext ctx) {
        return visit(ctx.expression());
    }

    /* assignment END_OF_STAT */
    @Override
    public BigDecimal visitAssignmentStatement(BigCalcParser.AssignmentStatementContext ctx) {
        return visit(ctx.assignment());
    }

    /* VAR OP_ASSIGN expression */
    @Override
    public BigDecimal visitAssignment(BigCalcParser.AssignmentContext ctx) {
        String variableName = ctx.VAR().getText();
        BigDecimal variableValue = visit(ctx.expression());
        variables.put(variableName, variableValue);
        return variableValue;
    }

    /* PAR_LEFT expression PAR_RIGHT */
    @Override
    public BigDecimal visitParExpression(BigCalcParser.ParExpressionContext ctx) {
        return visit(ctx.expression());
    }

    /* op=(OP_ADD | OP_SUB) expression */
    @Override
    public BigDecimal visitPlusMinus(BigCalcParser.PlusMinusContext ctx) {
        BigDecimal value = visit(ctx.expression());
        boolean isPlus = ctx.op.getType() == BigCalcParser.OP_ADD;
        return isPlus ? value : value.negate();
    }

    /* left=expression op=(OP_MUL | OP_DIV) right=expression */
    @Override
    public BigDecimal visitMulDiv(BigCalcParser.MulDivContext ctx) {
        BigDecimal leftValue = visit(ctx.left);
        BigDecimal rightValue = visit(ctx.right);
        boolean isMultiplication = ctx.op.getType() == BigCalcParser.OP_MUL;
        return isMultiplication
                ? leftValue.multiply(rightValue)
                : leftValue.divide(rightValue, 10, RoundingMode.HALF_UP);
    }

    /* left=expression op=(OP_ADD | OP_SUB) right=expression */
    @Override
    public BigDecimal visitAddSub(BigCalcParser.AddSubContext ctx) {
        BigDecimal leftValue = visit(ctx.left);
        BigDecimal rightValue = visit(ctx.right);
        boolean isAddition = ctx.op.getType() == BigCalcParser.OP_ADD;
        return isAddition ? leftValue.add(rightValue) : leftValue.subtract(rightValue);
    }

    /* NUMBER */
    @Override
    public BigDecimal visitNum(BigCalcParser.NumContext ctx) {
        return new BigDecimal(ctx.NUMBER().getText());
    }

    /* VAR */
    @Override
    public BigDecimal visitVariable(BigCalcParser.VariableContext ctx) {
        String variableName = ctx.VAR().getText();
        if (variables.containsKey(variableName)) return variables.get(variableName);
        return DEFAULT_VALUE;
    }
}
