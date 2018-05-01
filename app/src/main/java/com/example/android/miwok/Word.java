package com.example.android.miwok;

public class Word {
    String miwokTranslation;
    String  defaultTranslation;
    private int imageID;

    public Word(String defaultTranslation1, String miwokTranslation1){
         defaultTranslation = defaultTranslation1;
         miwokTranslation = miwokTranslation1;
    }

    public Word(String defaultTranslation1, String miwokTranslation1, int imageID1){
        defaultTranslation = defaultTranslation1;
        miwokTranslation = miwokTranslation1;
        imageID = imageID1;
    }


    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourceID() { return imageID; }
}
