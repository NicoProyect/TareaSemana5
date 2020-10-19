package com.nicoproyect.tareapetagram.fragmen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nicoproyect.tareapetagram.pojo.LaMascota;
import com.nicoproyect.tareapetagram.R;
import com.nicoproyect.tareapetagram.adapter.LaMascotaAdaptador;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerfilMascotaFragmen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerfilMascotaFragmen extends Fragment {

    private ArrayList<LaMascota> lamascota;
    private RecyclerView listaLaMascota;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PerfilMascotaFragmen() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerfilMascota.
     */
    // TODO: Rename and change types and number of parameters
    public static PerfilMascotaFragmen newInstance(String param1, String param2) {
        PerfilMascotaFragmen fragment = new PerfilMascotaFragmen();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_perfil_mascota, container, false);
        View v = inflater.inflate(R.layout.fragment_perfil_mascota,container, false);

        listaLaMascota = (RecyclerView) v.findViewById(R.id.rvLaMascota);

        //LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.VERTICAL);
        //listaLaMascota.setLayoutManager(llm);
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 2);
        listaLaMascota.setLayoutManager(glm);
        inicializarListaLaMascota();
        inicializarAdaptador2();


        return v;
    }
    public LaMascotaAdaptador adaptador;
    private void inicializarAdaptador2(){
        adaptador = new LaMascotaAdaptador(lamascota, getActivity());
        listaLaMascota.setAdapter(adaptador);
    }
    public void inicializarListaLaMascota(){
        lamascota = new ArrayList<LaMascota>();
       // mascotas = new ArrayList<Mascota>();

        lamascota.add(new LaMascota(R.drawable.can1, "Pipo","2"));
        lamascota.add(new LaMascota(R.drawable.can1, "Pipo","3"));
        lamascota.add(new LaMascota(R.drawable.can1, "Pipo","5"));
        lamascota.add(new LaMascota(R.drawable.can1, "Pipo","9"));
        lamascota.add(new LaMascota(R.drawable.can1, "Pipo","8"));

    }
}