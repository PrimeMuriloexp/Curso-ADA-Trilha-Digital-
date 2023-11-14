package Introducao_POO;


import Loja.Petshop;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Spike","Branco com pintas pretas",25,5.5,5,"nada");

        System.out.println("Numeros de Cachorros:");
        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("Floquinho","Branco com manchas marrons",30,6.2,6,"nada");

        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println("------------------------------------");


        System.out.println(cachorro2.getNome());
        System.out.println("Peso: "+cachorro2.getPeso());

    cachorro1.soar();

        System.out.println("O cachorro pegou uma "+cachorro1.pegar());


        System.out.println("O cachorro está "+cachorro1.interagir(" Carinho   "));

        System.out.println("------------------------------------");

        Gato gato1 = new Gato("Duquesa","Laranja",2);

        Passaro passaro1 = new Passaro("Mordecai","Azul",0.5);

//    cachorro1.soar();
//    gato1.soar();
//    passaro1.soar();

    Petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

    Petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

    Petshop.tosar(cachorro2);
        System.out.println(cachorro2.getEstadoDeEspirito());




    }



}
