package com.techzade.tourdemumbai;

public class Place {

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;
    /** Name of the place */
    private String mName;
    /** Opening & Closing Time of the place */
    private String mTime;
    /** Phone no provided for the place (if any) */
    private String mPhoneNo;
    /** Address provided for the place */
    private String mAddress;
    /** Website link provided for the place (if any) */
    //private String mWebsite;
    /** Short Description for the place */
    private String mShortDescription;
    /** Image resource ID for the place */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Place(String name, String time, String phoneNo, String address, String shortDescription, int imageResourceId){
        this.mName = name;
        this.mTime = time;
        this.mPhoneNo = phoneNo;
        this.mAddress = address;
        //this.mWebsite = website;
        this.mShortDescription = shortDescription;
        this.mImageResourceId = imageResourceId;
    }

    public Place(String name, String shortDescription, int imageResourceId){
        this.mName = name;
        this.mShortDescription = shortDescription;
        this.mImageResourceId = imageResourceId;
    }

    public String getmName() {
        return mName;
    }

    public String getmTime() {
        return mTime;
    }

    public String getmPhoneNo() {
        return mPhoneNo;
    }

    public String getmAddress() {
        return mAddress;
    }

    /*public String getmWebsite() {
        return mWebsite;
    }*/

    public String getmShortDescription() {
        return mShortDescription;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
