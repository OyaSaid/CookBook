package com.oyaness.cookbook.cache.db.converter

import androidx.room.TypeConverter
import java.util.*

/**
 * @author Oya
 * @date 29.12.2021
 */
internal object ListTypeConverter {
    @JvmStatic
    @TypeConverter
    fun fromStringList(list: List<String>?): String? = list?.joinToString(separator = ",")

    @JvmStatic
    @TypeConverter
    fun toStringList(string: String?) = string?.split(",")

    @JvmStatic
    @TypeConverter
    fun fromDate(date : Date?) :Long? =
        date?.time

    @JvmStatic
    @TypeConverter
    fun toDate(value:Long?) : Date? {
        return if (value == null){
            null
        } else {
            Date(value)
        }
    }
}