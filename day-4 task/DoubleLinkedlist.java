package day4;


class node{
	int data;
	node next;
	node prv;
	node(int val){
		data=val;
		prv=null;
		next=null;
	}
}

public class DoubleLinkedlist {
	node head=null;
	node tail=null;
	int size=0;
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
	
	public void display() {
		node temp=tail;
		while(temp.prv!=null) {
			System.out.println(temp.data+" ");
			temp=temp.prv;
	}
		System.out.println(temp.data);
}
	
public static void main(String[] args) {
	DoubleLinkedlist n=new DoubleLinkedlist();
	n.insert(0);
	n.insert(1);
	n.insert(2);
	n.display();
}
}
