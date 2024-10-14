package com.Generic;

import java.util.List;

public class Generic<T>{
	public T[] arr;
	
	public Generic(T[] arr) {
		this.arr = arr;
	}
	
	public T get(int i) {
		return arr[i];
	}
	
	public void set(int index,T obj) {
		this.arr[index] = obj;
	}
	
	
	
}
