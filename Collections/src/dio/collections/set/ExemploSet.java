package dio.collections.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3,5d, 7d, 0d, 3.6));
        System.out.println(notas);

        //o resultado é dado de forma aleatória e os dados repetidos aparecem só uma vez

        System.out.println("Exiba a posição da nota 5.0");
        //Não é possível dentro da Interface Set

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        //Não conseguimos trabalhar com posições no Set

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        //Não tem como fazer essa substituição, só se fosse uma List

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba a terceira nota adicionada: ");
        //Não consigo pois aqui não temos o método get()

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        //Para o Set salvar a ordem em que foi informada, não podemos utilizar o HashSet
        //Nesses casos precisaremos trabalhar com o LinkedHashSet
        Set<Double> notas1 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3,5d, 7d, 0d, 3.6));
        System.out.println(notas1);

        System.out.println("Exiba todas as notas em ordem crescente: ");
        //Aqui precisaremos utilizar o TreeSet, ele tem o Comparable
        Set<Double> notas2  =new TreeSet<>(notas1);
        System.out.println(notas2);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());



    }
}
