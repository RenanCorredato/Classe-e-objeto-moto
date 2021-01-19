package com.renancorredato;

public class Moto {

    public static final String AZUL = "azul";
    public static final String PRETO = "preto";
    public static final String LARANJA = "laranja";

    public static final String TIPOS = "sport";
    public static final String TIPOC = "cargo";

    public static final String SBAU = ",bau";
    public static final String SFREIODISCO = ",freio a disco";
    public static final String PARDITAELETRICA = ",partida eletrica";
    public static final String SFREIOTAMBOR = ",freio a tambor";

    public static final String NBAU = ",não contem bau";
    public static final String NFRIODISCO = ",não cotem freio a disco";
    public static final String NPARDITAELETRICA = ",não contem partidade eletrica";
    public static final String NFRIOTAMBOR = ",não contem freio tambor";

    public Integer quantidadePeneus;
    public Integer quantidadeAros;
    public Integer quantidadaBanco;
    public Integer quantidadaEcapamento;

    public String cor;
    public String modelo;
    public String acessorioUm;
    public String acessorioDois;
    public String acessorioTres;
    public String acessorioQuarto;







    public Moto(Integer quantidadePeneus, Integer quantidadeAros, Integer quantidadaBanco, Integer quantidadaEcapamento){
        setQuantidadePeneus(quantidadePeneus);
        setQuantidadeAros(quantidadeAros);
        setQuantidadaBanco(quantidadaBanco);
        setQuantidadaEcapamento(quantidadaEcapamento);

    }

    public Integer getQuantidadePeneus() {
        return quantidadePeneus;
    }

    public void setQuantidadePeneus(Integer quantidadePeneus) {
        this.quantidadePeneus = quantidadePeneus;
    }

    public Integer getQuantidadeAros() {
        return quantidadeAros;
    }

    public void setQuantidadeAros(Integer quantidadeAros) {
        this.quantidadeAros = quantidadeAros;
    }

    public Integer getQuantidadaBanco() {
        return quantidadaBanco;
    }

    public void setQuantidadaBanco(Integer quantidadaBanco) {
        this.quantidadaBanco = quantidadaBanco;
    }

    public Integer getQuantidadaEcapamento() {
        return quantidadaEcapamento;
    }

    public void setQuantidadaEcapamento(Integer quantidadaEcapamento) {
        this.quantidadaEcapamento = quantidadaEcapamento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAcessorioUm() {
        return acessorioUm;
    }

    public void setAcessorioUm(String acessorioUm) {
        this.acessorioUm = acessorioUm;
    }

    public String getAcessorioDois() {
        return acessorioDois;
    }

    public void setAcessorioDois(String acessorioDois) {
        this.acessorioDois = acessorioDois;
    }

    public String getAcessorioTres() {
        return acessorioTres;
    }

    public void setAcessorioTres(String acessorioTres) {
        this.acessorioTres = acessorioTres;
    }

    public String getAcessorioQuarto() {
        return acessorioQuarto;
    }

    public void setAcessorioQuarto(String acessorioQuarto) {
        this.acessorioQuarto = acessorioQuarto;
    }

    public void imprimeValores(){
        System.out.println("Quantidade de Penus " + getQuantidadePeneus());
        System.out.println("Quantadade aros "+ getQuantidadeAros() );
        System.out.println("Quantidade banco " + getQuantidadaBanco());
        System.out.println("Quantidade escamento " +getQuantidadaEcapamento());

        System .out.println ("Cor " + getCor());
        System .out.println ("Modelo " + getModelo());
        System .out.println ("Contem "+ getAcessorioUm());
        System .out.println ("Contem "+ getAcessorioDois());
        System .out.println ("Contem "+ getAcessorioTres());



    }

}

