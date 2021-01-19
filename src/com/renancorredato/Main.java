package com.renancorredato;

public class Main {

    public static void main(String[] args) {
        Moto moto = new Moto(2,2, 1, 1);
        moto.setCor(Moto.LARANJA);
        moto.setModelo(Moto.TIPOC);
        moto.setAcessorioUm(Moto.SBAU);
        moto.setAcessorioDois(Moto.SFREIODISCO);
        moto.setAcessorioTres(Moto.NPARDITAELETRICA);





        moto.imprimeValores();

    }
}
