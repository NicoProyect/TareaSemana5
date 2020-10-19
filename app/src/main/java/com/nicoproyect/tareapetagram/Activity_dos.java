package com.nicoproyect.tareapetagram;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.nicoproyect.tareapetagram.adapter.MascotaAdaptador;
import com.nicoproyect.tareapetagram.pojo.Mascota;
import com.nicoproyect.tareapetagram.presentador.IRecycleViewActivitydosPresente;
import com.nicoproyect.tareapetagram.presentador.RecycleViewActivitydosPresentador;

import java.util.ArrayList;

public class Activity_dos extends AppCompatActivity implements IRecycleViewActivitydos {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private IRecycleViewActivitydosPresente presenter;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        androidx.appcompat.widget.Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBardos);
        setSupportActionBar(miActionBar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);


        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        presenter = new RecycleViewActivitydosPresentador(this, context);

    }

    /*
    public void inicializarListaMascotas(){
        mascotas2 = new ArrayList<Mascota>();

        mascotas2.add(new Mascota(R.drawable.can1, "Pipo","2"));
        mascotas2.add(new Mascota(R.drawable.can2, "Rex","3"));
        mascotas2.add(new Mascota(R.drawable.can1, "Milu","4"));
        mascotas2.add(new Mascota(R.drawable.can2, "Cata","5"));
        mascotas2.add(new Mascota(R.drawable.can1, "Frog","1"));
        mascotas2.add(new Mascota(R.drawable.can1, "Tomi","0"));
        mascotas2.add(new Mascota(R.drawable.can1, "Sara","0"));


    }*/

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascota) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);

    }
}
