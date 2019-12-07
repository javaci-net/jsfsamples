package net.javaci;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.annotation.PostConstruct;

@ManagedBean
@RequestScoped
public class IndexBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	@ManagedProperty(value="#{applicationBean}")
	ApplicationBean appBean;

	@PostConstruct
	public void init() {
		System.out.println("POST CONSTRUCTOR FOR " + getClass().getSimpleName());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ApplicationBean getAppBean() {
		return appBean;
	}

	public void setAppBean(ApplicationBean appBean) {
		this.appBean = appBean;
	}
	
	
}