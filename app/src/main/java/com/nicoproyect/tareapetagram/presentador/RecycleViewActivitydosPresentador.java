package com.nicoproyect.tareapetagram.presentador;

import android.content.Context;

import com.nicoproyect.tareapetagram.IRecycleViewActivitydos;
import com.nicoproyect.tareapetagram.adapter.MascotaAdaptador;
import com.nicoproyect.tareapetagram.db.ConstructorMascotas;
import com.nicoproyect.tareapetagram.pojo.Mascota;

import java.util.ArrayList;

public class RecycleViewActivitydosPresentador implements IRecycleViewActivitydosPresente{

    private  IRecycleViewActivitydos iRecycleViewActivitydos;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecycleViewActivitydosPresentador(IRecycleViewActivitydos iRecycleViewActivitydos, Context context){
        this.iRecycleViewActivitydos = iRecycleViewActivitydos;
        this.context = context;
        obtenerMascotasBaseDatos();

    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarMascotasRV();

    }

    @Override
    public void mostrarMascotasRV() {
        iRecycleViewActivitydos.inicializarAdaptadorRV(iRecycleViewActivitydos.crearAdaptador(mascotas));
        iRecycleViewActivitydos.generarLinearLayoutVertical();

    }
}