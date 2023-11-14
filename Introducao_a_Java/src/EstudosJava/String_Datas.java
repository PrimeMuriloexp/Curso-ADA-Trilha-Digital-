package EstudosJava;

import java.time.LocalDate; // Para importações automáticas pressione alt+enter e selecione: try to resolve class reference.
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

class String_Datas{

    public static void main(String[] args) {

        /*

        String nome = "Jessé";
        System.out.println(nome.toUpperCase()); //nome.length() tamanho da String

        //Comparando Strings

        String nomeOutro = "jessé";

        System.out.println(nome.equalsIgnoreCase(nomeOutro)); //Note que se usar o comando nome.equals(), e apesar das palavras serem 'iguais', a diferença da letra maiuscula ou minuscula, faz com que o resultado seja false por conta do CASE SENSITIVE


         */

        //Olá {nome}. Noite é {dia-da-semana}, Bom dia.

        String nome = "Murilo";

        LocalDate hoje = LocalDate.now(); // Representa uma data com as informações locais
        System.out.println(hoje);
        Locale brasil = new Locale("pt", "BR");

        String diaSemana= hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;

        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12){

            saudacao = "Bom dia!";

        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {

            saudacao = "Boa Tarde!";

        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {

            saudacao = "Boa Noite!";

        } else {
            saudacao = "olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.\n",nome,diaSemana,saudacao.toUpperCase());

    }
}