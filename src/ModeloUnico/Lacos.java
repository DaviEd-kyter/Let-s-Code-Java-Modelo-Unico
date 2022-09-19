package ModeloUnico;

public class Lacos {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10
        // para uma variável que inicia em 1, e vai até 10, mudando 1 por 1, faça:
       for (int i = 1; i <= 10; i++){ // i++ vai de um em um
           System.out.println(i);
       }
        System.out.println("============"); // i+=2 vai de 2 em 2
       for (int i = 1; i <= 10; i+=2){
           System.out.println(i);
       }
        System.out.println("============"); // por exemplo tabuada do 2
       for (int i = 2; i <= 20; i+=2){
           System.out.println(i);
       }
        System.out.println("=====Tabuada======="); // todas tabuadas até usando for dentro de outro for
       for (int i = 1; i <= 10; i++){
           for (int j = 1; j <= 10; j++){
               System.out.println(j + "x" + i + " = " + j * i);
               //1x1 = 1
               //2x1 =2
           }
       }
    }
}
