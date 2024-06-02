package br.com.senai.hotelaria.reserva;

import br.com.senai.hotelaria.cliente.Cliente;
import br.com.senai.hotelaria.quarto.Quarto;

import java.time.LocalDate;

public class Reserva {

    Cliente cliente;
    Quarto quarto;
    LocalDate dataInicio;
    LocalDate dataFim;

    public Reserva(Cliente cliente, Quarto quarto, LocalDate dataFim, LocalDate dataInicio) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
    }

    public void exibirInformacoes() {
        System.out.println("#### Informações da Reserva #####");
        this.cliente.exibirInformacoes();
        this.quarto.exibirInformacoes();
        System.out.println("Data Início: " + this.dataInicio.toString());
        System.out.println("Data Fim: " + this.dataFim.toString());
        System.out.println("################################");
    }
}
