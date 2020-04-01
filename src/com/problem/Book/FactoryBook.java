package com.problem.Book;


public class FactoryBook extends FactoryAbstract {
   @Override
   public Type getType(TypeSelector type){
    return null;
   }
   @Override
  public Book getBook(Selector type){

      if (type==null){
          return null;
      }
     else if (type==Selector.MATH_BOOK){
          return new ImplMathBook();
      }
     else if (type==Selector.STORY_BOOK){
          return new ImplStory();
      }
     else if(type==Selector.MAGAZINE_BOOK){
         return new ImplMagazine();
      }
      else {
          return null;
      }

    }
}
