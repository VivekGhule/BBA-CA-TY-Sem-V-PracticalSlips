// import the LinkedList class
import java.util.LinkedList;
// import the Iterator and ListIterator interfaces
import java.util.Iterator;
import java.util.ListIterator;

// create a class LinkedListDemo
public class LinkedListDemo {

  // create a main method
  public static void main(String[] args) {
    // create a LinkedList object
    LinkedList<String> list = new LinkedList<>();

    // add elements to the list
    list.add("CPP");
    list.add("Java");
    list.add("Python");
    list.add("PHP");

    // display the contents of the list using an Iterator
    System.out.println("Contents of the list using an Iterator:");
    Iterator<String> itr = list.iterator(); // get an iterator
    while (itr.hasNext()) { // loop until the end of the list
      System.out.println(itr.next()); // print the current element
    }

    // display the contents of the list in reverse order using a ListIterator
    System.out.println("Contents of the list in reverse order using a ListIterator:");
    ListIterator<String> litr = list.listIterator(list.size()); // get a list iterator at the end of the list
    while (litr.hasPrevious()) { // loop until the beginning of the list
      System.out.println(litr.previous()); // print the current element
    }
  }
}
