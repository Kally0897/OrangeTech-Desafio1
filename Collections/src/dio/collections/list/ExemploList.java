package dio.collections.list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
    //    Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3,5,7,0,3.6], faça:

   // Algumas formas de se iniciar um List
//  List notas = new ArrayList(); //essa forma é a que era feita antes do Java5
//  List<Double> notas = new ArrayList<Double>();
//  ArrayList<Double> notas = new ArrayList<>(); -> Não é o recomendado
//  List<Double> notas = new ArrayList<>(Array.asList(7d, 8.5, 9.3,5d,7d,0d,3.6));
//  List<Double> notas = Array.asList(7d, 8.5, 9.3,5d,7d,0d,3.6); -> Essa forma é limitada, não conseguimos mexer no tamanho, nem tirar, nem inserir;
//  notas.add(10d);
//  System.out.println(notas);


        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);


        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram inseridas: ");
        for (Double nota: notas) {
            System.out.println(nota);
        };

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //System.out.println("Exiba a soma dos valores: " );
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        };

        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        Double resultado = 0d;
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }

        System.out.println("Remova as notas menores que 7: " + notas);


    }
}
