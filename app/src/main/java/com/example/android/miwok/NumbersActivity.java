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
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] words=new String[10];
        words[0]="One";
        words[1]="Two";
        words[2]="Three";
        words[3]="Four";
        words[4]="Five";
        words[5]="Six";
        words[6]="Seven";
        words[7]="Eight";
        words[8]="Nine";
        words[9]="Ten";
        String temp="Firstinit";
        for (int i=0;words.length<=0;i++){
            temp=temp + "\n" +words[i];
            Log.d("MyTag","Inside For");
        }

        //Log.d("MyTag","value is"+temp);

        //TextView numbers= (TextView)findViewById(R.id.NumbersWorsListView);
       // numbers.setText(temp);
    }
}
