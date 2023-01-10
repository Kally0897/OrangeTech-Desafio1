package metodo.edu.dio;

public class Main {
    public static void main(String[] args) {

        //Quadrilátero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5, 7);
        Quadrilatero.area(5, 7,3);

        //Quadrlátero
        System.out.println("Exercício de retorno");

        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5,8);
        System.out.println("área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(5,8,9);
        System.out.println("área do trapézio:" + areaTrapezio);

    }
}