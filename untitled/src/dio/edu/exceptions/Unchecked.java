package dio.edu.exceptions;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros

public class Unchecked {
    boolean continueLooping = true;

    public static void main(String[] args) {

        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            }catch(ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro");

            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0");

            }finally {
                System.out.println("Chegou no finally");
            }

        } while (continueLooping);




        System.out.println("Chegou até aqui ... ");
    }

    public static int dividir(int a, int b){
        return a/b;
    }
}
