package com.example.android.miwok;
public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    public static final int NO_IMAGE_PROVIDED = -1;

    public word(String defaultTranslation,String miwokTranslation)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }
    public word(String defaultTranslation,String miwokTranslation,int imageResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId = imageResourceId;
    }
public String getMiwokTranslation(){return mDefaultTranslation;}
    public String getDefaultTranslation(){return mMiwokTranslation;}
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
