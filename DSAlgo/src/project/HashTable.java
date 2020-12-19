package project;

public class HashTable {

	private stLinkedlist[] arr;
	private int size;
	private int totalstudents;

	public HashTable() {
		size = 1000;
		arr = new stLinkedlist[size];

	}

	// toHashCode
	public int tohashcode(String roll_no) {
		int sum = 0;
		int code = 0;
		for (int i = 0; i < roll_no.length(); i++) {
			sum = sum + (int) roll_no.charAt(i);

		}
		code = sum % roll_no.length();

		return code;
	}

	// insert()
	public boolean insert(int key, students data) {
		if (arr[key] == null) {
			arr[key] = new stLinkedlist(data);
			totalstudents += 1;
		} else {
			arr[key].insert(data);
			totalstudents += 1;
		}
		return true;
	}

	// totalstudents()
	public int total() {
		return this.totalstudents;
	}

	// contains()
	public students contains(String roll_no) {
		int code = tohashcode(roll_no);
		if (arr[code] != null) {
			students a = arr[code].getstudent(roll_no);

			if (a != null) {
				return a;
			}
		}
		return null;

	}

//delete()
	public boolean delete(String roll_no) {
		boolean s = arr[tohashcode(roll_no)].contains(roll_no);
		if (s) {
			arr[tohashcode(roll_no)].delete(roll_no);
			totalstudents -= 1;
			return true;
		}
		return false;
	}

	// display()
	public void display() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].display();
			}
		}
	}

}
