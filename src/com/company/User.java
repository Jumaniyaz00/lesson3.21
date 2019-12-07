package com.company;

public class User {
    private  String  name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if(name.length()>20){
            throw new IllegalNameLengthException("слишком длинное имия", name );
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age> 100 || age<0){
             throw new IllegalAgeException("неправилно указали возрст");
        }
        this.age = age;
    }
    public  void getInfo() {
        System.out.println( " name " + getName()+ "\n"+
                " age :" + getAge());
    }
}
