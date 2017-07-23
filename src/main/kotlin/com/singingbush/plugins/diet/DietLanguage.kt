package com.singingbush.plugins.diet

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.psi.templateLanguages.TemplateLanguage
import com.jetbrains.plugins.jade.JadeLanguage

/**
 * @author Samael Bate (singingbush)
 * created on 02/05/2017
 */
object DietLanguage : Language(JadeLanguage.INSTANCE, "diet"), TemplateLanguage {

    override fun getAssociatedFileType(): LanguageFileType? = DietFileType

//    override fun getDialects(): MutableList<Language> {
//        return super.getDialects()
//    }

    override fun isCaseSensitive(): Boolean = true

    //override fun getBaseLanguage(): Language? = JadeLanguage.INSTANCE // not sure about doing this

    override fun getDisplayName(): String = "Diet Template"
}
