package dio.edu.poo.interfacee;

 class Calculadora implements Operadores {
     @Override
     public void soma(double operador1, double operador2) {
         System.out.println("Soma: " + (operador1 + operador2));
     }

     @Override
     public void subtracao(double operador1, double operador2) {
         System.out.println("Subtração: " + (operador1 - operador2));
     }

     @Override
     public void multiplacao(double operador1, double operador2) {
         System.out.println("Multiplicação: " + (operador1 * operador2));
     }

     @Override
     public void divisao(double operador1, double operador2) {
         System.out.println("Divisão: " + (operador1 / operador2));
     }

     //A interface OBRIGA ao aprelhos que querem se conectar que eles gerem todas as
     // implementações necessárias, não pode ser algo parcial
 }
