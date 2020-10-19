package com.nicoproyect.tareapetagram.db;

import android.content.Context;

import com.nicoproyect.tareapetagram.R;
import com.nicoproyect.tareapetagram.pojo.Mascota;

import java.util.ArrayList;

public class ConstructorMascotas {

    private Context context;
    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){
        ArrayList<Mascota> mascotas = new ArrayList<>();

        mascotas.add(new Mascota(R.drawable.can1, "Pipo","2"));
        mascotas.add(new Mascota(R.drawable.can2, "Rex","3"));
        mascotas.add(new Mascota(R.drawable.can1, "Milu","4"));
        mascotas.add(new Mascota(R.drawable.can2, "Cata","5"));
        mascotas.add(new Mascota(R.drawable.can1, "Frog","1"));
        mascotas.add(new Mascota(R.drawable.can1, "Tomi","0"));
        mascotas.add(new Mascota(R.drawable.can1, "Sara","0"));
        return mascotas;
    }
}
