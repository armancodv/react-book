package com.armanco.reactbook.manager.db

import androidx.room.TypeConverter
import com.armanco.reactbook.model.ElementType

class ElementTypeConverters {

    @TypeConverter
    fun toElementType(value: Int) = enumValues<ElementType>()[value]

    @TypeConverter
    fun fromElementType(value: ElementType) = value.ordinal

}