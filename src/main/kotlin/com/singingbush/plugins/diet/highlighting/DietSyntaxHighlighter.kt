package com.singingbush.plugins.diet.highlighting

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import com.jetbrains.plugins.jade.highlighter.JadeHighlighter
import com.jetbrains.plugins.jade.highlighter.JadeSyntaxHighlighter
import com.jetbrains.plugins.jade.psi.JadeTokenTypes
import com.singingbush.plugins.diet.parser.DietLexerAdapter
import com.singingbush.plugins.diet.psi.DietTokenType

/**
 * @author Samael Bate (singingbush)
 * created on 02/05/2017
 */
class DietSyntaxHighlighter(val codeStyleSettings: CodeStyleSettings = CodeStyleSettings()) : SyntaxHighlighterBase() { //JadeSyntaxHighlighter(codeStyleSettings) {

//    const DIET_LINE_COMMENT = TextAttributesKey.createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.)
    companion object {
    val LINE_COMMENT = TextAttributesKey.createTextAttributesKey("DIET_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey("DIET_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
    val KEYWORD = TextAttributesKey.createTextAttributesKey("DIET_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
    val NUMBER = TextAttributesKey.createTextAttributesKey("DIET_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
    val STRING = TextAttributesKey.createTextAttributesKey("DIET_STRING", DefaultLanguageHighlighterColors.STRING)

    //TokenSet.create(DietTokenType.TEXT)
    }

    val ATTRIBUTES = hashMapOf(
        DietTokenType.TEXT to BLOCK_COMMENT,
        DietTokenType.INDENT to BLOCK_COMMENT
    )

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        val attributesKey = ATTRIBUTES[tokenType]
        return if(attributesKey != null) arrayOf(attributesKey) else emptyArray()
    }

    override fun getHighlightingLexer(): Lexer = DietLexerAdapter() // we could pass settings to a HighlightingLexer

    init {
//        val field = JadeSyntaxHighlighter::class.java.getDeclaredField("ATTRIBUTES")
//        field.type.getDeclaredMethod("putIfAbsent", TextAttributesKey::class.java, TextAttributesKey::class.java)

//        val attribs = JadeSyntaxHighlighter::ATTRIBUTES.javaField
        //JadeSyntaxHighlighter::class.java.getDeclaredMethod("put", TextAttributesKey::class.java, TextAttributesKey::class.java)

//        JadeSyntaxHighlighter::class.java
//                .getDeclaredField("ATTRIBUTES").javaClass
//                .getDeclaredMethod("putIfAbsent", JadeTokenTypes.JSInJadeEmbeddedElementType().javaClass, JadeHighlighter.JS_BLOCK.javaClass)

//        javaClass.getDeclaredField("ATTRIBUTES").javaClass.getMethod("putIfAbsent", null, null)
//
//        val field: Map<IElementType, TextAttributesKey> = JadeSyntaxHighlighter::class.java.getDeclaredField("ATTRIBUTES") //::ATTRIBUTES.javaField
//        ATTRIBUTES.put(token, value)
        //super.javaClass::ATTRIBUTES
//        ::ATTRIBUTES.get()?.putIfAbsent(null, null)
    }
}
