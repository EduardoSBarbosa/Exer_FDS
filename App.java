public class App {
    public static void main(String[] args) throws Exception {
        CodificadorFactory factory = CodificadorFactory.getInstancia();


        Codificador cod = factory.criarCodificador();

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);

        // Teste com CodificadorCesar
        Codificador codCesar = new CodificadorCesar(3); // Shift de 3
        System.out.println("\nCodificador: " + codCesar.getNome());
        System.out.println("Versão: " + codCesar.getDataCriacao());
        System.out.println("Nível de segurança: " + codCesar.getNivelSeguranca());
        
        codificado = codCesar.codifica(texto);
        decodificado = codCesar.decodifica(codificado);

        System.out.println("\nTexto original: " + texto);
        System.out.println("Texto codificado: " + codificado);
        System.out.println("Texto decodificado: " + decodificado);

        // Teste com CodificadorReverso
        Codificador codReverso = new CodificadorReverso();
        System.out.println("\nCodificador: " + codReverso.getNome());
        System.out.println("Versão: " + codReverso.getDataCriacao());
        System.out.println("Nível de segurança: " + codReverso.getNivelSeguranca());
        
        codificado = codReverso.codifica(texto);
        decodificado = codReverso.decodifica(codificado);

        System.out.println("\nTexto original: " + texto);
        System.out.println("Texto codificado: " + codificado);
        System.out.println("Texto decodificado: " + decodificado);
    
    }
}
