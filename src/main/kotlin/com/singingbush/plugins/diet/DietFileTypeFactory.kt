package com.singingbush.plugins.diet

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

/**
 * @author Samael Bate (singingbush)
 * created on 02/05/2017
 */
class DietFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer) {
        consumer.consume(DietFileType, "dt")
    }
}
