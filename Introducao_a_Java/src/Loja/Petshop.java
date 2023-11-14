package Loja;

import Introducao_POO.Animal;
import Introducao_POO.Cachorro;

public class Petshop {

    public static void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public static void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosado");
    }

    public  void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("Com Saudades");
    }



}
