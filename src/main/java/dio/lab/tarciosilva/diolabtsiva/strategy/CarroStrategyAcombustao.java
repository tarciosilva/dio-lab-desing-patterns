package dio.lab.tarciosilva.diolabtsiva.strategy;

public class CarroStrategyAcombustao implements CarroStrategy {

    @Override
    public void forcaMotriz() {
        System.out.println("Combustível Fóssil");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Acionar motor de partida \n Ligar bomba de oleo \n Abrir bicos injetores ");
    }
}
