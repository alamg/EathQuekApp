package com.cou.cse.alamgir.eathquekapp.Network;

import com.cou.cse.alamgir.eathquekapp.Model.EarthQuake;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
  @GET("fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02")
    Call<EarthQuake> getAllData();
}
