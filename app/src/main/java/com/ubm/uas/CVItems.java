package com.ubm.uas;

public class CVItems {
    private int mImageResource;
    private String mText1;

    public CVItems(int imageResource, String text1){
        mImageResource = imageResource;
        mText1 = text1;
    }

    public int getImageResource(){
        return mImageResource;
    }
    public String getText(){
        return mText1;
    }
}
