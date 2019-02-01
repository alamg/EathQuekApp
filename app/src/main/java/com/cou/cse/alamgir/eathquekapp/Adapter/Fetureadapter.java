package com.cou.cse.alamgir.eathquekapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cou.cse.alamgir.eathquekapp.MapsActivity;
import com.cou.cse.alamgir.eathquekapp.Model.EarthQuakeFeatures;
import com.cou.cse.alamgir.eathquekapp.R;

import org.w3c.dom.Text;

import java.util.List;

public class Fetureadapter extends RecyclerView.Adapter<Fetureadapter.MyviewHoder> {
    Context context;
    List<EarthQuakeFeatures> features;
    public Fetureadapter(List<EarthQuakeFeatures> features, @NonNull Context context) {
        this.features=features;
        this.context=context;
    }

    @NonNull
    @Override
    public MyviewHoder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(context).inflate(R.layout.showdata,viewGroup,false);

        return new MyviewHoder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHoder myviewHoder, int i) {
             myviewHoder.tvmag.setText(String.valueOf(features.get(i).getProperties().getMag()));
             //myviewHoder.tvplace.setText(String.valueOf(features.get(i).getProperties().getPlace()));
             double db[]=features.get(i).getGeometry().getCoordinates();
             final double lat=db[0];
             final double lan=db[1];
             myviewHoder.tvplace.setText(String.valueOf(features.get(i).getProperties().getPlace()));
             myviewHoder.tvplace.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Intent intent=new Intent(context, MapsActivity.class);
                     intent.putExtra("lat",lat);
                     intent.putExtra("lan",lan);
                     context.startActivity(intent);
                 }
             });

    }

    @Override
    public int getItemCount() {
        return features.size();
    }

    public static class MyviewHoder extends RecyclerView.ViewHolder{
        public TextView tvplace, tvmag;

       public MyviewHoder(@NonNull View itemView) {
           super(itemView);
           tvplace=itemView.findViewById(R.id.place);
           tvmag=itemView.findViewById(R.id.mag);

       }
   }
}
