package dio.collections.map;
/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

import java.util.*;
import java.util.Map;

public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        //Primeiro criar a classe de livros e adicionar o atributos: nome e página
        //Ordem aleatória = HashMap
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256 ));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408 ));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432 ));
        }};
        for (Map.Entry<String, Livro> livro:meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " +  livro.getValue());
        }

        System.out.println("--\tOrdem Inserção\t--");
        //LinkedHashMap
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256 ));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408 ));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432 ));
        }};
        for (Map.Entry<String, Livro> livro:meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " +  livro.getValue());
        }

        System.out.println("--\tOrdem alfabética dos autores\t--");
        //De acordo com as chaves
        //TreeMap
        Map<String, Livro> meusLivros2 = new TreeMap<>( meusLivros1);
        for (Map.Entry<String, Livro> livro:meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " +  livro.getValue());
        }

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        //De acordo com os valores
        //usaremos o TreeSext pq vamos usar o comparator
        Set<Map.Entry<String,Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        //Aqui no meu construtor eu preciso passsar o meu comparator, temos que criar lá em baixo
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro:meusLivros3) {
            System.out.println(livro.getKey() + " - " +  livro.getValue());
        }

        System.out.println("--\tOrdem número de página\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro:meusLivros4) {
            System.out.println(livro.getKey() + " - " +  livro.getValue());
        }




    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    //Como eu vou trabalhar com TreeMap, HashMap e LinkedHashMap, vou sobrescrever
    //os métodos equals and hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    //tbm vamos sobrescrever o método ToString pra não aparecer o endereço de memória

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        //Como eu tô querendo comparar por nome, vou fazer o seguinte:
        return livro1.getValue().getNome().compareTo(livro2.getValue().getNome());
    }
}

class ComparatorPagina implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getPaginas().compareTo(livro2.getValue().getPaginas());
    }
}
