package Generics;

import java.util.*;

public class gClass<T, E> {
	private T a;
	private E b;

	gClass(T x, E y) {
		this.a = x;
		this.b = y;
	}
void display() {
	System.out.println(this.a);
	System.out.println(this.b);
}
}
