package it.unibo.oop.lab.collections1;

import java.util.*;
/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
    	
    	final List<Integer> list = new ArrayList<Integer>();
    	for (int i=1000; i<2000; i++) {
    		list.add(i);
    	}
    	
    	final List<Integer> list2 = new LinkedList<Integer>();
    	list2.addAll(list);
    	
    	int temp = list.get(0);
    	list.set(0, list.get(list.size()-1));
    	list.set(list.size()-1, temp);

    	for (int i : list) {
    		System.out.println(i);
    	}
    	
    	long time = System.nanoTime();
    	for (int i=0; i<100000; i++) {
    		list.add(i);
    	}
    	time = System.nanoTime() - time;
    	System.out.println("add 100.000 elems in Arraylist, time: " + time);
    	
    	long time2 = System.nanoTime();
    	for (int i=0; i<100000; i++) {
    		list2.add(i);
    	}
    	time2 = System.nanoTime() - time2;
    	System.out.println("add 100.000 elems in Linkedlist, time: " + time2);
    	
    	long time3 = System.nanoTime();
    	for (int i=0; i<1000; i++) {
    		list.get(list.size()/2);
    	}
    	time3 = System.nanoTime() - time3;
    	System.out.println("read 1000 elems in the middle of Arraylist, time: " + time3);
    	
    	long time4 = System.nanoTime();
    	for (int i=0; i<1000; i++) {
    		list2.get(list2.size()/2);
    	}
    	time4 = System.nanoTime() - time4;
    	System.out.println("read 1000 elems in the middle of Linkedlist, time: " + time4);
    	
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    }
}
