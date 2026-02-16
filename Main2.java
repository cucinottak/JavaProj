import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: Keira Cucinotta
// Notes: The instructions are found in comments through the code starting with "Step n"
//        Please leave the comments and add your code just after the comment.
//        Use the examples in the book to complete the lab.

public class Main2 {

    public static void main(String[] args) {
        Lab2 lab = new Lab2();

        // Comment/Uncomment the following 3 method calls as you work on each method.
        // No code should be added to the main method. All of your code will go into the methods in Lab2.
        lab.linkedList();
        lab.queue();
        lab.stack();
    }
}

class Lab2 {

    public void linkedList() {

        // 1. Create a LinkedList<String> object called progLanguages
        LinkedList<String> progLanguages = new LinkedList<>();

        // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"
        progLanguages.add("Java");
        progLanguages.add("Python");
        progLanguages.add("JavaScript");
        progLanguages.add("C++");

        // 3. Remove the element "C++" from the list using .remove()
        progLanguages.remove("C++");

        // 4. Add an element "HTML" at index 2.
        progLanguages.add(2, "HTML");

        // 5. Iterate over progLanguages and use println()
        Iterator<String> it = progLanguages.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void queue() {

        // 6. Create a Queue<String> called q
        Queue<String> q = new LinkedList<>();

        // 7. Add 5 first names to q.
        q.add("Jory");
        q.add("Dom");
        q.add("Noah");
        q.add("Mia");
        q.add("Jaida");

        // 8. Print elements
        System.out.println("Elements of queue: " + q);

        // 9. Remove head
        String removedElement = q.remove();
        System.out.println("Removed element: " + removedElement);

        // 10. Peek at head
        System.out.println("Head of queue: " + q.peek());

        // 11. Print remaining elements
        for (String element : q) {
            System.out.println(element);
        }
    }

    public void stack() {

        // 12. Create a Stack<String> called bookStack
        Stack<String> bookStack = new Stack<>();

        // 13. Push books
        bookStack.push("Clean Code");
        bookStack.push("Design Patterns");
        bookStack.push("Pragmatic Programmer");

        // 14. Pop one book
        String poppedBook = bookStack.pop();
        System.out.println("Popped: " + poppedBook);

        // 15. Peek top
        System.out.println("Top book: " + bookStack.peek());

        // 16. Push new book
        bookStack.push("Web DB Technologies");

        // 17. Peek again
        System.out.println("Top book after push: " + bookStack.peek());

        // 18. Search
        System.out.println("Search result for 'Design Patterns': "
                + bookStack.search("Design Patterns"));

        // 19. Check if empty
        System.out.println("Is stack empty? " + bookStack.empty());

        // 20. Print all books
        for (String book : bookStack) {
            System.out.println(book);
        }
    }
}
