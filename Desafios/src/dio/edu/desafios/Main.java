package dio.edu.desafios;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int entrada = leitor.nextInt();
        int mesada = 50;
        int resultado = mesada * entrada;

        System.out.println("Voce tera " + resultado + "reais");
    }


}