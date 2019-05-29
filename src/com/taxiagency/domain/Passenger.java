package com.taxiagency.domain;

public class Passenger implements Entity, Comparable<Passenger> {
    private String id;
    private String name;
    private String mobilePhone;
    public Passenger(String id, String name, String mobilePhone){
        this.name = name;
        this.mobilePhone = mobilePhone;
    }

    public String getId() {
        return id;
    }

    @Override
    public void setId(String str) {

    }

    public String getName() {
        return name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }
    @Override
    public String toString(){
        return  "id = " + id +
                ", Name = " + name +
                ", Mobile Phone = " + getMobilePhone();
    }



    public String getid() {
        return null;
    }


    public void setid(String string) {

    }

    @Override
    public int compareTo(Passenger o) {return 0;

    }
}
