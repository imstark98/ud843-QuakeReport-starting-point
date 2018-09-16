package com.example.android.quakereport;

public class Earthquake {

    // Magnitude of the earthquake
    private String mMagnitude;

    // Location of the eathquake
    private String mLocation;

    // Date of the earthquake
    private String mDate;

    public Earthquake(String magnitude, String location, String date)
    {
        mMagnitude=magnitude;
        mLocation=location;
        mDate=date;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
}
