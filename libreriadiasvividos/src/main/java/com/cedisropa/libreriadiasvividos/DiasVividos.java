package com.cedisropa.libreriadiasvividos;

import java.util.Calendar;
import java.util.Date;

/**
 * Clase encargada de decir los dias que has vivido
 */
public class DiasVividos {

    /**
     * Metodo encargado de obtener los dias vividos
     * @param anio  toma el año de nacimiento
     * @param mes   toma el mes de nacimiento
     * @param dia   toma el dia de nacimiento
     * @return
     */
    public static Integer obtener(int anio,int mes,int dia){
        int diasvidos = 0;


        Calendar currentTime = Calendar.getInstance();

        int anioActual = currentTime.get(Calendar.YEAR);
        int mesActual = currentTime.get(Calendar.MONTH)+1;
        int diasdelMES = currentTime.getActualMaximum(Calendar.DAY_OF_MONTH);
        int diaActual = currentTime.get(Calendar.DATE);

        diasvidos = ((anioActual-anio)*365)+((mesActual-mes)*diasdelMES)+(diaActual-dia);



        return diasvidos;

    }
}
