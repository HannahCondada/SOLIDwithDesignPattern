package SOLIDwithDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class MainLibrary {
    public static void main(String[] args){

        Student stud1 = new Student("Hannah Condada");
        Student stud2 = new Student("Jane Doe");

        Map<String, BorrowResource> resource = new HashMap<>();

        resource.put("researchArticle", new ResourceType());
        Resources researchArticle = new Resources("Methodological Rigor in Journal of Counseling & Development \nQualitative Research Articles: A 15-Year Review\nby Danica G. Hays, Chris Wood, Heather Dahl, Andrea Kirk-Jenkins ", "researchArticle");

        resource.put("book", new ResourceType());
        Resources book = new Resources("City of Angels \nby Kenneth Bromberg", "book");

        ResourceChecker resourceProcessor = new ResourceChecker(resource);

        resourceProcessor.borrowResource(stud1, researchArticle);
        System.out.println();

        resourceProcessor.borrowResource(stud2, book);
        System.out.println();

    }
}