// Generated from BigCalcProg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BigCalcProgParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BigCalcProgVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BigCalcProgParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BigCalcProgParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(BigCalcProgParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link BigCalcProgParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(BigCalcProgParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varAssignment}
	 * labeled alternative in {@link BigCalcProgParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(BigCalcProgParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundAssignment}
	 * labeled alternative in {@link BigCalcProgParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundAssignment(BigCalcProgParser.CompoundAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(BigCalcProgParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code abs}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs(BigCalcProgParser.AbsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mod}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(BigCalcProgParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(BigCalcProgParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(BigCalcProgParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(BigCalcProgParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpression}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(BigCalcProgParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link BigCalcProgParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(BigCalcProgParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link BigCalcProgParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(BigCalcProgParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link BigCalcProgParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(BigCalcProgParser.VariableContext ctx);
}