package day_3;
                                              

 class node{
		int data;
		node next;
		node(int val){
			data=val;
			next=null;
		}
	}
 public class Linkedlist {
	node head;
	public void add(int val) {
			node newnode =new node(val);
			if(head==null) {
				head= newnode;
				newnode.next=null;
			}
			else {
				newnode.next=head;
				head=newnode;
			
			}
			
		}
	public void display() {
			node temp=head;
			while(temp.next!=null) {
				System.out.println(temp.data+" ");
				temp=temp.next;
		}
			System.out.println(temp.data);
	}
	public static void main(String[] args) {
		Linkedlist n=new Linkedlist();
		n.add(2);
		n.add(3);
		n.add(4);
		n.display();
	}

	
}