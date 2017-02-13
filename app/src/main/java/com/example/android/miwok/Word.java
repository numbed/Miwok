package com.example.android.miwok;

/**
 * Created by Nikola Rashkov on 9/2/2017.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    //Default translation of the word
    private String mDefaultTranslation;
    //Miwok translation of the word
    private String mMiwokTranslation;
    //Image resource ID for translated word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create new Word object
     *
     * @param defaultTranslation is the word in a familiar language (english in this case)
     * @param miwokTranslation   is the word translated in Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Create new Word object
     *
     * @param defaultTranslation is the word in a familiar language (english in this case)
     * @param miwokTranslation   is the word translated in Miwok language
     * @param imageResourceId    what is says
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Return whether or not there is an image for the word
    public boolean hasImage() {
       return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
