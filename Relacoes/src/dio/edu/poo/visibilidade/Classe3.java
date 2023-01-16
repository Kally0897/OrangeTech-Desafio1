package dio.edu.poo.visibilidade;

class Classe3 {

    //Como Classe3 não é um subtipo de Classe1, seu acesso aos atributos
    //e métodos são limitados, para que ela consiga ter acesso
    //tenho que criar uma associação com a Classe1

    Classe1 classe1; //Associação feita

    void metodo(){
         //atributos 2 e 3
        classe1.atributo2;
        classe1.atributo2;

        //metodos 2 e 3
        classe1.metodo2();
        classe1.metodo3();


    }
}
