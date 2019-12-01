package net.javaci.scope;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ViewScopedBean extends AbstractBean implements Serializable  {
	
	private static final long serialVersionUID = 1L;
}
