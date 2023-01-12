public class Carro {
    String cor;
    String modelo;
    int capacidade_tanque;
    double totalValorTanque;
    double valorCombustivel;

    //Construtor aqui

    Carro(){

    }

    //Sobrecarga

    Carro(String cor, String modelo, int capacidade_tanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidade_tanque = capacidade_tanque;

    }

    void setCor(String cor){ // colocando um valor no atributo
        this.cor = cor;
    }

    String getCor(){ // pegando o valor que foi atribuído
        return cor;
    }

    void setModelo(String modelo){ // colocando um valor no atributo
        this.modelo = modelo;
    }

    String getModelo(){ // pegando o valor que foi atribuído
        return modelo;
    }

    void setCapacidade_tanque(int capacidade_tanque){ // colocando um valor no atributo
        this.capacidade_tanque = capacidade_tanque;
    }

    int getCapacidade_tanque(){ // pegando o valor que foi atribuído
        return capacidade_tanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidade_tanque * valorCombustivel;
    }

}
