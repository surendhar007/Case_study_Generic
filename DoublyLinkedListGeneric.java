package com.poc.generic;

import java.util.Objects;

public class DoublyLinkedListGeneric<T> {
	private GenericNode<T> head;

	public <T> DoublyLinkedListGeneric(T head) {
		super();
		GenericNode newNode = new GenericNode(head);
		newNode.next = null;
		newNode.previous = null;
		this.head = newNode;
	}

	public <T> GenericNode getHead() {
		return head;
	}

	public <T> GenericNode<T> insertFirst(T value) {
		GenericNode temp = new GenericNode(value);
		temp.next = temp.previous = null;
		if (head == null) {
			head = temp;
		} else {
			temp.next = getHead();
			head.previous = temp;
			head = temp;
		}
		return (GenericNode<T>) head;
	}

	public <T> GenericNode<T> insertLast(T value) {
		GenericNode temp = new GenericNode(value);
		GenericNode it = getHead();
		if (head == null) {
			insertFirst(value);
		} else {
			while (it.next != null) {
				it = it.next;
			}
			it.next = temp;
			temp.previous = it;
		}
		return (GenericNode<T>) head;
	}

	public <T> GenericNode<T> InsertAtIndex(T value, int index) {
		GenericNode temp = new GenericNode(value);
		GenericNode it = getHead();
		if (index < 0 || index > size()) {
			// when index is not present in the range of list
			System.out.println("Given index is out of the range or invalid");
			return (GenericNode<T>) head;
		}
		if (head == null) {
			if (index == 0) {
				insertFirst(value); // when no nodes are there in doubly linked list. and if index is 0 then
									// creating a node and referencing head
			}
		} else if (index == 0) {
			insertFirst(value); // when index is 0 which means inserting node at first. And referencing newly
								// added node as head
		} else if (index == size()) {
			insertLast(value); // when index is same as size which is inserting node at last.
		} else {
			for (int i = 1; i < index; i++) {
				it = it.next; // moving iterator before the position to be inserted
			}
			temp.next = it.next;
			it.next = temp;
			temp.previous = it;
			temp.next.previous = temp;
		}
		return (GenericNode<T>) head;
	}

	public <T> GenericNode<T> removeFirst() {
		if (head == null) {
			return (GenericNode<T>) head; // Base condition
		} else if (head.next == null) {
			head = head.next; // base condition
		} else {
			head = head.next; // changing head position to next node and dereferencing the old head node
			head.previous = null;
		}
		return (GenericNode<T>) head;
	}

	public <T> GenericNode<T> removeLast() {
		if (head == null) {
			return (GenericNode<T>) head;
		} else if (head.next == null) {
			removeFirst();
		} else {
			GenericNode temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			GenericNode<T> removable = temp.next;
			temp.next = null;
			removable.previous = null;
		}
		return (GenericNode<T>) head;
	}

	public <T> GenericNode<T> removeAtIndex(int index) {
		if (index < 0 || index > size()) {
			System.out.println("Given Index is out of range or invalid");
			return (GenericNode<T>) head;
		}
		if (head == null) {
			return (GenericNode<T>) head;
		} else if (index == 0) {
			removeFirst();
		} else if (index == size()) {
			removeLast();
		} else {
			GenericNode it = getHead();
			for (int i = 1; i < index; i++) {
				it = it.next;
			}
			if (it.next.next == null) {
				it.next = null; // when given index is at last point
				return (GenericNode<T>) head; // consider this as base case where index == size -1
			}
			GenericNode temp = it.next;
			it.next = temp.next;
			temp.next.previous = it;
		}
		return (GenericNode<T>) head;
	}

	@SuppressWarnings("unchecked")
	public int find(T search) {
		GenericNode temp = head;
		int index = 0;
		System.out.println(search);

		T findValue = search; // assigning search data to temporary variable
		T tempValue = head.data; // assigning head data to another temporary variable
		while (temp.next != null) {
			if (Objects.equals(tempValue, findValue)) {
				return index;
			}
			index++;
			temp = temp.next;
			tempValue = (T) temp.data;
		}
		if (Objects.equals(tempValue, findValue)) {
			return index; // if given node is present at last;
		}
		return -1;
	}

	public void displayElements() {
		GenericNode<T> temp = this.head;
		if (temp == null) {
			System.out.println("----------*The Doubly Linked List is empty*---------");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " <=> ");
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("null");
		}
		System.out.println(" ");
	}

	public int size() {
		GenericNode temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
}
