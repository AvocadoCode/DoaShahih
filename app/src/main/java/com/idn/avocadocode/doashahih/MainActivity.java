package com.idn.avocadocode.doashahih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_doaquran(View view) {
        Intent intent = new Intent(MainActivity.this,DoaQuran.class);
        startActivity(intent);
    }

    public void btn_doahadist(View view) {
        Intent intent = new Intent(MainActivity.this,DoaHadist.class);
        startActivity(intent);
    }
}
