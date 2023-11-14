package Introducao_POO;

//Uma classe abstrata em Java serve como um modelo básico que não pode ser diretamente criado (instanciado).
// Ela pode conter métodos abstratos, os quais devem ser implementados por suas subclasses.
public abstract class Animal {

    protected String nome;
    protected String cor;
    protected float altura;
    protected double peso;
    protected  String estadoDeEspirito;


    protected Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    protected Animal() {
    }

    protected void comer(){}

    protected void dormir(){}

    protected abstract void soar();


}
