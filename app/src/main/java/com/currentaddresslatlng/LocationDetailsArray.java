package com.currentaddresslatlng;

import com.google.gson.annotations.SerializedName;

public class LocationDetailsArray {

    @SerializedName("formatted_address")
    String formatted_address;


    @SerializedName("place_id")
    String place_id;

    public String getFormatted_address() {
        return formatted_address;
    }

    public String getPlace_id() {
        return place_id;
    }
}
