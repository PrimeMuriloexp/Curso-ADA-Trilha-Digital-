package EstudosJava;

import java.util.Arrays;

public class Vetores {

    public static void main(String[] args){

        /*
        int[] numeros= new int[5];
        //[0] [1] [2] [3] [4]  indices

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        String[] letras = {"A","B","C","D","E"}; // Outra forma de declarar arrays

        System.out.println(Arrays.toString(letras)); // Outra forma de mostrar arrays, sem o FOR


         */


        int[] numeros ={9,10,12,25,2};

        int maior = numeros[0], menor = numeros[0];
        float media = 0, somaTotal = 0;

        for (int i=0; i < numeros.length; i++){

            if (numeros[i] > maior){

                maior = numeros[i];

            }

            if (numeros[i] < menor){

                menor = numeros[i];

            }

            somaTotal += numeros[i];
            media = somaTotal / numeros.length;


        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: "+menor);
        System.out.println("Media: "+media);



    }



}
