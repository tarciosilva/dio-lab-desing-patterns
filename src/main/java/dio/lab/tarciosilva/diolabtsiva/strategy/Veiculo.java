package dio.lab.tarciosilva.diolabtsiva.strategy;

public class Veiculo {
    private CarroStrategy carro;

    public void setCarro(CarroStrategy carro) {
        this.carro = carro;
    }

    public void forcaMotriz(){
        carro.forcaMotriz();
    }
    public void ligarMotor(){
        carro.ligarMotor();
    }
}
