package EstudosJava;

public class Lacos_Numericos {

    public static void main(String[] args){

        // 1 2 3 4 5 6 7 8 9 10
        // Para uma variavel que inicia em 1 e vai ate 10, mudando 1 por 1, Faça
/* //Exemplo 1
        for (int i = 1; i <= 10; i++){

            System.out.println("3 x "+ i +" = "+ (i*3) );

        }


 */

    //Exemplo 2

        for (int i=1; i <=10; i++){
            System.out.printf("\n");
            for (int j = 1; j <=10; j++){

                System.out.printf("  |%2d x %2d = %2d| ", j, i, (i * j));
                //Neste código, usei o %2d no printf para especificar que cada número deve ocupar pelo menos 2 espaços, o que garante que todos os números na tabuada tenham o mesmo espaço para que no resultado fica alinhado.
            }

        }


    }


}
