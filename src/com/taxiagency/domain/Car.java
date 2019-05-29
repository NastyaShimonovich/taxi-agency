package com.taxiagency.domain;

public class Car implements Entity{
    private String id;
    private Color color;
    private String number;
    public Car (Color color, String number){
        this.color = color;
        this.number = number;
    }


    public String getid() {
        return null;
    }


    public void setid(String string) {

    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId(String str) {

    }
}
