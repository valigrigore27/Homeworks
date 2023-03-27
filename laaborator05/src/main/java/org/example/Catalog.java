package org.example;

import org.w3c.dom.stylesheets.DocumentStyle;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    List <Document> documents = new ArrayList<>();

    public List<Document> getDocuments() {
        return documents;
    }

    public void add(Document document) {
        documents.add(document);
    }

    public Document findDocumentById(int id) {
    for(Document document : documents){
        if(document.getId()==id) return document;
    }
        return null;
    }

}
