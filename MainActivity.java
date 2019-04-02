package com.codepolitan.myapplication4fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new FragmentPertama()).commit();

    }

    public void tampilPertama(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FragmentPertama()).commit();
    }
    public void tampilKedua (View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new FragmentKedua()).commit();
    }
    public void tampilKetiga (View view){
        Fragment fragmentTiga = new FragmentKetiga();
        Bundle bundle = new Bundle();
        bundle.putString("kunci","Tulisan yang mau dikirim");
        fragmentTiga.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragmentTiga).commit();
    }
}
