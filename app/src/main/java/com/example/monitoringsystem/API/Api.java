package com.example.monitoringsystem.API;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("URL")
    Call<MeasurementsResponse> getMeasurement();
}
