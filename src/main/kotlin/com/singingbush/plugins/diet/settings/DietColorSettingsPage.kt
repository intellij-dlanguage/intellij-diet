package com.singingbush.plugins.diet.settings

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import com.singingbush.plugins.diet.DietFileType
import com.singingbush.plugins.diet.highlighting.DietSyntaxHighlighter
import javax.swing.Icon

/**
 * @author Samael Bate (singingbush)
 * created on 23/07/17
 */
class DietColorSettingsPage : ColorSettingsPage {

    private companion object {
        val ATTRIBUTE_DESCRIPTORS = arrayOf(
            AttributesDescriptor("Line Comment", DietSyntaxHighlighter.LINE_COMMENT),
            AttributesDescriptor("Block Comment", DietSyntaxHighlighter.BLOCK_COMMENT),
            AttributesDescriptor("String", DietSyntaxHighlighter.STRING),
            AttributesDescriptor("Number", DietSyntaxHighlighter.NUMBER),
            AttributesDescriptor("Keyword", DietSyntaxHighlighter.KEYWORD)
        )

        val ATTRIBUTES_KEY_MAP = hashMapOf(
            "KEYWORD" to DietSyntaxHighlighter.KEYWORD
        )
    }

    override fun getHighlighter(): SyntaxHighlighter = DietSyntaxHighlighter()

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey> = ATTRIBUTES_KEY_MAP

    override fun getIcon(): Icon? = DietFileType.icon

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = ATTRIBUTE_DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName(): String = DietFileType.name

    override fun getDemoText(): String = """doctype html
html
    head
        title D statement test
    body
        - import std.algorithm : min;
        p Four items ahead:
        - foreach( i; 0 .. 4 )
            - auto num = i+1;
            p Item
                b= num
        p Prints 8:
        p= min(10, 2*6, 8)"""
}
