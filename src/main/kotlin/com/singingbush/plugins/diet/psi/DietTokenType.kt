package com.singingbush.plugins.diet.psi

import com.intellij.psi.tree.IElementType
import com.singingbush.plugins.diet.DietLanguage

/**
 * @author Samael Bate (singingbush)
 * created on 22/07/17
 */
class DietTokenType(name: String) : IElementType(name, DietLanguage) {

    companion object {
        @JvmField val TEXT: IElementType = DietTokenType("TEXT")
        @JvmField val EMPTY: IElementType = DietTokenType("EMPTY")
        @JvmField val INDENT: IElementType = DietTokenType("INDENT")
        @JvmField val HTML_ATTR_LIST: IElementType = DietTokenType("HTML_ATTR_LIST")
    }
}
