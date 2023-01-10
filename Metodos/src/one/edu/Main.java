package one.edu;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Resultados do exercício de calculadora");
        Calculadora.soma(3,5);  //Aqui estamos chamando um método diretamente de uma classe, isso só é possível pq a classse é pública
        Calculadora.subtracao(7,6);
        Calculadora.multiplicacao(100, 5.2);
        Calculadora.divisao(56, 9.1);

        //Mensagem
        System.out.println("Resultados do exercício de mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);


        //Empréstimo
        System.out.println("Resultados do exercício de empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas()); // é comum dentro de um método, chamarmos outro método, em JS chamamos de callback
        Emprestimo.calcular(7500, Emprestimo.getTresParcelas());
        Emprestimo.calcular(5800, 5);
    }
}
