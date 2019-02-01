package com.cou.cse.alamgir.eathquekapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.cou.cse.alamgir.eathquekapp.Adapter.Fetureadapter;
import com.cou.cse.alamgir.eathquekapp.Model.EarthQuake;
import com.cou.cse.alamgir.eathquekapp.Model.EarthQuakeFeatures;
import com.cou.cse.alamgir.eathquekapp.Model.EarthQuakeFeaturesProperties;
import com.cou.cse.alamgir.eathquekapp.Network.ApiClient;
import com.cou.cse.alamgir.eathquekapp.Network.ApiInterface;

import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
     ApiInterface apiInterface;
     TextView textView;
     RecyclerView recyclerView;
     Fetureadapter adapter;
     RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        apiInterface= ApiClient.getRetrofit().create(ApiInterface.class);
        Call<EarthQuake> call=apiInterface.getAllData();
        call.enqueue(new Callback<EarthQuake>() {
            @Override
            public void onResponse(Call<EarthQuake> call, Response<EarthQuake> response) {
                EarthQuake earthQuake=response.body();
                adapter=new Fetureadapter(Arrays.asList(earthQuake.getFeatures()),MainActivity.this);
                recyclerView.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<EarthQuake> call, Throwable t) {
               Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
