package dio.lab.tarciosilva.diolabtsiva.facede;

import dio.lab.tarciosilva.api.CepApi;
import dio.lab.tarciosilva.diolabtsiva.singleton.CarroEletrico;
import dio.lab.tarciosilva.subsystem.Service;

public class Facede {
    private static class FacedeHoder {
        public static Facede FacedeInstancy = new Facede();
    }
    private Facede(){
        super();
    }
    public static Facede getInstacy() {
        return FacedeHoder.FacedeInstancy;
    }

    public void updateCliente(String nome, String cep) {
        String cidade = CepApi.getCepApi().getCidade(cep);
        String estado = CepApi.getCepApi().getEstado(cep);

        Service.clientPersist(nome, cep, cidade, estado);
    }
}
