package net.javaci.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public abstract class AbstractBean {
	
	private int number;
	
	@PostConstruct
	public void init() {
		System.out.println("POST CONSTRUCTOR for " + getClass().getName());
	}
	
	@PreDestroy
	public void GoodBye() {
		System.out.println("PRE DESTROY for " + getClass().getName());
	}
	
	public String getMessage1() {
		return "Message1 from " + getClass().getSimpleName();
	}

	public String getMessage2() {
		return "Number = " + number + " from " + getClass().getSimpleName();
	}
	
	public void buttonAction() {
		System.out.println("Button action for " + getClass().getSimpleName());
		number++;
	}
}
