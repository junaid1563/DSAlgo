package BST;

public class BST {

	public class Node {
		private Node lc;
		private person data;
		private Node rc;
	}

	private Node root;

//insert()
	public boolean insert(person item) {
		Node node = new Node();// creating a new Node
		node.data = item;// adding data
		node.lc = null;// left child null
		node.rc = null;// right child null

		if (root == null) {// if no node is present
			root = node;// assigning a root node
			return true;
		} else {
			Node p = root;// parent node
			Node c = root;// child node
			while (c != null) {
				p = c;// altering parent with child
				if (item.getName().compareTo(c.data.getName()) < 0) {// item is less than data
					c = c.lc;
				} else {// item is greater than data
					c = c.rc;
				}
			}
			// assigning value
			if (item.getName().compareTo(p.data.getName()) < 0) {// item is less than data
				p.lc = node;
			} else {// item is greater than data
				p.rc = node;
			}

		}
		return true;
	}

//contains()
	public Node contains(String name) {
		Node current = root;
		if (root.data.getName().equals(name)) {
			return current;
		} else {
			while (current != null) {
				if (name.compareTo(current.data.getName()) < 0) {// comparing
					current = current.lc;
				} else if (name.compareTo(current.data.getName()) > 0) {
					current = current.rc;
				} else {// if name is equal to current.data.getName()
					break;
				}
			}
		}
		return current;
	}

	public Node getroot() {
		return this.root;
	}

//display()
	public void display(Node n, int count) {
		Node c = n;

		if (c != null) {
			System.out.print(count + " " + c.data.toString() + " \n");
			count++;

			display(c.lc, count);
			display(c.rc, count);
		}
		return;
	}

//get parent()
	public Node getparent(String n) {
		Node current = root;
		Node parent = root;
		if (n.compareTo(root.data.getName()) == 0) {
			System.out.println("No parent of root Node");
			return null;

		} else {
			while (current != null) {

				if (n.compareTo(current.data.getName()) < 0) {
					parent = current;
					current = current.lc;
				} else if (n.compareTo(current.data.getName()) > 0) {
					parent = current;
					current = current.rc;
				} else {
					break;
				}

			}

		}
		if (current != null) {

			return parent;
		} else {
			return null;
		}
	}

	// get_data()
	public person get_data(Node n) {
		return n.data;
	}

	// orders()
	public void inorder(Node n) {
		if (n == null) {
			return;
		} else {
			inorder(n.lc);
			System.out.println(n.data.toString());
			inorder(n.rc);
		}
	}

	public void preorder(Node n) {
		if (n == null) {
			return;
		} else {
			System.out.println(n.data.toString());
			preorder(n.lc);

			preorder(n.rc);
		}
	}

	public void postorder(Node n) {
		if (n == null) {
			return;
		} else {

			postorder(n.lc);

			postorder(n.rc);
			System.out.println(n.data.toString());
		}
	}
}
