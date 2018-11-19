package com.idn.avocadocode.doashahih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DoaQuran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doaquran);
    }

    public void btn_dqhud(View view) {
        Intent intent = new Intent(DoaQuran.this,DqHud.class);
        startActivity(intent);
    }

    public void btn_dqdoaagartermasukorangberiman(View view) {
        Intent intent = new Intent(DoaQuran.this,DqDoaagartob.class);
        startActivity(intent);
    }

    public void btn_doaistiqomah(View view) {
        Intent intent = new Intent(DoaQuran.this,DoaIstiqomah.class);
        startActivity(intent);
    }

    public void btn_doakebaikanduniadanakhirat(View view) {
        Intent intent = new Intent(DoaQuran.this,DoaKebaikanDuniaAkhirat.class);
        startActivity(intent);
    }

    public void btn_doaamalperbuatanditerima(View view) {
        Intent intent = new Intent(DoaQuran.this,DoaAmalPerbuatanAgarDiterima.class);
        startActivity(intent);
    }
}