/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author Enubs
 */
public class SinglyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       Person [] person = new Person[5];
      
        
        person[0] = new Person("Aldrin", "Wabingga", "Panacan,");
    	person[1] = new Person("Jonh", "Labandan", "Panacan,");
    	person[2] = new Person("Sherwin", "Dagoling", "Tibungco,");
    	person[3] = new Person("Dominique", "Tuloy", "Gensan,");
    	person[4] = new Person("Terrence", "Romeo", "Imus Cavite,");
        
    	
                
    	SNode<String> node1 = new SNode<String>(person[0].get_FullName(), null);
    	SNode<String> node2 = new SNode<String>(person[1].get_FullName(), null);
    	SNode<String> node3 = new SNode<String>(person[2].get_FullName(), null);
    	SNode<String> node4 = new SNode<String>(person[3].get_FullName(), null);
    	SNode<String> node5 = new SNode<String>(person[4].get_FullName(), null);
        
       
    	
    	SList<String> sList = new SList<>();
        
    	sList.addFirst(node1);
    	sList.addFirst(node2);
        sList.addFirst(node3);
        sList.addFirst(node4);
        sList.addFirst(node5);
        
        
        System.out.println("\nBefore removeFirst()");
        sList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        System.out.println();
        
        System.out.println("\nAfter removeFirst()");
        sList.addFirst(node1);
        sList.addFirst(node5);
        sList.addLast(node3);
        sList.showList();
        System.out.println();
    }
}