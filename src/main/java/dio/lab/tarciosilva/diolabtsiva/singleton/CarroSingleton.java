package dio.lab.tarciosilva.diolabtsiva.singleton;

public abstract class CarroSingleton {
    private String rodas;
    private String chassi;
    private String portas;

    public String getRodas() {
        return rodas;
    }

    public void setRodas(String rodas) {
        this.rodas = rodas;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }
}
