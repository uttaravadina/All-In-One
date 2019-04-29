/*
 * Copyright (C) 2019 skydoves
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skydoves.allinone.persistence.room.converter

import androidx.room.TypeConverter
import org.threeten.bp.OffsetDateTime
import org.threeten.bp.format.DateTimeFormatter

object TimeStampConverter {
  private val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME

  @TypeConverter
  @JvmStatic
  fun toOffsetDateTime(value: String?): OffsetDateTime? {
    return value?.let {
      return formatter.parse(value, OffsetDateTime::from)
    }
  }

  @TypeConverter
  @JvmStatic
  fun fromOffsetDateTime(date: OffsetDateTime?): String? {
    return date?.format(formatter)
  }
}
