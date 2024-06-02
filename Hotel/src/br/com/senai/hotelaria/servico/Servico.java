package br.com.senai.hotelaria.servico;

public class Servico {
    String descricao;
    double custo;

    public Servico(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    public void exibirInformacoes() {
        System.out.println("#### Informações do Serviço #####");
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Custo: " + this.custo);
        System.out.println("################################");
    }
}
