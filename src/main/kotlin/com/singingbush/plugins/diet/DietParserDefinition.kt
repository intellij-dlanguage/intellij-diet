package com.singingbush.plugins.diet

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.codeStyle.CodeStyleSettingsManager
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.IStubFileElementType
import com.intellij.psi.tree.TokenSet
import com.jetbrains.plugins.jade.JadeParserDefinition
import com.jetbrains.plugins.jade.lexer.JadeLexer
import com.jetbrains.plugins.jade.parser.JadeParser
import com.singingbush.plugins.diet.parser.DietParser
import com.singingbush.plugins.diet.parser._DietLexer
import com.singingbush.plugins.diet.psi.*

/**
 * @author Samael Bate (singingbush)
 * created on 02/05/17
 */
class DietParserDefinition : ParserDefinition { // JadeParserDefinition() {

    val LOG: Logger = Logger.getInstance(DietParserDefinition::class.java)

    //val WHITE_SPACES: TokenSet = TokenSet.create(DietTypes.INDENT, TokenType.WHITE_SPACE)
    //val COMMENTS: TokenSet = TokenSet.create(DietTypes.COMMENT_NODE)


    init {
        LOG.info("created DietParserDefinition for Diet Templates")
    }

    override fun createLexer(project: Project?): Lexer = FlexAdapter(_DietLexer()) //JadeLexer(CodeStyleSettingsManager.getSettings(project))

    override fun createParser(project: Project?): PsiParser = DietParser() //JadeParser(CodeStyleSettingsManager.getSettings(project))

    override fun getStringLiteralElements(): TokenSet = TokenSet.create(DietTokenType.TEXT)

    override fun getFileNodeType(): IFileElementType = DietFileElementType()

    override fun getWhitespaceTokens(): TokenSet = TokenSet.create(TokenType.WHITE_SPACE)

    override fun createElement(node: ASTNode?): PsiElement = DietTypes.Factory.createElement(node)

    override fun getCommentTokens(): TokenSet = TokenSet.create(DietTypes.COMMENT_NODE)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = DietFile(viewProvider)
}
