package com.problem.Book;

public class ImplMagazine implements Book {
    @Override
    public void price(){
        System.out.println("this is a magazine price");
    }
    @Override
    public void name(){
        System.out.println("this is a magazine name");
    }
}
