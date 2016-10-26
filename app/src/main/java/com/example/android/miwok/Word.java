package com.example.android.miwok;

/**
 * Created by Nirmal on 10/26/2016.
 */

public class Word {

    private String mDefaultWord;
    private String mMiwokWord;

    public Word(String defaultWord,String miwokWord) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
    }

        public String getDefaultWord(){
        return mDefaultWord;
    }
        public  String getmMiwokWord(){
            return mMiwokWord;
    }
}
