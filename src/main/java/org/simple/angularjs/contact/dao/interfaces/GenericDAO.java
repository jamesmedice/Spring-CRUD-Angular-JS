package org.simple.angularjs.contact.dao.interfaces;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T> {
	public abstract void save(T entity);
	public abstract void delete(T entity);
	public abstract T get(Serializable id);
	public abstract List<T> list();
}