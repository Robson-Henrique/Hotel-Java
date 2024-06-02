package br.com.senai.hotelaria;

import br.com.senai.hotelaria.quarto.Quarto;

public class Main {
    public static void main(String args []) {
        Quarto q1 = new Quarto( "Duplex",  true, 123 );
        q1.exibirInformacoes();

    }
}
