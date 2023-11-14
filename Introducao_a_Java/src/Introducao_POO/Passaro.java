package Introducao_POO;

public class Passaro extends Animal {

    static int numeroDePassaros;


    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    protected void soar() {
        System.out.println("Piu Piu!");
    }
}
