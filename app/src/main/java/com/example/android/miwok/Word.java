package com.example.android.miwok;

public class Word {
    String miwokTranslation;
    String  defaultTranslation;
    private int rawSoundId = -1;
    private int imageID = -1;

    public Word(String defaultTranslation1, String miwokTranslation1, int mRawSoundId){
         defaultTranslation = defaultTranslation1;
         miwokTranslation = miwokTranslation1;
         rawSoundId = mRawSoundId;
    }

    public Word(String defaultTranslation1, String miwokTranslation1, int imageID1, int mRawSoundId){
        defaultTranslation = defaultTranslation1;
        miwokTranslation = miwokTranslation1;
        imageID = imageID1;
        rawSoundId = mRawSoundId;
    }


    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourceID() { return imageID; }

    public int getRawSoundId() { return rawSoundId; }

    @Override
    public String toString() {
        return "Word{" +
                "miwokTranslation='" + miwokTranslation + '\'' +
                ", defaultTranslation='" + defaultTranslation + '\'' +
                ", rawSoundId=" + rawSoundId +
                ", imageID=" + imageID +
                '}';
    }
}
