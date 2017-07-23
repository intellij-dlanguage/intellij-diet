package com.singingbush.plugins.diet.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.singingbush.plugins.diet.DietFileType
import com.singingbush.plugins.diet.DietLanguage

/**
 * @author Samael Bate (singingbush)
 * created on 22/07/17
 */
class DietFile(provider: FileViewProvider) : PsiFileBase(provider, DietLanguage) {
    override fun getFileType(): FileType = DietFileType
}
