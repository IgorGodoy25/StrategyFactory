package codigo;

// PRODUTO ABSTRATO

public interface UnidadeMilitar {
	
    void atacar();
    void mover();
    void lista();
    void stats();
    
    void setEstrategia(Estrategia estrategia);
    Estrategia getEstrategia();
}