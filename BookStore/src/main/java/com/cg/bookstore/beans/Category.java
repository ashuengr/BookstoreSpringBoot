package com.cg.bookstore.beans;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Category {
@Id
private String bookCategory;
@OneToMany(fetch = FetchType.LAZY,mappedBy="bookCategory")
private Map<Long,Book> book;
public Category() {
	super();
}

public Category(String bookCategory) {
	super();
	this.bookCategory = bookCategory;
}

public String getBookCategory() {
	return bookCategory;
}

public void setBookCategory(String bookCategory) {
	this.bookCategory = bookCategory;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bookCategory == null) ? 0 : bookCategory.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Category other = (Category) obj;
	if (bookCategory == null) {
		if (other.bookCategory != null)
			return false;
	} else if (!bookCategory.equals(other.bookCategory))
		return false;
	return true;
}

@Override
public String toString() {
	return "Category [bookCategory=" + bookCategory + "]";
}

}
