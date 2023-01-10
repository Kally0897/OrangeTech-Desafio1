package one.edu;
/*
Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influencia.
Defina arbitrariamente as faixas que  influenciam nos valores*/

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.35;
    }

    public static double getTaxaTresParcelas() {
        return 0.55;
    }

    public static void  calcular( double valor, int parcelas) {
        if (parcelas == 2){
            double valorFinal = valor + (valor * getDuasParcelas());

            System.out.println("Valor final do empréstimo em duas parcelas é : R$ " + valorFinal);
        } else if (parcelas == 3){
            double valorFinal = valor + (valor * getTresParcelas());

            System.out.println("Valor final do empréstimo em três parcelas é : R$ " + valorFinal);

        } else {
            System.out.println("Quantidade máxima de parcelas excedida");
        }
    }
}
