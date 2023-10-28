package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Category implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private String Name;
	private FilterCriteria Filter;
	
	/* all references */
	private List<Item> CategorytoItem = new LinkedList<Item>(); 
	
	/* all get and set functions */
	public int getID() {
		return ID;
	}	
	
	public void setID(int id) {
		this.ID = id;
	}
	public String getName() {
		return Name;
	}	
	
	public void setName(String name) {
		this.Name = name;
	}
	public FilterCriteria getFilter() {
		return Filter;
	}	
	
	public void setFilter(FilterCriteria filter) {
		this.Filter = filter;
	}
	
	/* all functions for reference*/
	public List<Item> getCategorytoItem() {
		return CategorytoItem;
	}	
	
	public void addCategorytoItem(Item item) {
		this.CategorytoItem.add(item);
	}
	
	public void deleteCategorytoItem(Item item) {
		this.CategorytoItem.remove(item);
	}
	


}
