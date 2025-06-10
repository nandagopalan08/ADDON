package day4;

public class MiddleAtpos {
		int size=0;
		node head=null;
		node tail=null;
		public void insert(int val) {
			node newnode=new node(val);
			if(head==null) {
				head=newnode;
				tail=newnode;
				newnode.next=null;
			}
			else {
				newnode.next=head;
				head.prv=newnode;
				head=newnode;
			}
			size++;
		}
		public void middlepos(int val) {
			node newnode=new node(val);
			node temp=head;
			int mid=size/2;
			for(int i=1;i<mid;i++) {
				temp=temp.next;
			}
			(temp.next).prv=newnode;
			newnode.prv=temp;
			temp.next=newnode.next;
			temp=newnode;
			size++;
		}
		public void display() {
			node temp=tail;
			while(temp.prv!=null) {
				System.out.println(temp.data+" ");
				temp=temp.prv;
		}
			System.out.println(temp.data+"\nnull");
	}
	public static void main(String[] args) {
		MiddleAtpos n=new MiddleAtpos ();
		n.insert(0);
		n.insert(1);
		n.insert(2);
		n.insert(3);
		n.display();
		System.out.println("after");
		n.middlepos(7);
		n.display();
		
	}
}