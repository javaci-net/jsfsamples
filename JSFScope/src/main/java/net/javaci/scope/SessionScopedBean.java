package net.javaci.scope;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(eager = true)
@SessionScoped
public class SessionScopedBean extends AbstractBean implements Serializable  {
	
	private static final long serialVersionUID = 1L;

}
