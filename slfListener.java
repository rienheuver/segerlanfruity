// Generated from slf.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link slfParser}.
 */
public interface slfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link slfParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(slfParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(slfParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(slfParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(slfParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTIFIERExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIDENTIFIERExpression(slfParser.IDENTIFIERExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTIFIERExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIDENTIFIERExpression(slfParser.IDENTIFIERExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(slfParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(slfParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(slfParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(slfParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(slfParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(slfParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(slfParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(slfParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(slfParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(slfParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiExpression(slfParser.MultiExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiExpression(slfParser.MultiExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(slfParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(slfParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(slfParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(slfParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(slfParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(slfParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(slfParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(slfParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadExpression(slfParser.ReadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadExpression(slfParser.ReadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code closedExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClosedExpression(slfParser.ClosedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code closedExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClosedExpression(slfParser.ClosedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompoundExpression(slfParser.CompoundExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundExpression}
	 * labeled alternative in {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompoundExpression(slfParser.CompoundExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(slfParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(slfParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(slfParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(slfParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void enterRead_expression(slfParser.Read_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void exitRead_expression(slfParser.Read_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expression(slfParser.Print_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expression(slfParser.Print_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(slfParser.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(slfParser.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expression(slfParser.Compound_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expression(slfParser.Compound_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(slfParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(slfParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(slfParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(slfParser.LiteralContext ctx);
}