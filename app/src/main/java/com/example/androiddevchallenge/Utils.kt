/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringArrayResource
import com.example.androiddevchallenge.model.Puppy

object Utils {
    private val images = arrayListOf(
        R.drawable.puppy_1,
        R.drawable.puppy_2,
        R.drawable.puppy_3,
        R.drawable.puppy_4,
        R.drawable.puppy_5,
        R.drawable.puppy_6,
        R.drawable.puppy_7,
        R.drawable.puppy_8,
        R.drawable.puppy_9,
        R.drawable.puppy_10
    )

    @Composable
    fun getPuppies(): MutableList<Puppy> {
        val puppies: MutableList<Puppy> = mutableListOf()
        val puppyBreeds = stringArrayResource(R.array.breed)
        val puppyDesc = stringArrayResource(R.array.desc)
        for (i in puppyBreeds.indices) {
            puppies.add(Puppy(puppyBreeds[i], images[i], puppyDesc[i]))
        }
        return puppies
    }

    @Composable
    fun getPuppy(pos: Int): Puppy {
        val puppyBreed = stringArrayResource(R.array.breed)
        val puppyDesc = stringArrayResource(R.array.desc)
        return Puppy(puppyBreed[pos], images[pos], puppyDesc[pos])
    }
}
