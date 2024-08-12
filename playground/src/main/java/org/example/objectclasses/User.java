package org.example.objectclasses;

public class User {
    String name = "Ayra11";

    User(){
        //this.name = "Default";
        this("Default");
    }

    User(String name){
        name = "Arya";
        this.name = name;
        this.name+=name;
        System.out.println("user arya - "+name);
        System.out.println("user arya this - "+this.name);

    }

    User print(){
        return this;
    }


}
