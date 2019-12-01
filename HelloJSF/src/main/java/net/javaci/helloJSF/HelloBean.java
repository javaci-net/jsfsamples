package net.javaci.helloJSF;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name = "helloBean", eager = true)
@SessionScoped
public class HelloBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public HelloBean() {
		System.out.println("CONSTRUCTOR");
	}

	@PostConstruct
	public void init() {
		System.out.println("POST CONSTRUCTOR");
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getMessage() {
		return "Getting message from ManagedBean method for name: " + name;
	}
}