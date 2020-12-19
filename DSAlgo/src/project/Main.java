package project;

public class Main {

	public static void main(String[] args) {
		students s1=new students("Junaid",8.11,"17BEE005");
		students s2=new students("Akhlaq",7.61,"17BEE002");
		students s3=new students("Shadab",9.30,"17BEC009");
		students s4=new students("Imam",7.11,"17BEE004");
		students s5=new students("Imam",7.11,"17BEE004");
		stLinkedlist s=new stLinkedlist(s1);
		s.insert(s2);
		s.insert(s3);
		s.insert(s4);
//		s.display();
//		System.out.println(s.delete("17BEC009"));
//		s.display();
		HashTable ht=new HashTable();
		ht.insert(ht.tohashcode(s1.getrollno()), s1);
		ht.insert(ht.tohashcode(s2.getrollno()), s2);
		ht.insert(ht.tohashcode(s3.getrollno()), s3);
		ht.insert(ht.tohashcode(s4.getrollno()), s4);


		ht.display();
		students next=s.getstudent(s1.getrollno());
		if(next.getName().equals(s1.getName())) {
			System.out.println("Hurray!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		ht.delete("17BEC009");
		ht.display();

	}

}
