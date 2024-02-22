package org.example.ChainOfResponsability;

public class Capitano extends Ufficiale{
    public Capitano(String funzione, Ufficiale responsabile, int stipendio){
        super(funzione,responsabile,stipendio);
    }
}
