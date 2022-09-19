package ModeloUnico;

import java.util.Arrays;

public class VetoresArrays {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;

        int[] numeros = new int[5]; // arrays tem tamanhos imutaveis
        // [0] [1] [2] [3] [4]  indices válidos são de 0 a 4 n -1 (o tamanho -1)
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        for (int i = 0; i < numeros.length; i++){ //Para acessar os elementos dentro do array
                                                //utilizando estrutura de repetição, utilizando o for
            System.out.println(numeros[i]);
        }

        System.out.println("==============");
        // Não existe relação entre o Indice e o valor
        // [0] [1] [2] [3] [4]
        String[] letras = new String[5];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";
        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        System.out.println("==============");
        //Outra forma para adicionar valores no nosso array
        String[] outrasLetras = {"A", "B", "F", "D", "X"};
        for (int i = 0; i < outrasLetras.length; i++) {
            System.out.println(outrasLetras[i]);
        }

        System.out.println("==============");
        //Outra forma sem precisar definir um laço
        System.out.println(Arrays.toString(letras));
        System.out.println(Arrays.toString(outrasLetras));
        System.out.println(Arrays.toString(numeros));

        System.out.println("==============");//Como eu posso descobrir o menor o maior e a média entre eles
        int[] numeros2 = {8, 5, 7, 20, 35};
        int maior = numeros2[0];
        int menor = numeros2[0];
        int media = 0; // por que ela é o somatorio de todos elementos mais divido pela quantidade de elementos

        for (int i=0; i < numeros2.length; i++){
            if (numeros2[i] > maior){
                maior = numeros2[i];
            }
            if (numeros2[i] < menor){
                menor = numeros2[i];
            }
            media += numeros2[i]; // resumo de media = media + numeros[i]
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/numeros2.length);// dividido no final com println


    }
}
