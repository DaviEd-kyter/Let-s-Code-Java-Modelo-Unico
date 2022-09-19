package ModeloUnico;

public class Logicos {
    public static void main(String[] args) {

        //Boolean
        boolean resultado = false;
        System.out.println(resultado);

        System.out.println("===============");
        //Algoritimo - Para ir a praia
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        //Tabela verdade
        //Operador && (AND)
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false

        //Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        //false || false = false

        System.out.println("Vamos a praia?");
        System.out.println(vamosAPraia);

        System.out.println("=================");

        //Operador ternario "?"
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

    }
}
