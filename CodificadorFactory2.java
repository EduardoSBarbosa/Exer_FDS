public class CodificadorFactory2 {

    CodificadorSimples cod1 = new CodificadorSimples();
    CodificadorReverso cod2 = new CodificadorReverso();
    CodificadorCesar cod3 = new CodificadorCesar(1);
    int aux;

    public Codificador nvlDeSegurancaMaisProx(int nvl) {

        aux = nvl;
        
        if (getAbs(cod1) < getAbs(cod2) && getAbs(cod1) < getAbs(cod3))
            return cod1;
        else if (getAbs(cod2) < getAbs(cod3))
            return cod2;
        else if (getAbs(cod3) < getAbs(cod2))
            return cod3;

        return null;
        
    }

    private int getAbs(Codificador cod) {
        return Math.abs(cod.getNivelSeguranca() - aux);
    }
    
}
