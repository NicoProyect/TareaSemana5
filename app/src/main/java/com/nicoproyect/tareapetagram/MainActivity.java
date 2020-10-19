package com.nicoproyect.tareapetagram;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;
import com.nicoproyect.tareapetagram.adapter.PageAdapter;
import com.nicoproyect.tareapetagram.fragmen.PerfilMascotaFragmen;
import com.nicoproyect.tareapetagram.fragmen.RecyclerViewFragmen;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageButton btnStar;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        setUpViewPager();

        btnStar = (ImageButton) findViewById(R.id.btnStar);

        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Activity_dos.class);
                startActivity(i);
            }
        });


        //Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionBar);

        if (toolbar != null){
            setSupportActionBar(toolbar);
        }

    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment>fragments = new ArrayList<>();

        fragments.add(new RecyclerViewFragmen());
        fragments.add(new PerfilMascotaFragmen());

        return fragments;

    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_mascota);



    }

}