package com.singingbush.plugins.diet.psi

import com.intellij.psi.tree.IElementType
import com.singingbush.plugins.diet.DietLanguage

/**
 * @author Samael Bate (singingbush)
 * created on 22/07/17
 */
class DietTokenType(name: String) : IElementType(name, DietLanguage) {

    companion object {
        @JvmField val TEXT: IElementType = DietTokenType("TEXT") // JadeTokenTypes.TEXT
        @JvmField val EMPTY: IElementType = DietTokenType("EMPTY")
        @JvmField val INDENT: IElementType = DietTokenType("INDENT") // JadeTokenTypes.INDENT
        @JvmField val HTML_ATTR_LIST: IElementType = DietTokenType("HTML_ATTR_LIST")

//        @JvmField val DIET_CODE_BLOCK: IElementType = JadeTokenTypes.JSInJadeEmbeddedElementType()
//
//        @JvmField val CONTENT_LINE: IElementType = DietTokenType("content_line")
//        @JvmField val HTML_NODE: IElementType = DietTokenType("html_node")
//        @JvmField val HTML_ATTR: IElementType = DietTokenType("html_attr")
//        @JvmField val HTML_IDENT: IElementType = DietTokenType("html_ident")
//        @JvmField val HTML_TAG: IElementType = DietTokenType("html_tag")

//        @JvmField val AAAA: IElementType = DietTokenType("html_arrt_list")
//
//        @JvmField val AAAA: IElementType = DietTokenType("text_node")
//        @JvmField val AAAA: IElementType = DietTokenType("comment_node")
//        @JvmField val AAAA: IElementType = DietTokenType("special_node")
//        @JvmField val AAAA: IElementType = DietTokenType("code_node")
//        @JvmField val AAAA: IElementType = DietTokenType("block_node")
//        @JvmField val AAAA: IElementType = DietTokenType("include_node")
//        @JvmField val AAAA: IElementType = DietTokenType("node_content")
//        @JvmField val AAAA: IElementType = DietTokenType("string")
//        @JvmField val AAAA: IElementType = DietTokenType("letter")
//        @JvmField val AAAA: IElementType = DietTokenType("digit")
        @JvmField val OPT_WS: IElementType = DietTokenType("OPT_WS")
    }
}
