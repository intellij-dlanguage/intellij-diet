package com.singingbush.plugins.diet

import com.intellij.lang.javascript.highlighting.IntentionAndInspectionFilter
import com.intellij.lang.javascript.index.IndexedFileTypeProvider
import com.intellij.openapi.fileTypes.FileType

/**
 * @author Samael Bate (singingbush)
 * created on 02/05/2017
 */
class DlangInDietInspectionFilter : IntentionAndInspectionFilter() // LayeredLexer()


class DlangInDietIndexedFileTypeProvider : IndexedFileTypeProvider {
    override fun getFileTypesToIndex(): Array<FileType> = arrayOf(DietFileType)
}
