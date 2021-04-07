package com.poc.generic;

public class GenericNode<T> {

	protected T data;
	protected GenericNode<T> previous;
	protected GenericNode<T> next;

	public GenericNode(T data) {
		super();
		this.data = data;
	}
}
