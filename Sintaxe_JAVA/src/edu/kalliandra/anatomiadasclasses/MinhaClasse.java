package src.edu.kalliandra.anatomiadasclasses;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Kalliandra Carla";
        String segundoNome = "de Lima";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiNome, String segundoNome) {
        return primeiNome.concat(" ").concat(segundoNome);
    }


    //Outra forma de concatenar:

    /*public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método" + primeiroNome.concact(" ").concat(segundoNome)
    }*/
}
