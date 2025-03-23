import java.time.LocalDate;

public class CodificadorCesar implements Codificador {
    private int shift;

    public CodificadorCesar(int shift) {
        this.shift = shift;
    }

    @Override
    public String getNome() {
        return "Codificador César";
    }

    @Override
    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 3, 19);
    }

    @Override
    public int getNivelSeguranca() {
        return 5; // Nível de segurança baixo
    }

    @Override
    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encoded.append((char) ((c - base + shift) % 26 + base));
            } else {
                encoded.append(c); // Caracteres não alfabéticos são adicionados sem alteração
            }
        }
        
        return encoded.toString();
    }

    @Override
    public String decodifica(String str) {
        StringBuilder decoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                decoded.append((char) ((c - base - shift + 26) % 26 + base));
            } else {
                decoded.append(c); // Caracteres não alfabéticos são adicionados sem alteração
            }
        }

        return decoded.toString();
    }
}
