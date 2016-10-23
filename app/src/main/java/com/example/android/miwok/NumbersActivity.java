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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words=new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");
       /* String temp="";
        for (int i=0;i<=words.size()-1;i++){
            LinearLayout wordsLinear =(LinearLayout) findViewById(R.id.numbersLinearView);
            TextView wordsTextView=new TextView(this);
            wordsTextView.setText(words.get(i));
            wordsTextView.setGravity(1);
            wordsLinear.addView(wordsTextView);
           // temp=temp + "\n" +words.get(i);
            Log.v("wordPositions","The word in the"+i+"th position is"+words.get(i));
        }
       // TextView numbers= (TextView)findViewById(R.id.NumbersWorsListView);
       //numbers.setText(temp);
       */
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,words);
        ListView listView =(ListView)findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

    }
}
