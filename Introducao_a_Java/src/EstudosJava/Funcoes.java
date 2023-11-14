package EstudosJava;

public class Funcoes {

// Dicas: Para escrever print em java no intellij so precisa escrever sout + tab ou sou + tab para o printf
   //     Agora para escrevermos public static void main(String[] args) de forma rápida, somente digite psvm + tab
        public static void main(String[] args) {

           String nomeVariavel = "Murilo! Você tem";

        saudacao(nomeVariavel);
            System.out.println(" "+soma(20,4)+" anos!");


             }

    public static void saudacao(String nomeParametro) {

        System.out.printf("Hello "+nomeParametro);

    }

    public static int soma(int a, int b) {

            return a+b;

    }




}
