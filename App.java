package org.java.linkedlist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist list = new Linkedlist();
		list.AppendElement(3);
		list.AppendElement(4);
		list.AppendElement(6);
		list.AppendElement(8);
		list.AppendElement(2);
		list.displayNumber();
		System.out.println("\n Removing Node from tail");
		list.removeTail();
		list.displayNumber();
		System.out.println("\n Removing Nodes having value graterthan 5");
		list.RemoveAllGraterValues(5);
		list.displayNumber();

	}

}
