package com.campusdual;

public class Exercise03 {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.method();

        String text = function("Pablo");
        System.out.println(text);

        procedure();
    }

    private static void procedure(){
        System.out.println("I'm a procedure!");
    }

    private static String function(String name){
        return "Hello " + name;
    }
}


class Thing {
    public void method(){
        System.out.println("I'm a method!");
    }
}
