package dio.lab.tarciosilva.diolabtsiva.singleton;

public class CarroSingletonACombustao extends CarroSingleton {
    private String motorCombustao;

    private static class CarroACombustaoHolderInstancy {
        public static CarroSingletonACombustao carroACombustao;
        static {
            carroACombustao = new CarroSingletonACombustao();
        }
    }

    private CarroSingletonACombustao() {
        super();
    }

    public static CarroSingletonACombustao getInstacy() {
        return CarroACombustaoHolderInstancy.carroACombustao;
    }

    public String getMotorCombustao() {
        return motorCombustao;
    }

    public void setMotorCombustao(String motorCombustao) {
        this.motorCombustao = motorCombustao;
    }

    @Override
    public String toString() {
        return "Partida no motor a combustão ciclo Otto";
    }
}
