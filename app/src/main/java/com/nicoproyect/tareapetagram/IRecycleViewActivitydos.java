package com.nicoproyect.tareapetagram;

import com.nicoproyect.tareapetagram.adapter.MascotaAdaptador;
import com.nicoproyect.tareapetagram.pojo.Mascota;

import java.util.ArrayList;

public interface IRecycleViewActivitydos {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascota);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);

}
