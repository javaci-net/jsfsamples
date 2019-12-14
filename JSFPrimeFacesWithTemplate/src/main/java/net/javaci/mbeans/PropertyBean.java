package net.javaci.mbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.javaci.entity.Property;

@ManagedBean
@SessionScoped
public class PropertyBean implements Serializable {
	
	private static Logger logger = LoggerFactory.getLogger(PropertyBean.class);

	private static final long serialVersionUID = 1L;

	private ArrayList<Property> cacheList;
	private Property item;

	private boolean edit;

	@PostConstruct
	public void init() {
		logger.info("POST CONSTRUCTOR for " + getClass().getName());
		cacheList = new ArrayList<>();
		item = new Property();
	}

	public void newItem() {
		logger.info("Called newItem");
		item = new Property();
	}
	
	public void add() {
		logger.info("Called add with " + item);
		cacheList.add(item);
		
		FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Added Successfully",  "Key: " + item.getKey()) );
        
        item = new Property();
	}

	public void setItemToEdit(Property item) {
		logger.info("Called edit with " + item);
		this.item = item;
		edit = true;
	}

	public void update() {
		logger.info("Called edit with " + item);
		
		FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Updated Successfully",  "Key: " + item.getKey()) );
        
		item = new Property();
		edit = false;
	}

	public void delete(Property item) {
		logger.info("Called delete with " + item);
		cacheList.remove(item);
		
		FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Updated Successfully",  "Key: " + item.getKey()) );
        
		this.item = new Property();
		edit = false;
	}

	public List<Property> getCacheList() {
		return cacheList;
	}

	public Property getItem() {
		return item;
	}

	public void setItem(Property item) {
		logger.info("Item set with value: " + item);
		this.item = item;
	}

	public boolean isEdit() {
		return edit;
	}

	public void setEdit(boolean edit) {
		logger.info("edit set with value: " + edit);
		this.edit = edit;
	}
}
