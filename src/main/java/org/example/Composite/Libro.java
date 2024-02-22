package org.example.Composite;

import java.util.ArrayList;
import java.util.List;

public class Libro extends ComponenteLibro{

    public String nome;
    public String autore;
    public double prezzo;
    private List<ComponenteLibro> componenti;

    @Override
    public int getNumeroPagine(){
        return componenti.stream().mapToInt(componenti -> componenti.getNumeroPagine()).sum();
    }

    public Libro(String nome, String autore, List<ComponenteLibro> componenti){
        this.nome = nome;
        this.autore = autore;
        this.componenti = componenti;
    }

    public String getNome(){
        return nome;
    }

    public String getAutore(){
        return autore;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAutore(String autore){
        this.autore = autore;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
}
