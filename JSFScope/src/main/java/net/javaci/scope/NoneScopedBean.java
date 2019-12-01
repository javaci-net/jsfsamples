package net.javaci.scope;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;

@ManagedBean
@NoneScoped
public class NoneScopedBean extends AbstractBean implements Serializable  {
	
	private static final long serialVersionUID = 1L;

}
