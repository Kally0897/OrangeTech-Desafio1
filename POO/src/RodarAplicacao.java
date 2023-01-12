//Contrução de objeto e chamada de métodos

public class RodarAplicacao {
    public static void main(String[] args) {


        Carro carro = new Carro();

        carro.setCor("Vermelho");
        carro.setModelo("Onix");
        carro.setCapacidade_tanque(60);

        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidade_tanque());
        System.out.println(carro.totalValorTanque(4.56));

        Carro carro1 = new Carro("Azul Prateado", "Kwid", 58);


        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidade_tanque());
        System.out.println(carro1.totalValorTanque(4.56));


    }
}
