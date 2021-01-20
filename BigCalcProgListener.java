// Generated from BigCalcProg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BigCalcProgParser}.
 */
public interface BigCalcProgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BigCalcProgParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BigCalcProgParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigCalcProgParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BigCalcProgParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(BigCalcProgParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(BigCalcProgParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(BigCalcProgParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(BigCalcProgParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssignment}
	 * labeled alternative in {@link BigCalcProgParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(BigCalcProgParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssignment}
	 * labeled alternative in {@link BigCalcProgParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(BigCalcProgParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundAssignment}
	 * labeled alternative in {@link BigCalcProgParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterCompoundAssignment(BigCalcProgParser.CompoundAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundAssignment}
	 * labeled alternative in {@link BigCalcProgParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitCompoundAssignment(BigCalcProgParser.CompoundAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(BigCalcProgParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(BigCalcProgParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abs}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAbs(BigCalcProgParser.AbsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abs}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAbs(BigCalcProgParser.AbsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(BigCalcProgParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(BigCalcProgParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(BigCalcProgParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(BigCalcProgParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValue(BigCalcProgParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValue(BigCalcProgParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpression}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(BigCalcProgParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpression}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(BigCalcProgParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(BigCalcProgParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(BigCalcProgParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link BigCalcProgParser#val}.
	 * @param ctx the parse tree
	 */
	void enterNum(BigCalcProgParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link BigCalcProgParser#val}.
	 * @param ctx the parse tree
	 */
	void exitNum(BigCalcProgParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link BigCalcProgParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVariable(BigCalcProgParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link BigCalcProgParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVariable(BigCalcProgParser.VariableContext ctx);
}