

import java.util.Scanner;

public class McDonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];

        listaIngredientes= ingredientes.split(";");

        System.out.println(listaIngredientes[0]);
        System.out.println(listaIngredientes[1]);
        System.out.println(listaIngredientes[2]);
        System.out.println(listaIngredientes[3]);

        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída

    }
}
