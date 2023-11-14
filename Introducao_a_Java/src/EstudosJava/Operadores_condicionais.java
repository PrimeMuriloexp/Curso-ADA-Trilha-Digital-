package EstudosJava;

class Condicionais{

    public static void main(String[] args) {

      /* Exemplo 1

        int nota = 70;
//Altere o valor da variavel acima para ver os possiveis resultados

        // se nota maior ou igual 70, então aprovado
        //if-else

        if(nota >= 70){

            System.out.println("Aluno aprovado!");

        }else {
            System.out.printf("Não aprovado");
        }


       */

        //Exemplo 2

        int nota = 80;
        String graduacao;
        // A = 80 | B = 70 | c = 60 | D = 0

        if(nota >= 80){

            graduacao = "A";

        } else if (nota < 80 && nota >= 70) {

            graduacao = "B";

        }else if (nota < 70 && nota >= 60) {

            graduacao = "C";

        }else if (nota < 60 && nota >= 0) {

            graduacao = "D";

        }else{
            graduacao = null;
        }

        switch (graduacao){

            case "A":
            case "B":
                System.out.printf("Aluno aprovado!");
                break;
            case "C":

            case "D":
                System.out.printf("Não Aprovado");
                break;

            default:
                System.out.printf("Operação inválida");

        }


    }

}