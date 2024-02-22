package org.example.Composite;

import java.util.List;

public class Sezione extends ComponenteLibro {

    private List<ComponenteLibro> componenti;

    public Sezione(List<ComponenteLibro> componenti){
        this.componenti = componenti;
    }

    @Override
    public int getNumeroPagine(){
        return componenti.stream().mapToInt(componenti -> componenti.getNumeroPagine()).sum();
    }
}
