package com.example.android.miwok;

/**
 * Created by Nirmal Joshua Laptop on 10/25/2016.
 */

public class Word {
    private String mDefaultWord;
    private String mMiwokWord;

    public Word(String defaultWord, String miwokWord) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
    }

    public String getDefaultWords() {
        return mDefaultWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }
}
