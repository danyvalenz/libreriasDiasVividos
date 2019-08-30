package com.cedisropa.libreriadiasvividos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calendar cal = new GregorianCalendar(1988, Calendar.OCTOBER, 27);

        int dias =  DiasVividos.obtener(1988,10,27);
        dias = 0;
    }
}
