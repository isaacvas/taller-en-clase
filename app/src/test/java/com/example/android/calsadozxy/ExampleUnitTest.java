package com.example.android.calsadozxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void condicion1() throws Exception {
        int cantidad = 1;
        boolean hombre = true;
        boolean mujer = false;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean Nike = true;
        boolean Adidas = false;
        boolean Puma = false;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 120000;
        assertEquals(total, valorEsperado, 0);

    }
    @Test
    public void condicion2() throws Exception {
        int cantidad = 1;
        boolean hombre = true;
        boolean mujer = false;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean Nike = false;
        boolean Adidas =true;
        boolean Puma = false;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 140000;
        assertEquals(total, valorEsperado, 0);

    }
    @Test
    public void condicion3() throws Exception {
        int cantidad = 1;
        boolean hombre = true;
        boolean mujer = false;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean Nike = false;
        boolean Adidas =false;
        boolean Puma = true;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 130000;
        assertEquals(total, valorEsperado, 0);

    }
    @Test
    public void condicion4() throws Exception {
        int cantidad = 1;
        boolean hombre = true;
        boolean mujer = false;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean Nike = true;
        boolean Adidas =false;
        boolean Puma = false;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 50000;
        assertEquals(total, valorEsperado, 0);

    }
    @Test
    public void condicion5() throws Exception {
        int cantidad = 1;
        boolean hombre = true;
        boolean mujer = false;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean Nike = false;
        boolean Adidas =true;
        boolean Puma = false;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 80000;
        assertEquals(total, valorEsperado, 0);

    }
    @Test
    public void condicion6() throws Exception {
        int cantidad = 1;
        boolean hombre = true;
        boolean mujer = false;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean Nike = false;
        boolean Adidas =false;
        boolean Puma = true;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 100000;
        assertEquals(total, valorEsperado, 0);

    }
    @Test
    public void condicion7() throws Exception {
        int cantidad = 1;
        boolean hombre = false;
        boolean mujer = true;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean Nike = true;
        boolean Adidas = false;
        boolean Puma = false;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 100000;
        assertEquals(total, valorEsperado, 0);

    }
    @Test
    public void condicion8() throws Exception {
        int cantidad = 1;
        boolean hombre = false;
        boolean mujer = true;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean Nike = false;
        boolean Adidas =true;
        boolean Puma = false;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 130000;
        assertEquals(total, valorEsperado, 0);

    }
    @Test
    public void condicion9() throws Exception {
        int cantidad = 1;
        boolean hombre = false;
        boolean mujer = true;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean Nike = false;
        boolean Adidas =false;
        boolean Puma = true;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 110000;
        assertEquals(total, valorEsperado, 0);

    }
    @Test
    public void condicion10() throws Exception {
        int cantidad = 1;
        boolean hombre = false;
        boolean mujer = true;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean Nike = true;
        boolean Adidas =false;
        boolean Puma = false;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 60000;
        assertEquals(total, valorEsperado, 0);

    }
    @Test
    public void condicion11() throws Exception {
        int cantidad = 1;
        boolean hombre = false;
        boolean mujer = true;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean Nike = false;
        boolean Adidas =true;
        boolean Puma = false;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 70000;
        assertEquals(total, valorEsperado, 0);

    }
    @Test
    public void condicion12() throws Exception {
        int cantidad = 1;
        boolean hombre = false;
        boolean mujer = true;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean Nike = false;
        boolean Adidas =false;
        boolean Puma = true;

        double total = Metodos.zapatos(cantidad,hombre,mujer,zapatilla,clasico,Nike,Adidas,Puma);
        double valorEsperado = 120000;
        assertEquals(total, valorEsperado, 0);

    }

}

