package dio.collections.set;
/*Daos as seguintes informações sobre as minhas séries favoritas,
* crieum conjunto e ordene este conjunto exibindo:
* (nome - genereo - tempo de episódio;
*
* Serie 1 = Nome: got, genero: fantasia, tempoEpisodio:60,
* Serie 2 = Nome: dark, genero:  drama, tempoEpisódio: 60,
* Serie3 = that 70's show, genero: comedia, tempoEpisodio: 25,*/

import java.util.*;

public class ExemploSte2 {

    public static void main(String[] args) {

        System.out.println("--\tOrdem Aleatória\t--");
        //HashSet
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70's show", "comedia", 25));
        }};
        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
            
        }

        System.out.println("--\tOrdem de Inserção\t--");
        //LinkedHashSet
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70's show", "comedia", 25));
        }};
        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Natural (TempoEpisodio)\t--");
        //TreeSet
        //Pra usar o TreeSet eu preciso de um comparable que vai pedir para criar o CompareTo
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
       //nesse exemplo só aparece Got, pois no Set não há repetição e no parâmetro tempo de episódio, tanto dar, quanto got tem o mesmo tempo

        System.out.println("--\tOrdem Nome/Gênero/TempoEpsiódio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Gênero\t--");


        System.out.println("--\tOrdem TempoEpsiódio\t--");


    }

    static class Serie implements Comparable<Serie> {
        private String nome;
        private String genero;
        private Integer tempoEpisodio;

        public Serie(String nome, String genero, Integer tempoEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }


        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoEpisodio() {
            return tempoEpisodio;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEpisodio=" + tempoEpisodio +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Serie serie = (Serie) o;
            return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEpisodio);
        }

        @Override
        /*public int compareTo(Serie serie) {
            return Integer.compare((this.getTempoEpisodio()), serie.getTempoEpisodio());
        }

        Método utilizado antes*/

        public int compareTo(Serie serie) {
            int tempoEpisodio = Integer.compare((this.getTempoEpisodio()), serie.getTempoEpisodio());
            if (tempoEpisodio != 0) return tempoEpisodio;
            return this.getGenero().compareTo(serie.getGenero());

            //Dessa forma conseguimos que mesmo com o tempo de episódio igual as três séries sejam mostradas através do critério de desempate que foi gênero
        }
    }
    static class ComparatorNomeGeneroEpisodio implements Comparator<Serie>{
        public int compare (Serie s1, Serie s2){
            int nome = s1.getNome().compareTo(s2.getNome());
            if (nome != 0) return nome;

            int genero = s1.getGenero().compareTo(s2.getGenero());
            if (genero != 0) return genero;

            return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());





        }
    }
}
