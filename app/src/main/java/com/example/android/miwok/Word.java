package com.example.android.miwok;

public class Word {
    String miwokTranslation;
    String  defaultTranslation;

    public Word(String defaultTranslation1, String miwokTranslation1){
         defaultTranslation = defaultTranslation1;
         miwokTranslation = miwokTranslation1;
     }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
}
