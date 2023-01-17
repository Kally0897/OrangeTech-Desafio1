package dio.collections.list;

/*
* Dadas as seguintes informações sobre gatos, crie uma Lista e ordene esta
* lista exibindo:
* (nome - idade - cor);
*
* Gato 1 = nome: Jan, idade: 18, cor: preto;
* Gato 2 = nome: Simba, idade: 6, cor: tigrado;
* Gato 3 = nome: Jan, idade: 12, cor: amarelo;
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList2 {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Pierre", 5, "tigrado" ));
            add(new Gato("Spencer", 10, "preto"));
            add(new Gato("Jasmine", 2, "preto"));
        }};

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de Aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        //Aqui utilizamos a interface Comparable que pede uma implementação de compareTo

        System.out.println("--\tOrdem de Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);


    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String  cor;

    public Gato (String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
