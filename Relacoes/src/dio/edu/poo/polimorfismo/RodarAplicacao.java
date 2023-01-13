package dio.edu.poo.polimorfismo;

public class RodarAplicacao {

    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
        //Aqui se criou um vetor/array do tipo ClasseMae e colocamos tres objetos dentro dele:
        //ClasseFilha1, ClasseFilha2 e ClasseMae


        for (ClasseMae classe: classes){
            classe.metodo1();
        }
        //Aqui fizemos um "forEach" para percorrer cada objeto dentro do vetor e chamamos o método1 de cada um
        //Polimorfismos, o método se comportou de acordo com o tipo de dado que é o ClasseFilha1, mas ele está alocado no ClasseMae

        System.out.println("");

        for (ClasseMae classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
        //Aqui ocorre a sobrescrita, estamos trabalhando diretamente com a
        // criação do objeto ClasseFilha2 e chamamos o método 2 alocado nele
    }
}
