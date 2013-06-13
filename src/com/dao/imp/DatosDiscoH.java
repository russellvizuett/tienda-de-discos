package com.dao.imp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.stereotype.Repository;

import sun.tools.tree.OrExpression;

import com.bean.Disco;
import com.dao.DatosDisco;

@Repository
public class DatosDiscoH implements DatosDisco {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public List<Disco> verDiscos() {
		Session session 	= SessionFactoryUtils.getSession(factory, true);
		Criteria criteria	= session.createCriteria(Disco.class);
		criteria.addOrder(Order.asc("artista"));
		return criteria.list();
	}

	@Override
	public Disco consultarDisco(int id) {
		Session session 	= SessionFactoryUtils.getSession(factory, true);
		Criteria criteria	= session.createCriteria(Disco.class);
		
		criteria.add(Restrictions.eq("id", id));
		
		return (Disco) criteria.uniqueResult();
	}

	@Override
	public void agregarDisco(Disco disco) throws Exception {
		Session session 		= SessionFactoryUtils.getSession(factory, true);
		Transaction transaction	= session.beginTransaction();
		
		try {
			session.save(disco);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
			throw e;
		}
	}
	
	@Override
	public void actualizarDisco(Disco disco) throws Exception {
		Session session 		= SessionFactoryUtils.getSession(factory, true);
		Transaction transaction	= session.beginTransaction();
		
		try {
			session.update(disco);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
			throw e;
		}
	}
	
	@Override
	public void eliminarDisco(Disco disco) throws Exception {
		Session session 		= SessionFactoryUtils.getSession(factory, true);
		Transaction transaction	= session.beginTransaction();
		
		try{
			session.delete(disco);
			transaction.commit();
		}catch (Exception e){
			transaction.rollback();
			throw e;
		}
	}

	@Override
	public List<Disco> buscarTodo(String palabra) {
		Session session 	= SessionFactoryUtils.getSession(factory, true);
		Criteria criteria	= session.createCriteria(Disco.class);
		
		Criterion genero  = Restrictions.like("genero", "%"+palabra+"%");
		Criterion artista = Restrictions.like("artista", "%"+palabra+"%");
		Criterion disco   = Restrictions.like("nombre_disco", "%"+palabra+"%");
		
		LogicalExpression expression = Restrictions.or(Restrictions.or(artista, genero), disco);
		criteria.add(expression);
		criteria.addOrder(Order.asc("nombre_disco"));
		return criteria.list();
	}

	@Override
	public List<Disco> buscarColumna(String palabra, String columna) {
		Session session 	= SessionFactoryUtils.getSession(factory, true);
		Criteria criteria	= session.createCriteria(Disco.class);
		
		criteria.add(Restrictions.like(columna, "%"+palabra+"%"));
		criteria.addOrder(Order.asc("nombre_disco"));
		
		return criteria.list();
	}

	@Override
	public List<Disco> recomendados() {
		Session session 	= SessionFactoryUtils.getSession(factory, true);
		Criteria criteria	= session.createCriteria(Disco.class);
		
		criteria.add(Restrictions.eq("recomendado", "si"));
		criteria.addOrder(Order.asc("nombre_disco"));
		return criteria.list();
	}
		
}
