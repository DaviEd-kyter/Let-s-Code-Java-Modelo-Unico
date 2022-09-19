package ModeloUnico;

public class Condicionais {
    public static void main(String[] args) {

        int nota = 100;

        //nota maior ou igual 70, então o aluno esta aprovado
        //utilizaremos if-else
        if (nota >= 70){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Não aprovado!");
        }

        System.out.println("================");

        //Aluno A 80, Aluno B 70, Aluno C 60, Aluno D 0
        if (nota >= 80){
            System.out.println("Graduação A");
        } else if (nota < 80 && nota >= 70){
            System.out.println("Graduação B");
        } else if (nota < 70 && nota >= 60) {
            System.out.println("Graduação C");
        } else if (nota < 60 && nota >= 0) {
            System.out.println("Graduação D");
        } else {
            System.out.println("Nota inválida!");
        }

        System.out.println("=================");
        //Saber se o Aluno esta aprovado ou Não
        int nota2 = 100;
        String graduacao;

        if (nota2 >= 80) {
            graduacao = "A";
        } else if (nota2 < 80 && nota >= 70){
            graduacao = "B";
        } else if (nota2 < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota2 < 60 && nota >= 0) {
            graduacao = "D";
        } else {
           graduacao = null;
        }

        //Outra forma do if-else, utilizando Switch
        switch (graduacao){
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break; //Situação de parada, analizar apenas um caso
            case "C":
            case "D":
                System.out.println("Não aprovado!");
                break;
            default:
                System.out.println("Graduação inválida");
        }
    }
}
