// Generated from slf.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link slfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface slfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link slfParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(slfParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(slfParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTIFIERExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTIFIERExpression(slfParser.IDENTIFIERExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(slfParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(slfParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(slfParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(slfParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(slfParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiExpression(slfParser.MultiExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(slfParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(slfParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(slfParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(slfParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpression(slfParser.ReadExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code closedExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosedExpression(slfParser.ClosedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundExpression(slfParser.CompoundExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(slfParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(slfParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#read_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_expression(slfParser.Read_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#print_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_expression(slfParser.Print_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(slfParser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#compound_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_expression(slfParser.Compound_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(slfParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(slfParser.LiteralContext ctx);
}