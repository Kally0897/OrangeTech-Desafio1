package Lógica_condicional.Controle_de_fluxo;

import java.lang.runtime.SwitchBootstraps;

public class Main {

    public static void main(String[] args){

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }

    // Método incorreto, sinal de código mal projetado
    private static void ifFlecha(){
        int mes = 9;
        if (mes == 1){
            System.out.println("Janeiro");
        }else {
            if (mes == 2){
                System.out.println("Fevereiro");
            }else {
                if (mes == 3){
                    System.out.println("Março");
                }else {
                    if (mes == 4){
                        System.out.println("Abril");
                    }else{
                        if (mes == 5){
                            System.out.println("Maio");
                        }
                    }
                }
            }
        }

    }

    //Método correto, boas práticas
    private static void ifSemFlecha(){
        int mes = 9;
        if (mes == 1){
            System.out.println("Janeiro");
        }else if (mes == 2){
            System.out.println("Fevereiro");
        }else if (mes == 3){
            System.out.println("Março");
        }else if (mes == 4){
            System.out.println("Abril");
        }else if (mes == 5){
            System.out.println("Maio");
        }
    }

    //Forma incorreta de se usar o IF, expressão muito grande
    private static void ifFerias(){

        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro"){
            System.out.println("Férias");
        }
    }

    //Método correto
    private static void ifMenor(){
        double salarioMensal = 11893.58d;
        double mediaSalaio = 10500d;

        int quantiedadeDependentes = 4;
        int mediaDependentes = 2;

        //Essa configuração deve ser evitada

        if ((salarioMensal < mediaSalaio) && (quantiedadeDependentes>= mediaDependentes)){
            System.out.println("Funcionário deve receber auxílio");
        }

        //Melhor forma de trabalhar:

        boolean salarioBaixo = salarioMensal < mediaSalaio;
        boolean muitosDependentes = quantiedadeDependentes >= mediaDependentes;

        if ( (salarioBaixo && muitosDependentes)){
            System.out.println("Funcionário deve receber auxílio");
        }

        boolean receberAuxilio = (salarioBaixo) && (muitosDependentes);
        if (receberAuxilio){
            System.out.println("Funcionário deve receber auxílio");
        }else {
            System.out.println("Funcionário não deve receber auxílio");
        }
    }

    private static void switchSemana(){

        String dia = "Terça";

        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido");
                break;

        }
    }
    private static void switchNumero() {

        int numero = 4;
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }
    private static void switchFerias() {

        String mes = "dezembro";
        switch (mes){
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }
    }
}

