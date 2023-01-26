package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	    /*Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.somar(2,9));

		No SpringBoot não se pode mais criar objetos instanciando com o new, criamos beans através de componentes, verificar MyApp*/


	}

}
