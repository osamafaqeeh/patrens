package com.problem.Book;

public class FactoryProduce {
    public static FactoryAbstract getFactory(FactorySelector factorySelector){
        if (factorySelector==FactorySelector.FACTORY_TYPE){
            return new FactoryType();
        }
        else if (factorySelector==FactorySelector.FACTORY_BOOK){
            return new FactoryBook();
        }
        return null;
    }
}
