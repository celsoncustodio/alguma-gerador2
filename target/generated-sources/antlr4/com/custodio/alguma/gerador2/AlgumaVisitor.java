// Generated from com\custodio\alguma\gerador2\Alguma.g4 by ANTLR 4.7.2
package com.custodio.alguma.gerador2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgumaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgumaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(AlgumaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoAritmetico(AlgumaParser.TermoAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorAritmetico(AlgumaParser.FatorAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(AlgumaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#termoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoRelacional(AlgumaParser.TermoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(AlgumaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuicao(AlgumaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEntrada(AlgumaParser.ComandoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#comandoSaida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSaida(AlgumaParser.ComandoSaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoCondicao(AlgumaParser.ComandoCondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRepeticao(AlgumaParser.ComandoRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAlgoritmo(AlgumaParser.SubAlgoritmoContext ctx);
}