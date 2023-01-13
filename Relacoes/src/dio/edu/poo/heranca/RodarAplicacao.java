package dio.edu.poo.heranca;

public class RodarAplicacao {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(); //Criei um objeto funcionário, dentro da classe funcionario

        Funcionario gerente = new Gerente(); //Upcast
        Funcionario vendedor = new Vendedor(); //Upcast
        Funcionario faxineiro = new Faxineiro(); //Upcast

        //Deixei que as classes gerente, faxineiro e faxineiro tiveram um upcast (elevação de hierarquia) nas classes

        //Downcast aqui:

        Vendedor vendedor_ = (Vendedor) new Funcionario();// tentando transformar funcinário em vendedor
        Gerente gerente1 = (Gerente) new Funcionario();



    }
}
