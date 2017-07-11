/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<word> words=new ArrayList<word>();
        words.add(new word("one","lutti"));
        words.add(new word("two","otiiko"));
        words.add(new word("three","tolookosu"));
        words.add(new word("four","oyyisa"));
        words.add(new word("five","massokka"));
        words.add(new word("six","temmokaa"));
        words.add(new word("seven","kenekaku"));
        words.add(new word("eight","kawinta"));
        words.add(new word("nine","wo'e"));
        words.add(new word("ten","na'accha"));

        WordAdapter adapter =new WordAdapter(this,words);
        ListView hh =(ListView) findViewById(R.id.listview);
        hh.setAdapter(adapter);
    }
}
