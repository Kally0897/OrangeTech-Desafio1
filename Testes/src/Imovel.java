import java.util.*;

public class Imovel {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a frase");
        String frase = leitor.next();
        String array[] = new String[3];

       array = frase.split("/");
        System.out.println("Imóvel: " + array[0] + " " + "R$ " + array[1] + " " + array[2] );

    }
}

