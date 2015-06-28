// Generated from slf.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link slfParser}.
 */
public interface slfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(@NotNull slfParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(@NotNull slfParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull slfParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull slfParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expression(@NotNull slfParser.Print_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expression(@NotNull slfParser.Print_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull slfParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull slfParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull slfParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull slfParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull slfParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull slfParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code character}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(@NotNull slfParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code character}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(@NotNull slfParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompoundExpression(@NotNull slfParser.CompoundExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompoundExpression(@NotNull slfParser.CompoundExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiExpression(@NotNull slfParser.MultiExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiExpression(@NotNull slfParser.MultiExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull slfParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull slfParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull slfParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull slfParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(@NotNull slfParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(@NotNull slfParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code closedExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClosedExpression(@NotNull slfParser.ClosedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code closedExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClosedExpression(@NotNull slfParser.ClosedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(@NotNull slfParser.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(@NotNull slfParser.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadExpression(@NotNull slfParser.ReadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadExpression(@NotNull slfParser.ReadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(@NotNull slfParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(@NotNull slfParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull slfParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull slfParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(@NotNull slfParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(@NotNull slfParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull slfParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull slfParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull slfParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull slfParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(@NotNull slfParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(@NotNull slfParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(@NotNull slfParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(@NotNull slfParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(@NotNull slfParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(@NotNull slfParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void enterRead_expression(@NotNull slfParser.Read_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void exitRead_expression(@NotNull slfParser.Read_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expression(@NotNull slfParser.Compound_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expression(@NotNull slfParser.Compound_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull slfParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull slfParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTIFIERExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIDENTIFIERExpression(@NotNull slfParser.IDENTIFIERExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTIFIERExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIDENTIFIERExpression(@NotNull slfParser.IDENTIFIERExpressionContext ctx);
}