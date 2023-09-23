package dio.lab.tarciosilva.diolabtsiva.strategy;

public class CarroStrategyEletrico implements CarroStrategy{
    @Override
    public void forcaMotriz() {
        System.out.println("Eletricidade");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Ligar motor elétrico");
    }
}
