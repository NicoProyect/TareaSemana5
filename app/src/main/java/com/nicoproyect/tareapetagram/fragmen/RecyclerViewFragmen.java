package com.nicoproyect.tareapetagram.fragmen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nicoproyect.tareapetagram.pojo.Mascota;
import com.nicoproyect.tareapetagram.R;
import com.nicoproyect.tareapetagram.adapter.MascotaAdaptador;

import java.util.ArrayList;

public class RecyclerViewFragmen extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragmen_recyclerview,container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);


        inicializarListaMascotas();
        inicializarAdaptador();


        return v;
    }
    public MascotaAdaptador adaptador;
    private void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.can1, "Pipo","2"));
        mascotas.add(new Mascota(R.drawable.can2, "Rex","3"));
        mascotas.add(new Mascota(R.drawable.can1, "Milu","4"));
        mascotas.add(new Mascota(R.drawable.can2, "Cata","5"));
        mascotas.add(new Mascota(R.drawable.can1, "Frog","1"));
    }
}
