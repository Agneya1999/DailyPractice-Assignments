package queueExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Message> q=new LinkedList<Message>();
	Message m1=new Message();
	Message m2=new Message("Hello");
	Message m3=new Message("Hi");
	Message m4=new Message("JJJJ");
	Message m5=new Message("KKKKKK");
		QueueExample.add(q,m1);
		QueueExample.add(q,m2);
		QueueExample.add(q,m3);
		QueueExample.add(q,m4);
		QueueExample.add(q,m5);
		QueueExample.display(q);
	
	}
	static void add(Queue<Message> q,Message m) {
		
		q.add(m);
		
	}
	static void display(Queue<Message> q) {
		Iterator<Message> iterator=q.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
