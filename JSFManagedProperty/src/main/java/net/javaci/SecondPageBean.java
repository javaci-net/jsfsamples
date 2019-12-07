package net.javaci;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class SecondPageBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	public void init() {
		System.out.println("POST CONSTRUCTOR FOR " + getClass().getSimpleName());
	}
	
	@ManagedProperty(value = "#{param.key}")
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}