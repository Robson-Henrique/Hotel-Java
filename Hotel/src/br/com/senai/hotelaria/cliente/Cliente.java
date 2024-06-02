package br.com.senai.hotelaria.cliente;

public class Cliente {

    String nome;
    String cpf;
    String email;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void exibirInformacoes() {
        System.out.println("#### Informações do Cliente #####");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Email: " + this.email );
        System.out.println("################################");
    }
}
