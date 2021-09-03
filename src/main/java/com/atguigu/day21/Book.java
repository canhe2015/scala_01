package com.atguigu.day21;

import org.junit.Test;

public class Book {
    public static void main(String[] args){
        System.out.println("hello, java");
    }


    public static int add(int x, int y){
        return x + y;
    }

    @Test
    public void test(){
        int c = Book.add(2,3);
        System.out.println(c);
    }


}
