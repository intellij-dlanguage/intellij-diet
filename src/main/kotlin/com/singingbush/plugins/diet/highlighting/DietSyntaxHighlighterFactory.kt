package com.singingbush.plugins.diet.highlighting

import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CodeStyleSettingsManager

/**
 * @author Samael Bate (singingbush)
 * created on 02/05/17
 */
class DietSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
    override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?): SyntaxHighlighter
        = DietSyntaxHighlighter(
        if (project != null) CodeStyleSettingsManager.getSettings(project)
        else CodeStyleSettings()
    )
}
