package net.javaci.mbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import net.javaci.entity.Property;

@ManagedBean
@SessionScoped
public class PropertyBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArrayList<Property> cacheList;
	private Property item;

	private boolean edit;

	@PostConstruct
	public void init() {
		System.out.println("POST CONSTRUCTOR for " + getClass().getName());
		cacheList = new ArrayList<>();
		item = new Property();
	}

	public void add() {
		System.out.println("Called add with " + item);
		cacheList.add(item);
		item = new Property();
	}

	public void setItemToEdit(Property item) {
		System.out.println("Called edit with " + item);
		this.item = item;
		edit = true;
	}

	public void update() {
		System.out.println("Called edit with " + item);
		item = new Property();
		edit = false;
	}

	public void delete(Property item) {
		System.out.println("Called delete with " + item);
		cacheList.remove(item);
		this.item = new Property();
		edit = false;
	}

	public List<Property> getCacheList() {
		return cacheList;
	}

	public Property getItem() {
		return item;
	}

	public boolean isEdit() {
		return edit;
	}
}
