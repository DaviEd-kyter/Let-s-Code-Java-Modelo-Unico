package ModeloUnico;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringsEDatas {
    public static void main(String[] args) {
        //Manipulação de Strings e Datas

        String teste = "Hello World";
        System.out.println(teste);

        System.out.println("=========");
        //Olá, {nome}. Hoje é {dia-da-semana}, Bom Dia.

        String nome = "Davi";
        System.out.println(nome.toUpperCase());//Deixar as letras MAIUSCULAS
        System.out.println(nome.toLowerCase());//Deixar as letras minusculas
        System.out.println(nome.length());//Qual tamanho do meu texto

        System.out.println("=========");
        //
        String nomeOutro = "davi";
        System.out.println(nome.equals(nomeOutro));//Verificar se os dois valores são iguais
        System.out.println(nome.equalsIgnoreCase(nomeOutro));//Ele vai ignorar MAIUSCULO ou minusculo

        System.out.println("=========");
        //Olá, {nome}. Hoje é {dia-da-semana}, Bom Dia.

        String nome2 = "Davi";

        //Representar uma data mundial "ISO 8601
        LocalDate hoje = LocalDate.now();//Representa uma data com as informações locais
       // System.out.println(hoje.getDayOfWeek());//Vai pegar o dia da Semana
       // System.out.println(hoje.getDayOfMonth());//vai pegar o Dia
        Locale brasil = new Locale("pt", "BR");//representação do local aqui é o Brasil
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa Noite";
        } else {
            saudacao = "Olá.";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n",nome, diaSemana, saudacao.toUpperCase());//printf precisa fazer a quebra de linha. %s para declarar strings %n para fazer a quebra de linha
    }
}
