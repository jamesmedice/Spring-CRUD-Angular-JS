package org.simple.angularjs.contact.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.simple.angularjs.contact.dao.interfaces.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unchecked")
public abstract class GenericHibernateDAO<T> implements GenericDAO<T> {

	private Class<T> persistenClass;

	@Autowired
	private SessionFactory sessionFactory;

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public GenericHibernateDAO(Class<T> persistenClass) {
		super();
		this.persistenClass = persistenClass;
	}

	public void save(T entity) {
		getCurrentSession().saveOrUpdate(entity);
	};

	public void delete(T entity) {
		getCurrentSession().delete(entity);
	}

	public T get(Serializable id) {
		return (T) getCurrentSession().get(persistenClass, id);
	}

	public List<T> list() {
		return getCurrentSession().createCriteria(persistenClass).list();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	};

}