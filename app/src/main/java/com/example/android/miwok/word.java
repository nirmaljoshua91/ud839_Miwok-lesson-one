package com.example.android.miwok;

/**
 * Created by Nirmal on 10/26/2016.
 */

public class Word {

    private String mDefaultWord;
    private String mMiwokWord;
    private int mImageResourceID;

    public Word(String defaultWord, String miwokWord) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
    }

    public Word(String defaultWord, String miwokWord, int imageResourceID) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
        mImageResourceID = imageResourceID;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public String getmMiwokWord() {
        return mMiwokWord;
    }

    public int getResourseID() {
        return mImageResourceID;
    }
}
