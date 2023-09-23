package dio.lab.tarciosilva.api;

import dio.lab.tarciosilva.diolabtsiva.singleton.CarroSingletonACombustao;
import nonapi.io.github.classgraph.json.JSONUtils;

public class CepApi {
    private static class CepApiInstancy {
        public static CepApi cepApi;
        static {
            cepApi = new CepApi();
        }
    }
    private CepApi() {
        super();
    }

    public static CepApi getCepApi() {
        return CepApiInstancy.cepApi;
    }

    public String getCidade(String cep) {
        return "Joao Pessoa";
    }
    public String getEstado(String cep) {
        return "Paraiba";
    }

}
