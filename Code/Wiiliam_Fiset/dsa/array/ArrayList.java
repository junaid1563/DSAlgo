package dsa.array;
import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class ArrayList<T> implements Iterable<T> {
	T[] arr;
	int len;
	int capacity;

	public ArrayList() {
		this(16);
	}

	public ArrayList(int capacity) {
		arr = (T[]) new Object[capacity];
		this.capacity = capacity;
		this.len = 0;
	}

	public int size() {
		return len ;
	}

	public boolean isEmpty() {
		return this.size() == 0 ? true : false;
	}

	public T get(int index) {
		return arr[index];
	}

	public void set(T value, int index) {
		arr[index] = value;
	}

	public void add(T value) {
		// if capacity is reached
		if (this.len > capacity) {
			T[] narr = (T[]) new Object[capacity * 2];

			for (int i = 0; i < len; i++) {
				narr[i] = arr[i];
			}
			narr[len] = value;
			this.capacity *= 2;
			this.len += 1;
			this.arr = narr;
		} else {
			// if capacity is not reached
			arr[len] = value;
			this.len++;
		}
	}

	public T removeAt(int index) {
		if (index < 0 || index > len) {
			throw new IndexOutOfBoundsException("Illegal Value of Index");
		}
		T data = arr[index];
		arr[index] = null;
		// left shift all values from index till end of array
		for (int i = index; i < len - 1; i++) {
			arr[i] = arr[i + 1];
		}
		this.len--;
		return data;
	}

	public boolean remove(Object obj) {
		for (int i = 0; i < len; i++) {
			if (arr[i].equals(obj)) {
				removeAt(i);
				return true;
			}
		}
		return false;
	}

	public int indexOf(Object obj) {
		for (int i = 0; i < len; i++) {
			if (arr[i].equals(obj)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(Object obj) {
		return indexOf(obj) != -1 ? true : false;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator() {
			int index = 0;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < len;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return arr[index++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}

		};
	}

	@Override
	public String toString() {
		T[] arrstr = (T[]) new Object[len];
		for (int i = 0; i < len; i++) {
			arrstr[i] = arr[i];
		}
		return "ArrayList [] = " + Arrays.toString(arrstr);
	}

}