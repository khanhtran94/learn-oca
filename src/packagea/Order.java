package packagea;

import java.io.IOException;

public class Order {
    static String result = "";
    String test;

    {
        result += "c";
    }

    static {
        result += "u";
    }

    {
        result += "r";
    }

    public void ohNo() throws IOException {
        System.out.println("a");
//        throw new Exception(); do IOException ke thu tu exception
//        throw new IllegalArgumentException();
//        throw new java.io.IOException();
        throw new RuntimeException();
    }

}

