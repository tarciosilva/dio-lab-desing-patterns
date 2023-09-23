package dio.lab.tarciosilva.diolabtsiva;

import dio.lab.tarciosilva.diolabtsiva.facede.Facede;
import dio.lab.tarciosilva.diolabtsiva.singleton.CarroSingletonACombustao;
import dio.lab.tarciosilva.diolabtsiva.singleton.CarroEletrico;
import dio.lab.tarciosilva.diolabtsiva.strategy.CarroStrategy;
import dio.lab.tarciosilva.diolabtsiva.strategy.Veiculo;
import dio.lab.tarciosilva.diolabtsiva.strategy.CarroStrategyAcombustao;
import dio.lab.tarciosilva.diolabtsiva.strategy.CarroStrategyEletrico;

public class Application {

	public static void main(String[] args) {
		CarroSingletonACombustao gol = CarroSingletonACombustao.getInstacy();
		System.out.println(gol);
		CarroEletrico pryus = CarroEletrico.getInstacy();
		System.out.println(pryus);

		CarroStrategy chevete = new CarroStrategyAcombustao();
		CarroStrategy byd = new CarroStrategyEletrico();

		Veiculo veiculo = new Veiculo();
		veiculo.setCarro(chevete);


		veiculo.ligarMotor();

		Facede.getInstacy().updateCliente("Tarcio Silva", "58090-842");

	}

}
