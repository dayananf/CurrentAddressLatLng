package com.currentaddresslatlng.retrofit;


import com.currentaddresslatlng.CurrentAddress;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface APIService {

    @GET("/maps/api/geocode/json")
    Call<CurrentAddress> getCurrentAddress(
            @Query("latlng") String latlng,
            @Query("sensor") boolean sensor
    );

}
