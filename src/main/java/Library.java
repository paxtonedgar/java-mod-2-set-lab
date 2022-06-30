import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Library {
    HashMap<String, LinkedList<Object>> catalog = new  HashMap<String, LinkedList<Object>>();
    Set<String> UniqueGenre = new HashSet<String>();

    public HashMap<String, LinkedList<Object>> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<String, LinkedList<Object>> catalog) {
        this.catalog = catalog;
    }

    public void addCatalog(LinkedList<Object> bookEntry) {
        Object Title = bookEntry.pop(); 
        this.catalog.put(Title.toString(), bookEntry); 
    } 
    public void printCatalog() {
        for (String name: catalog.keySet()) {
            String key = name.toString();
            String value = catalog.get(name).toString();
            System.out.println(key + " " + value);
        }
    }
    public void printGenres(){
        if(UniqueGenre.isEmpty()){
            GenreSet();
        }
        System.out.println(UniqueGenre);
    }

    public void CheckGenres(String res){
        if(UniqueGenre.isEmpty()){
            GenreSet();
        }
        
        if(UniqueGenre.contains(res)){
            System.out.println( "We do indeed have that genre");
        }else{
            System.out.println( "Sorry, we dont seem to have that one");
        }

    }

    public void GenreSet(){
        catalog.forEach((k,v) -> {
            LinkedList<Object> entry = catalog.get(k);
            Object gen = entry.get(0);
            UniqueGenre.add(gen.toString().toLowerCase());
        });
    }
    
}
