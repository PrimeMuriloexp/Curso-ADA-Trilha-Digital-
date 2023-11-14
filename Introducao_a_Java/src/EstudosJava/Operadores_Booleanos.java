package EstudosJava;

class Boleanos {
    public static void main(String[] args) {

        boolean fimDeSemana = true, fazendoSol = true;

//Altere os valores das variaveis acima para true ou false, para ver os possiveis resultados!

        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosAPraia);

        //Tabela Verdade

        /*Operador && (AND)
         true && true = true
         true && false = false
         false && true - false
         false && false = false
         */

        /*Operador || (OR)
         true && true = true
         true && false = true
         false && true - true
         false && false = false
         */

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        String mensagem2 = fazendoSol ? "Está fazendo sol!" : "Não está fazendo sol";

        System.out.printf(mensagem+" e "+mensagem2+"\n");

        // Simbolo ? se refere a uma condição (If) um operador ternário, " ? se sim faça  : se não faça isso "

        String mensagem3 = vamosAPraia ? "Por isso vamos a praia!" : "Por conta disso não iremos a praia";

        System.out.println(mensagem3);



    }
}