package com.problem.Book;
import com.problem.Book.Selector;


public abstract class FactoryAbstract {

         public abstract Type getType(TypeSelector type);
         public abstract Book getBook(Selector type);

}
