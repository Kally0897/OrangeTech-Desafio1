package src.edu.kalliandra.escopo;

public class Conta {

    /* variavel da classe conta*/
    double saldo = 10.0;

    public void sacar(Double valor){
        /* variavel local do método*/
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        /* disponível em toda a classe*/
        System.out.println(saldo);
        /* somente o método sacar conhece esta variável*/
        System.out.println(novoSaldo);

    }

    public double calcularDividaExponencial(){
        /* variável local do método*/
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for (int x=1; x<=5; x++){
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }

        // escopo de fluxo
        //x e valorCalculado nunca estarão disponíveis
        return valorMontante;
    }
}
