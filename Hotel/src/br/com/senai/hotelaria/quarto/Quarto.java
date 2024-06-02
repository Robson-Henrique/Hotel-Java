package br.com.senai.hotelaria.quarto;

public class Quarto {
    int numero;
    String tipo;
    boolean ocupado;

    public Quarto(String tipo, boolean ocupado, int numero) {
        this.tipo = tipo;
        this.ocupado = ocupado;
        this.numero = numero;
    }

    public void ocuparQuarto(){
        ocupado = true;
    }

    public void desocuparQuarto(){
        ocupado = false;
    }

    public void exibirInformacoes(){
        System.out.println("informações do quarto #####");
        System.out.println("Número: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Ocupado: " + this.ocupado);
        System.out.println("################################");
    }
}
