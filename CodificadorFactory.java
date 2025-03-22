public class CodificadorFactory {

    private static CodificadorFactory instancia;


    private CodificadorFactory() {}


    public static CodificadorFactory getInstancia() {
        if (instancia == null) {
            instancia = new CodificadorFactory();
        }
        return instancia;
    }


    public Codificador criarCodificador() {
        return new CodificadorSimples();
    }
}
