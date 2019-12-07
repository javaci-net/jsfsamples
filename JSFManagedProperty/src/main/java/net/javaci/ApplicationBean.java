package net.javaci;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ApplicationBean {
	
	private String someValue = "data from application bean";
	
	@PostConstruct
	public void init() {
		System.out.println("POST CONSTRUCTOR FOR " + getClass().getSimpleName());
	}

	public String getSomeValue() {
		return someValue;
	}

	public void setSomeValue(String someValue) {
		this.someValue = someValue;
	}

}
