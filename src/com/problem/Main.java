package com.problem;
import com.problem.Book.*;
public class Main {

    public static void main(String[] args) {


        FactoryAbstract factoryProduce1=FactoryProduce.getFactory(FactorySelector.FACTORY_BOOK);
        System.out.println( factoryProduce1.getClass());
        Book book1=factoryProduce1.getBook(Selector.MATH_BOOK);

        book1.name();
        book1.price();



    }
}
