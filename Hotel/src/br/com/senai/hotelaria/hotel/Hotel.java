package br.com.senai.hotelaria.hotel;

import br.com.senai.hotelaria.funcionario.Funcionario;
import br.com.senai.hotelaria.quarto.Quarto;
import br.com.senai.hotelaria.reserva.Reserva;
import br.com.senai.hotelaria.servico.Servico;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    String nome;
    String endereco;
    List<Quarto> quartos;
    List<Reserva> reservas;
    List<Funcionario> funcionarios;
    List<Servico> servicos;

    public Hotel(String endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
        this.reservas = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.servicos = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void exibirInformacoes() {
        System.out.println("#### Informações do Hotel #####");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);

        // Exibindo quartos
        for(Quarto quarto : quartos) {
            quarto.exibirInformacoes();
        }

        // Exibindo reservas
        for(Reserva reserva : reservas) {
            reserva.exibirInformacoes();
        }

        // Exibindo funcionarios
        for(Funcionario funcionario : funcionarios) {
            funcionario.exibirInformacoes();
        }

        // Exibindo servicoes
        for(Servico servico : servicos) {
            servico.exibirInformacoes();
        }

        System.out.println("################################");
    }

}

