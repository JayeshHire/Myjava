class TreeNode {
	int val;
	TreeNode left ;
	TreeNode right ;
	TreeNode(){}
	void TreeNode(int val){
		this.val = val;
	}
	void TreeNode(int val , TreeNode left , TreeNode right ){
		this.val = val;
		this.left = left;
		this.right = right ;
	}
}

//Node of linkedlist
class Node{
	int val;
	Node next ;
	Node(){}
	Node(){
		this.next = null;
	}
	Node(int val){
		this.val = val;
		this.next = null ;
	}
	Node (int val, Node next){
		this.val = val;
		this.next = next;
	}
}

//list 
class List {
	Node head ;
	Stack list ;
	void List(int val){
		head = new Node();
		list = new Stack(val ,head);	
	}
	
	void append(int val){
		list.add(val);
	}

	int pop(){
		return list.pop();
	}

	void insert(int val , int index){
		Node temp ;
		Node iNode ;
		iNode = head ;
		int i = 0;
		while (i != index - 1){
			temp = iNode.next ;
			iNode = temp ;
			i++;
		}
		Node nextNode = new Node(val , iNode.next);
		iNode.next = nextNode ;
	}

	int display(int index){
		Node a ;
		a = head ;
		int i ;
		while(i != index){
			i++;
			a = a.next ;
		}
		return a.val ;
	}
}






//stack 
class Stack {
	Node pointer ;
	Node head ;
	void Stack (int val){
		head = new Node(val);
		pointer = head ;
	}
	
	void Stack(int val , Node head){
		this.head = head ;
		head.val = val ;
		pointer = head ;
	}
	
	void add(int val){
		Node nextNode = new Node(val);
		pointer.next = nextNode;
		pointer = nextNode ;
	}

	int pop(){
		int popedVal = pointer.val ;
		Node i ;
		i = head ;
		while(i.next != pointer ){
			i = i.next ;
		}
		pointer = i;
		pointer.next = null ;
		return popedVal ;
	}
}
	




class ParseNode {
	TreeNode root ;
	void ParseNode(TreeNode root){
		this.root = root ;
	}
	
	//for parsing the left node of the root node in a tree
	List ParseLeftNode(){
		Node iNode = root ;
		Stack prevNode ;
		List Nodes ;
		while(true){
			if(root.left != null ){
				if (prevNode == null ){
					prevNode = new Node(root.val);

				} else {
				prevNode.add(iNode.val);
				}
			} else if (root.right != null ){
				prevNode.add(iNode.val);
			} else if ( root.left == null && root.right == null){
//main parseNode logic is remaining to write

				
		

