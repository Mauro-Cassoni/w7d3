package org.example.Adapter;

public class Adapter implements DataSource{

    private Info info;

    public Adapter(Info info){
        this.info = info;
    }

    public Info getInfo(){
        return info;
    }

    public void setInfo(Info info){
        this.info = info;
    }

    @Override
    public
}
