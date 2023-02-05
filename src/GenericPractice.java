import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;

public class GenericPractice <M extends Number & Comparable<M>> {
    private M initVal;
    private LinkedList<M> list;

    GenericPractice(M val){
        this.initVal = val;
        this.list = new LinkedList<>();
    }

    //this method will add val to the ArrayList
    void storeValue(M val){
        list.add(val);
    }

    //this method will replace the value at "index with val".
    void changeValue(M val, int index) {
        if(index < list.size()){
            list.set(index, val);
        }
    }
    //print out the values of the ArrayList using an iterator. Print “empty list” if the list is empty.
    void printArray() {
        if(list.size() == 0){
            System.out.println("empty list");
        }
        else{
            Iterator<M> curr = list.iterator();

            while (curr.hasNext()){
                System.out.println(curr.next());
            }
        }
    }

    //sort the values in the ArrayList and print using a for-each loop.
    void sortPrintArray() {
        Collections.sort(list);
        for (M t: list){
            System.out.println(t);
        }
    }
    //sort ArrayList values in reverse order and print the values using a forEach method.
    void sortReversePrintArray() {
        Collections.sort(list, Collections.reverseOrder());
        for (M t: list){
            System.out.println(t);
        }
    }
    //clears the values in the ArrayList
    void clearList() {
        list.clear();
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        GenericPractice<Double> t = new GenericPractice<>(2.0);
        t.storeValue(3.0);
        t.storeValue(1.33);
        t.storeValue(1.32);
        t.storeValue(1.31);
        System.out.println("Unsorted:");
        t.printArray();
        System.out.println("Sorted:");
        t.sortPrintArray();
    }
}
