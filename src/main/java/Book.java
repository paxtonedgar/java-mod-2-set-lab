import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Book extends Library {
    String Title; 
    String Genre; 
    int pageCount; 
    LinkedList<Object> entry = new LinkedList<>(); 

    public LinkedList<Object> create(Scanner sc){
        
        System.out.println("Title?");
        Title = sc.nextLine(); 
        System.out.println();

        System.out.println("Genre?");
        Genre = sc.nextLine();
        System.out.println();

        System.out.println("How many pages are in the book?");
        pageCount = sc.nextInt();
        System.out.println();

        
        entry.add(0, Title); 
        entry.add(1, Genre); 
        entry.add(2, pageCount); 

        return entry; 
    }


}
