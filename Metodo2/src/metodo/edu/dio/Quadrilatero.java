package metodo.edu.dio;

/* Crie uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio
Use sobrecarga*/

public class Quadrilatero {
    public static void area (double lado){
        System.out.println("Área do quadrado é: " + lado * lado);
    }

    public static void area( double lado1, double lado2){
        System.out.println("Área do retângulo é: " + lado1 * lado2);
    }

    public static void area (double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio é: " + baseMenor * baseMaior * altura );
    }
}


// usamos a sobrecarga quando usamos o mesmo nome do método, no caso, área e mudamos os parâmetros, afetando assim
// a assinatura