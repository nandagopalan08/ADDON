package day4;

public class DeleteAtDl {
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
}
	public void deleteatmid() {
		int count=0;
		node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		int mid=count/2;
		node bob=head;
		for(int i=1;i<mid;i++) {
			bob=bob.next;
		}
		(bob.next).prv=bob.next.next;
		(bob.next.next).prv=bob;
		bob.next=(bob.next.next).next;
		bob=bob.next.next;
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
	DeleteAtDl n=new  DeleteAtDl();
	n.insert(1);
	n.insert(2);
	n.insert(3);
	n.insert(4);
	n.insert(5);
	n.deleteatmid();
	n.display();
}
}