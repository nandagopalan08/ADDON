package day_3;


public class InsertAnyPostion {
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
	public void AnyPostion(int d,int pos) {
		node newnode = new node(d);
		if(pos<1) {
			System.out.println("invalid");
		}
		if(pos==1) {
			newnode.next=head;
			head=newnode;
		}
		node current =head;
		if(current==null) {
			System.out.println("invalid");
			return;
		}
		for(int i=1;i<pos-1&&current!=null;i++) {
			current=current.next;
		}
		newnode.next=current.next;
		current.next=newnode;
	}
		public void display() {
			node temp=head;
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.next;
		}
	}
public static void main(String[] args) {
	InsertAnyPostion n=new InsertAnyPostion();
	n.add(1);
	n.AnyPostion(1,2);
	n.add(3);
	n.display();
}
}