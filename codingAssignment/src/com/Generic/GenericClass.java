package com.Generic;

public class GenericClass<T> {
	
	public T[] t;

	public GenericClass(T[] t) {
		super();
		this.t = t;
	}
	
	public T get(int i) {
		return t[i];
	}
	
	public void set(int index,T obj) {
		this.t[index] = obj;
	}
	

}
