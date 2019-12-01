package net.javaci.scope;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager = true)
@ApplicationScoped
public class ApplicationScopedBean extends AbstractBean implements Serializable  {
	
	private static final long serialVersionUID = 1L;

}
