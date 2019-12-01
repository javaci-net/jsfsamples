package net.javaci.scope;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped // Default
public class RequestScopedBean extends AbstractBean implements Serializable  {
	
	private static final long serialVersionUID = 1L;

}
