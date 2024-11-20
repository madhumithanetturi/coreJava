package com.neoteric.PolymorphismwithAbstract;

public abstract class AngularWebsite implements Website{

    @Override
    public String Header() {
        return "Header";
    }

    @Override
    public String Footer() {
        return "Footer";
    }



    @Override
    public String Body() {
        return "Body";
    }

    protected String page(){
        Header();
        Body();
        Footer();
        return this.getClass().getName();
    }
}
