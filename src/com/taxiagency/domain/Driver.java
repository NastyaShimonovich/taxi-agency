package com.taxiagency.domain;

public class Driver implements Entity {

    private String id;
    private String name;
    public Driver(String id, String name){
        this.name = name;
    }


    @Override
    public String toString(){
        return  "id = " + id +
                ", Name = " + name;
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
