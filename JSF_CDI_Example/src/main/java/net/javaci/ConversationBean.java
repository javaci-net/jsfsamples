package net.javaci;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class ConversationBean implements Serializable {

	private static final long serialVersionUID = 1;
	
	@Inject
    private Conversation conversation;
	
	private int counter;
	
	// Will only be called once
	// during bean initialization
	@PostConstruct
	public void init(){
		counter = 0;
		System.out.println("POST CONSTRUCTOR for " + getClass().getName());
	}
	
	@PreDestroy
	public void GoodBye() {
		System.out.println("PRE DESTROY for " + getClass().getName());
	}
	
	public void initConversation(){
		if (!FacesContext.getCurrentInstance().isPostback() 
			&& conversation.isTransient()) {
			conversation.begin();
		}
	}
	
	public void increment(){
		counter++;
	}
	
	public String handleFirstStepSubmit(){
		return "step2?faces-redirect=true";
	}
	
	public String handleSecondStepSubmit(){
		return "step3?faces-redirect=true";
	}
	
	public String endConversation(){
		if(!conversation.isTransient()){
			conversation.end();
		}
		return "step1?faces-redirect=true";
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Conversation getConversation() {
		return conversation;
	}
	
}
