package dio.lab.tarciosilva.diolabtsiva.singleton;

public class CarroEletrico {
    private String motoreletrico;

    private static class CarroEletricoInstancyHoder {
        public static CarroEletrico carroEletricoInstancy = new CarroEletrico();
    }
    private CarroEletrico(){
        super();
    }
    public static CarroEletrico getInstacy() {
        return CarroEletricoInstancyHoder.carroEletricoInstancy;
    }

    public String getMotoreletrico() {
        return motoreletrico;
    }

    public void setMotoreletrico(String motoreletrico) {
        this.motoreletrico = motoreletrico;
    }

    @Override
    public String toString() {
        return "Motor elétrico etron em funcionamento";
    }
}
