package jsf2demo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "timeBean")
@RequestScoped
public class TimeBean {
	public TimeBean() {
	}

	public String getTime() {
		return new java.util.Date().toString();
	}
}
