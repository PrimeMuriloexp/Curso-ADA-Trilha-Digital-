package Introducao_POO;

public class Cachorro extends Animal {
//Atributos

  static int numeroDeCachorros;


  private float tamanhoDoRabo;



  //Construrores

  public Cachorro(){ //Construtor padrao

  }

  public Cachorro(String nome, String cor, float altura, double peso, float tamanhoDoRabo, String estadoDeEspirito) {
    this.nome = nome;
    this.cor = cor;
    this.altura = altura;
    this.peso = peso;
    this.tamanhoDoRabo = tamanhoDoRabo;
    this.estadoDeEspirito = estadoDeEspirito;

    numeroDeCachorros++;
  }

  //Metodos
  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
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

  public float getTamanhoDoRabo() {
    return tamanhoDoRabo;
  }

  public void setTamanhoDoRabo(float tamanhoDoRabo) {
    this.tamanhoDoRabo = tamanhoDoRabo;
  }

  public String getEstadoDeEspirito() {
    return estadoDeEspirito;
  }

  public static int getNumeroDeCachorros() {
    return numeroDeCachorros;
  }

  public static void setNumeroDeCachorros(int numeroDeCachorros) {
    Cachorro.numeroDeCachorros = numeroDeCachorros;
  }



  public String pegar() {

    return "Bolinha";

  }

  @Override
  public String toString() {
    return "Cachorro{" +
            "nome='" + nome + '\'' +
            '}';
  }

  @Override
  protected void soar() {
    System.out.println("Au Au!");
  }

  public String interagir(String acao) {

    switch (acao.trim().toLowerCase()) {

      case "carinho":
        this.estadoDeEspirito = "Feliz";
        break;
      case "vai dormir":
        this.estadoDeEspirito = "Bravo";
        break;
      case "nao dar racao":
        this.estadoDeEspirito = "Triste";
        break;
      default:
        this.estadoDeEspirito = "Neutro";

        break;

    }



//    if (acao.trim().toLowerCase().equals("carinho")){
//
//      this.estadoDeEspirito = "Feliz";
//
//    } else if (acao.trim().toLowerCase().equals("vai dormir")) {
//
//      this.estadoDeEspirito = "Bravo";
//
//    } else {
//      this.estadoDeEspirito = "neutro";
//    }

    return estadoDeEspirito;


  }




}
