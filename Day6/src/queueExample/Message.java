package queueExample;

import java.time.LocalDateTime;

public class Message {

	String event;
	LocalDateTime timeStamp;
	
	Message(){
		this.event=null;
		this.timeStamp=LocalDateTime.now();
	}
	Message(String event){
		this.event=event;
		this.timeStamp=LocalDateTime.now();
	}
	@Override
	public String toString() {
		return "Message [event=" + event + ", timeStamp=" + timeStamp + "]";
	}
	
}
