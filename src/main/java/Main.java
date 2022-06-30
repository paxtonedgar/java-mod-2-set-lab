import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        userInput(sc);
    }

    public static void userInput(Scanner sc){
        System.out.println("Welcome to the Libraries Book entry!");
        Library lib = new Library();  
        MenuOptions menuOptions = MenuOptions.z;

        while (menuOptions != MenuOptions.q)
            try
            {
                menu();
                menuOptions = MenuOptions.valueOf(sc.nextLine());
                switch (menuOptions)
                {
                    case a:
                        Book newBook = new Book(); 
                        LinkedList<Object> bookEntry = newBook.create(sc); 
                        lib.addCatalog(bookEntry);
                        break;
                    case b:
                        System.out.println();
                        lib.printCatalog();
                        break;
                    case c: 
                        System.out.println();
                        lib.printGenres(); 
                        break;
                    case d: 
                        System.out.println();
                        String res = sc.nextLine(); 
                        res = res.trim().toLowerCase().toString();
                        lib.CheckGenres(res); 
                        break;
                    case q:
                        System.out.println("Goodbye.");
                        break;

                    default:
                        System.out.println("Selection out of range. Try again");
                }
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Selection out of range. Try again:");
            }
    }

    enum MenuOptions{
        z("Continue"), a("Create Book Entry"), b("Display Catalog"),  c("Display Genres"),
        d("Search Genres"), q("Quit");

        // field
        private String meaning;
        // constructor
        MenuOptions(String meaning)
        {
            this.meaning = meaning;
        }
        // getters
        public String getMeaning()
        {
            return meaning;
        }

    }

    public static void menu()
    {
        System.out.println("\nEnter:");
        System.out.println("\ta. Create Book Entry");
        System.out.println("\tb. Display Catalog");
        System.out.println("\tc. Display Genres");
        System.out.println("\td. Search Genres");
        System.out.println("\tq. Quit Application.");
        System.out.print("\nSelection -> ");

    }


}
