package org.example.ChainOfResponsability;

public abstract class Ufficiale {

    private String funzione;
    private Ufficiale responsabile;
    private int stipendio;

    public Ufficiale(String funzione, Ufficiale responsabile, int stipendio){
        this.funzione = funzione;
        this.responsabile = responsabile;
        this.stipendio = stipendio;
    }

    public String getFunzione(){
        return funzione;
    }

    public Ufficiale getResponsabile(){
        return responsabile;
    }

    public int getStipendio(){
        return stipendio;
    }

    public void confrontaStipendi(int stipendioRiferimento){
        if (getStipendio() >= stipendioRiferimento){
            System.out.println(getFunzione() + " ha uno stipendio maggiore di " + stipendioRiferimento);
        } if (getResponsabile() != null){
            getResponsabile().confrontaStipendi(stipendioRiferimento);
        }
    }
}
