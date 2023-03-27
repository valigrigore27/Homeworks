package org.example;

import java.util.List;

public class ListCommand implements Command {
   private Catalog catalog;

  public ListCommand(Catalog catalog){
       this.catalog=catalog;
   }
   public Catalog getCatalog(){
      return catalog;
   }
   @Override
    public void execute(){
             for (Document document : catalog.getDocuments()) {
                 System.out.println(document);
             }
    }
}
