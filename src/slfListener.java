// Generated from slf.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link slfParser}.
 */
public interface slfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code negativeExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegativeExpression(@NotNull slfParser.NegativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negativeExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegativeExpression(@NotNull slfParser.NegativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementCommand}
	 * labeled alternative in {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementCommand(@NotNull slfParser.WhileStatementCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementCommand}
	 * labeled alternative in {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementCommand(@NotNull slfParser.WhileStatementCommandContext ctx);
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
	 * labeled alternative in {@link slfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull slfParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link slfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull slfParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void enterReturn_expression(@NotNull slfParser.Return_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#return_expression}.
	 * @param ctx the parse tree
	 */
	void exitReturn_expression(@NotNull slfParser.Return_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationCommand}
	 * labeled alternative in {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationCommand(@NotNull slfParser.DeclarationCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationCommand}
	 * labeled alternative in {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationCommand(@NotNull slfParser.DeclarationCommandContext ctx);
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
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(@NotNull slfParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(@NotNull slfParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal_string}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_string(@NotNull slfParser.Literal_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal_string}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_string(@NotNull slfParser.Literal_stringContext ctx);
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
	 * Enter a parse tree produced by the {@code literal_character}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_character(@NotNull slfParser.Literal_characterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal_character}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_character(@NotNull slfParser.Literal_characterContext ctx);
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
	 * Enter a parse tree produced by the {@code negateExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegateExpression(@NotNull slfParser.NegateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negateExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegateExpression(@NotNull slfParser.NegateExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code expressionCommand}
	 * labeled alternative in {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCommand(@NotNull slfParser.ExpressionCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionCommand}
	 * labeled alternative in {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCommand(@NotNull slfParser.ExpressionCommandContext ctx);
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
	 * Enter a parse tree produced by the {@code literal_boolean}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_boolean(@NotNull slfParser.Literal_booleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal_boolean}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_boolean(@NotNull slfParser.Literal_booleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal_number}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_number(@NotNull slfParser.Literal_numberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal_number}
	 * labeled alternative in {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_number(@NotNull slfParser.Literal_numberContext ctx);
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
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link slfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull slfParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link slfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull slfParser.IntContext ctx);
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
	 * labeled alternative in {@link slfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(@NotNull slfParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link slfParser#type}.
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
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link slfParser#type}.
	 * @param ctx the parse tree
	 */
	void enterChar(@NotNull slfParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link slfParser#type}.
	 * @param ctx the parse tree
	 */
	void exitChar(@NotNull slfParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull slfParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull slfParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementCommand}
	 * labeled alternative in {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementCommand(@NotNull slfParser.IfStatementCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementCommand}
	 * labeled alternative in {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementCommand(@NotNull slfParser.IfStatementCommandContext ctx);
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