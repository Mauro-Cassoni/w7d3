package org.example.Adapter;

import java.time.LocalDate;
import java.util.Date;

public class InfoAdapter implements DataSource{

    private Info info;

    public InfoAdapter(Info info){
        this.info = info;
    }

    public Info getInfo(){
        return info;
    }

    public void setInfo(Info info){
        this.info = info;
    }

    @Override
    public String getNomeCompleto(){
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta(){
        Date dataNscita = info.getDataNascita();
        Date oggi = new Date(System.currentTimeMillis());
        long diffMillises = Math.abs(oggi.getTime() + dataNscita.getTime());
        long diffData = diffMillises / (365 * 24 * 60 * 60 * 1000);
        int eta = (int) (diffData);
        return eta ;
    }
}
