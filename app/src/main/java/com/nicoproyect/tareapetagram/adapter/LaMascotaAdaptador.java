package com.nicoproyect.tareapetagram.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nicoproyect.tareapetagram.pojo.LaMascota;
import com.nicoproyect.tareapetagram.R;

import java.util.ArrayList;

public class LaMascotaAdaptador extends RecyclerView.Adapter<LaMascotaAdaptador.LaMascotaViewHolder> {

    ArrayList<LaMascota> lamascota;
    Activity activity;

    public LaMascotaAdaptador (ArrayList<LaMascota> lamascota, Activity activity){
        this.lamascota = lamascota;
        this.activity = activity;
    }

    @NonNull
    @Override
    public LaMascotaAdaptador.LaMascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_la_mascota,parent, false);
        return new LaMascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LaMascotaViewHolder lamascota1ViewHolder , int position) {
        final LaMascota lamascota1 = lamascota.get(position);
        lamascota1ViewHolder.imgFoto.setImageResource(lamascota1.getFotoM());
        lamascota1ViewHolder.tvNombreCV.setText(lamascota1.getNombreM());
        lamascota1ViewHolder.nRaiting.setText(lamascota1.getRaitingM());

    }

    @Override
    public int getItemCount() {
        return lamascota.size();
    }

    public static class LaMascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvNombreCV;
        private TextView nRaiting;
        private ImageButton btnstrar;

        public LaMascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            tvNombreCV = itemView.findViewById(R.id.tvNombreCV);
            nRaiting = itemView.findViewById(R.id.nRaiting);
            btnstrar = itemView.findViewById(R.id.btnStar);
        }
    }
}
