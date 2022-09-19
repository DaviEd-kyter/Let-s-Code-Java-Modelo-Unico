package ModeloUnico;

public class Funcoes {
    public static void main(String[] args) {
        String nomeOriginal = "Let's Code";
        saudacao(nomeOriginal); //chamando uma função sempre dentro do MAIN
        System.out.println("===SOMA====");
        int resultado = soma(2, 5);
        System.out.println(resultado);

    }

    public static void  saudacao(String nomeParametro) {// define um parametro dentro da função
        System.out.println("Hello, " + nomeParametro);
    }

    public static int soma(int a, int b){
        return a + b;
    }

}
