// Generated from slf.g4 by ANTLR 4.4
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
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link slfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(@NotNull slfParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(@NotNull slfParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(@NotNull slfParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(@NotNull slfParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(@NotNull slfParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull slfParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal_boolean}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_boolean(@NotNull slfParser.Literal_booleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#read_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_expression(@NotNull slfParser.Read_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(@NotNull slfParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpression(@NotNull slfParser.ReadExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(@NotNull slfParser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#compound_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_expression(@NotNull slfParser.Compound_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal_string}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_string(@NotNull slfParser.Literal_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(@NotNull slfParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link slfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(@NotNull slfParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTIFIERExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTIFIERExpression(@NotNull slfParser.IDENTIFIERExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(@NotNull slfParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull slfParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal_number}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_number(@NotNull slfParser.Literal_numberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(@NotNull slfParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link slfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull slfParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(@NotNull slfParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal_character}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_character(@NotNull slfParser.Literal_characterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(@NotNull slfParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#print_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_expression(@NotNull slfParser.Print_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(@NotNull slfParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeExpression(@NotNull slfParser.NegativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link slfParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull slfParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negateExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpression(@NotNull slfParser.NegateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code closedExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosedExpression(@NotNull slfParser.ClosedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link slfParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull slfParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundExpression(@NotNull slfParser.CompoundExpressionContext ctx);
}