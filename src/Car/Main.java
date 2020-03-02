package Car;

public class Main {

	public static void main(String[] args) {

		Motor batmovelMotor = new Motor();
		batmovelMotor.setNumeracao("001");
		
		Carro batmovel = new Carro();
		batmovel.setChassi("001");
		batmovel.setCor("preto");
		batmovel.setMarca("BatmanCompany");
		batmovel.setMotor(batmovelMotor);

		batmovel.abastecer(50.00);
		batmovel.liga(true);
		batmovel.acelera(80.00);
		batmovel.freio(true);
		batmovel.passaMarcha(1);
		batmovel.getMotor().trocarOleo(8);
		
		
		Motor motorRelampagoMcQueen = new Motor();
		motorRelampagoMcQueen.setNumeracao("002");
		
		Carro RelampagoMcQueen = new Carro();
		RelampagoMcQueen.setChassi("002");
		RelampagoMcQueen.setCor("vermelho");
		RelampagoMcQueen.setMarca("DisneyCompany");
		RelampagoMcQueen.setMotor(motorRelampagoMcQueen);

		RelampagoMcQueen.abastecer(100.00);
		RelampagoMcQueen.liga(true);
		RelampagoMcQueen.acelera(300.00);
		RelampagoMcQueen.freio(true);
		RelampagoMcQueen.passaMarcha(5);
		RelampagoMcQueen.getMotor().trocarOleo(9);
		
		
		Motor motorHerbie = new Motor();
		motorHerbie.setNumeracao("003");
		
		Carro herbie = new Carro();
		herbie.setChassi("003");
		herbie.setCor("branco");
		herbie.setMarca("Volkswagen");
		herbie.setMotor(motorHerbie);

		herbie.abastecer(30.00);
		herbie.liga(true);
		herbie.acelera(100.00);
		herbie.freio(true);
		herbie.passaMarcha(4);
		herbie.getMotor().trocarOleo(9);
		
	
	}

}
