package day5;


class node{
	int data;
	node next;
	node(int val){
		data=val;
		next=null;
	}
}
public class day5_task1 {
	node last=null;
	public void insert(int val) {
		node newnode=new node(val);
		if(last==null) {
			newnode.next=newnode;
			last=newnode;
		}
		else {
			 newnode.next=last.next;
			 last.next=newnode;
			 last=newnode;
		}
	}
		public void display() {
			node temp=last.next;
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.next;
				if(temp==last) {
					break;
				}
		}
			 System.out.println(temp.data);
		}
		public static void main(String[] args) {
		day5_task1 n=new  day5_task1();
		n.insert(4);
		n.insert(5);
		n.insert(2);
		n.display();
	}
}
