package com.problem.Book;


public class FactoryType extends FactoryAbstract {

    @Override
    public Book getBook(Selector type){
        return null;
    }

    public Type getType(TypeSelector type){
        if (type==null){
            return null;
        }
        if (type==TypeSelector.FUNNY_TYPE){
            return new ImplFunny();
        }
       else if (type==TypeSelector.ROMANTIC_TYPE){
            return new ImplRomantic();
        }
       else
        {
            return null;
        }
    }
}
