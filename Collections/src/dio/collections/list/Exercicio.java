package dio.collections.list;

//Faça um programa que receba a temperatura média dos 6
// primeiros meses do ano e armazene-as em uma lista

/*Após isto, calcule a média semestral das temperaturas
* e mostre todas as temperaturas acima desta média, e em
* que mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro,
* 2 - Fevereiro*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio {

    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as temperaturas em ºC de cada mês: ");
        List<Double> temperaturaMes = new ArrayList<Double>();
        temperaturaMes.add(35.6);
        temperaturaMes.add(21.3);
        temperaturaMes.add(25.0);
        temperaturaMes.add(33d);
        temperaturaMes.add(27d);
        temperaturaMes.add(19.1);
        System.out.println(temperaturaMes);

        System.out.println("Exiba a média de temperatura no 1º semestre");
        Iterator<Double> iterator = temperaturaMes.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Média de: " + soma / temperaturaMes.size());

        Iterator<Double> iterator1 = temperaturaMes.iterator();
        Double resultado = 0d;
        Double media = soma / temperaturaMes.size();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next <= media) {
                iterator1.remove();
            }
        }
        System.out.println(temperaturaMes);
        //Após isso, mostre as temperatueas acima desta média, e em
        // que mês elas ocorreram (mostrar mês por extensso)


    }
}







