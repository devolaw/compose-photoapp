/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package compose.photoapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FeedHeader() {
    Surface(
        color = MaterialTheme.colors.onSurface,
        contentColor = MaterialTheme.colors.surface
    ) {
        Column {
            Spacer(modifier = Modifier.size(24.dp))
            Text(
                text = "Hello,",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(start = 16.dp)
            )
            Text(
                text = "Alice",
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 16.dp)
            )
            Spacer(modifier = Modifier.size(16.dp))
            RoundedHeader(title = "Your feed")
        }
    }
}
