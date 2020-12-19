package stack;

public class Main {

	public static void main(String[] args) {
//		intStack s=new intStack();
//		for(int i=10;i<20;i++) {
//			s.push(i);
//		}
////		System.out.println(s.pop());
//		s.display();
		person p1 = new person("junaid", 21);
		person p2 = new person("aizaan", 11);
		person p3 = new person("navaid", 22);
		person p4 = new person("moonisha", 19);
		personStack stack=new personStack();
		stack.push(p1);
		stack.push(p2);
		stack.push(p3);
		stack.push(p4);
		stack.display();	}

}
