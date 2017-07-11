package org.java.linkedlist;

class Node {
	int number;
	public Node next;
	public Node previous;

	public Node(int number) {
		this.number = number;
	}

}

public class Linkedlist {
	Node head;
	Node tail;

	public void AppendElement(int number) {
		if (head == null) {
			head = new Node(number);
			tail = head;
			return;
		}
		Node newNode = new Node(number);
		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;
	}

	public void removeTail() {
		if (tail == null)
			return;
		if (tail.previous == null) {
			head = null;
			tail = null;
		} else {

			tail = tail.previous;
			(tail.next).previous = null;
			tail.next = null;

		}

	}

	public void removeNode(Node node) {
		if (node == null) {
			return;
		}
		if (head == node) {
			head = head.next;
			head.previous.next = null;
			head.previous = null;
		} else if (tail == node) {
			removeTail();
		} else {
			(node.previous).next = node.next;
			(node.next).previous = node.previous;
			node.next = null;
			node.previous = null;
		}
	}

	public void RemoveAllGraterValues(int number) {

		Node temp = head;
		while (temp != null) {
			if (temp.number > number) {
				Node delete =temp;
				temp=temp.next;
				removeNode(delete);

			} else {
				temp = temp.next;
			}
		}
	}

	public void displayNumber() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.number + "\t");
			temp = temp.next;
		}
	}
}
