package com.example.android.tourguide;

public class CityObjects {

    private String mTittle;

    private String mInfo;

    private int mImage;

    public CityObjects(String tittle, String info, int image) {

        mTittle = tittle;
        mInfo = info;
        mImage = image;
    }

    public String getmTittle() {
        return mTittle;
    }

    public String getmInfo() {
        return mInfo;
    }

    public int getmImage() {
        return mImage;
    }
}
