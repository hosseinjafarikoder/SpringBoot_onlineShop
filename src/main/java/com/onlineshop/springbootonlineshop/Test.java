package com.onlineshop.springbootonlineshop;

public class Test {

    public static void main(String[] args) throws Exception {
        test2();
        while (true){

        }
    }

    public static void test1() throws Exception {
        try {
            int a = 1/0;
        }catch (Exception e){
            System.out.println("exception in test 1");
            throw new Exception(e);
        }
    }

    public static void test2() throws Exception {
        try {
            test1();
        }catch (RuntimeException e){
            System.out.println("test 2 block catch");
            //throw new Exception(e);
        }
    }
}
