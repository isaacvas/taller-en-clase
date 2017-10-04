package com.example.android.calsadozxy;

/**
 * Created by android on 03/10/2017.
 */

public class Metodos {
    public static double zapatos(int cantidad, boolean hombre, boolean mujer, boolean zapatilla, boolean clasico, boolean nike, boolean adidas, boolean puma) {
        double resultado = 0;
        if (hombre == true && zapatilla == true && nike == true) {
            resultado = cantidad * 120000;
        } else if (hombre == true && zapatilla == true && adidas == true) {
            {
                resultado = cantidad * 140000;
            }
        } else if (hombre == true && zapatilla == true && puma == true) {
            {
                resultado = cantidad * 130000;
            }
        } else if (hombre == true && clasico == true && nike == true) {
            {
                resultado = cantidad * 50000;
            }
        } else if (hombre == true && clasico == true && adidas == true) {
            {
                resultado = cantidad * 80000;
            }
        } else if (hombre == true && clasico == true && puma == true) {
            {
                resultado = cantidad * 100000;
            }
        } else if (mujer == true && zapatilla == true && nike == true) {
            {
                resultado = cantidad * 100000;
            }
        } else if (mujer == true && zapatilla == true && adidas == true) {
            {
                resultado = cantidad * 130000;
            }
        } else if (mujer == true && zapatilla == true && puma == true) {
            {
                resultado = cantidad * 110000;
            }
        } else if (mujer == true && clasico == true && nike == true) {
            {
                resultado = cantidad * 60000;
            }
        } else if (mujer == true && clasico == true && adidas == true) {
            {
                resultado = cantidad * 70000;
            }
        } else if (mujer == true && clasico == true && puma == true) {
            {
                resultado = cantidad * 120000;
            }
        }


        return resultado;
    }
}
