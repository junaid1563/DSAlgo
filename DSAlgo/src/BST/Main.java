package BST;

public class Main {

	public static void main(String[] args) {
		person p1=new person("Junaid",21);
		person p2=new person("Kunaid",22);
		person p3=new person("Lunaid",23);
		person p4=new person("Zunaid",24);
		person p5=new person("Munaid",25);
		person p6=new person("Hunaid",26);
		BST b=new BST() ;
		b.insert(p1);
		b.insert(p2);
		b.insert(p3);
		b.insert(p4);
		b.insert(p5);
		b.insert(p6);
		b.display(b.contains("Junaid"),1);
//		the quick brown fox jumps over the lazy dog

//		System.out.println(b.get_data(b.getparent("Munaid")).toString());
//		b.display(b.contains("Junaid"), 1);
	}
}