/*
 * Copyright lt 2022
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lt.compose_views.other

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * creator: lt  2021/4/13  lt.dygzs@qq.com
 * effect : 间隔view
 * warning:
 */

/**
 * 设置横向间隔dp
 */
@Composable
fun HorizontalSpace(dp: Int) {
    Spacer(Modifier.width(dp.dp))
}

/**
 * 设置竖向间隔dp
 */
@Composable
fun VerticalSpace(dp: Int) {
    Spacer(Modifier.height(dp.dp))
}