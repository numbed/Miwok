package com.example.android.miwok;

/**
 * Created by Nikola Rashkov on 9/2/2017.
 */

public class Word {
    //Default translation of the word
    private String mDefaultTranslation;

    //Miwok translation of the word
    private String mMiwokTranslation;

    /**
     * Create new Word object
     * @param defaultTranslation is the word in a familiar language (english in this case)
     * @param miwokTranslation is the word translated in Miwok language
     */
    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
