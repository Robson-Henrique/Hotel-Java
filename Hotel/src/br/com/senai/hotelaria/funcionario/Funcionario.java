package br.com.senai.hotelaria.funcionario;

public class Funcionario {
    String nome;
    String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void exibirInformacoes() {
        System.out.println("#### Informações do Funcionário #####");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("################################");
    }
}