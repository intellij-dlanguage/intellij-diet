package com.singingbush.plugins.diet

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

/**
 * @author Samael Bate (singingbush)
 * created on 02/05/2017
 */
object DietFileType : LanguageFileType(DietLanguage) {
    override fun getIcon(): Icon = IconLoader.getIcon("/icons/vibe-d.png", DietFileType::class.java) // JadeIcons.Pug
    override fun getName(): String = "Diet"
    override fun getDefaultExtension(): String = "dt"
    override fun getDescription(): String = "Diet template language"
}
