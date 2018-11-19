package com.idn.avocadocode.doashahih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DoaHadist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doahadist);
    }

    public void btn_doaditetapkanhatidalamiman(View view) {
        Intent intent = new Intent(DoaHadist.this,DoaDitetapkan.class);
        startActivity(intent);
    }

    public void btn_doampunandarisegalahal(View view) {
        Intent intent = new Intent(DoaHadist.this,DoaDiampuni.class);
        startActivity(intent);
    }

    public void btn_mohondiperbaikidalamsegalahal(View view) {
        Intent intent = new Intent(DoaHadist.this,DoaDiperbaiki.class);
        startActivity(intent);
    }

    public void btn_doafitnahkayamiskin(View view) {
        Intent intent = new Intent(DoaHadist.this,DoaPerlindungan.class);
        startActivity(intent);
    }

    public void btn_doaperlindungandicabutnikmatlahirbatin(View view) {
        Intent intent = new Intent(DoaHadist.this,DoaPerlindunganDicabut.class);
        startActivity(intent);
    }
}