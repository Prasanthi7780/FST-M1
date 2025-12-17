import java.util.ArrayList;

public class activity9 {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("David");
        myList.add("Eva");

        // Print all names using for loop
        System.out.println("Names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Retrieve the 3rd name (index 2)
        System.out.println("\n3rd name: " + myList.get(2));

        // Check if a name exists
        String nameToCheck = "Bob";
        System.out.println(nameToCheck + " exists? " + myList.contains(nameToCheck));

        // Print size of the list
        System.out.println("Total names: " + myList.size());

        // Remove a name and print size again
        myList.remove("David");
        System.out.println("After removal, total names: " + myList.size());
    }
}

