package main;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
	List<T> values;

	public Box() {
		this.values = new ArrayList<T>();
	}

	public void add(T value) {
		this.values.add(value);
	}

	public List<T> get() {
		return this.values;
	}

}
