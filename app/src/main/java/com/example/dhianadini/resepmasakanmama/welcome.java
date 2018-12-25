package com.example.dhianadini.resepmasakanmama;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class welcome extends AppCompatActivity {

    Button btn1,btn2, btn3;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btn1 = findViewById(R.id.buttonfood);
        btn2 = findViewById(R.id.buttondrink);
        btn3 = findViewById(R.id.buttondessert);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MakananFragment fmkn = new MakananFragment();
                gantiFragment(fmkn);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MinumanFragment fmin =  new MinumanFragment();
                gantiFragment(fmin);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DessertFragment fdes =  new DessertFragment();
                gantiFragment(fdes);
            }
        });
    }

    public void gantiFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //setelah punya fragment baru bisa tambah
        ft.add(R.id.framefragment,fragment);
        ft.commit();
    }
}
