import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class BigCalcVisitorImpl extends BigCalcBaseVisitor<BigDecimal> {
    private final Map<String, BigDecimal> variables = new HashMap<>();
    private static final BigDecimal DEFAULT_VALUE = new BigDecimal(0);

    /* statement+ */
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

    /* VAR ASSIGN_TO expression */
    @Override
    public BigDecimal visitAssignment(BigCalcParser.AssignmentContext ctx) {
        String variableName = ctx.VAR().getText();
        BigDecimal variableValue = visit(ctx.expression());
        variables.put(variableName, variableValue);
        return variableValue;
    }

    /* expression op=(MUL | DIV) expression */
    @Override
    public BigDecimal visitMulDiv(BigCalcParser.MulDivContext ctx) {
        BigDecimal left = visit(ctx.expression(0));
        BigDecimal right = visit(ctx.expression(1));
        boolean isMultiplication = ctx.op.getType() == BigCalcParser.MUL;
        return isMultiplication ? left.multiply(right) : left.divide(right, 10, RoundingMode.HALF_UP);
    }

    /* expression op=(ADD | SUB) expression */
    @Override
    public BigDecimal visitAddSub(BigCalcParser.AddSubContext ctx) {
        BigDecimal left = visit(ctx.expression(0));
        BigDecimal right = visit(ctx.expression(1));
        boolean isAddition = ctx.op.getType() == BigCalcParser.ADD;
        return isAddition ? left.add(right) : left.subtract(right);
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

    /* PAR_LEFT expression PAR_RIGHT */
    @Override
    public BigDecimal visitParExpression(BigCalcParser.ParExpressionContext ctx) {
        return visit(ctx.expression());
    }
}
