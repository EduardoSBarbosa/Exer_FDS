import java.time.LocalDate;

public class CodificadorReverso implements Codificador {

    @Override
    public String getNome() {
        return "Codificador Reverso";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    @Override
    public int getNivelSeguranca() {
        return 1; // Nível de segurança muito baixo
    }

    @Override
    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder(str);
        return encoded.reverse().toString();
    }

    @Override
    public String decodifica(String str) {
        StringBuilder decoded = new StringBuilder(str);
        return decoded.reverse().toString();
    }
}
