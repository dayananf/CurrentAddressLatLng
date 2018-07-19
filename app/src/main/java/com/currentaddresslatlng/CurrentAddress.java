package com.currentaddresslatlng;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CurrentAddress {

    @SerializedName("status")
    String status;

    @SerializedName("results")
    ArrayList<LocationDetailsArray>locationDetailsArrays;

    public String getStatus() {
        return status;
    }

    public ArrayList<LocationDetailsArray> getLocationDetailsArrays() {
        return locationDetailsArrays;
    }
}
