package com.dao.imp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.stereotype.Repository;

import com.bean.Disco;
import com.bean.Usuario;
import com.dao.DatosUsuario;

@Repository
public class DatosUsuarioH implements DatosUsuario {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public List<Usuario> verUsuarios() {
		Session session 	= SessionFactoryUtils.getSession(factory, true);
		Criteria criteria	= session.createCriteria(Usuario.class);
		criteria.addOrder(Order.asc("nombre"));
		return criteria.list();
	}

	@Override
	public Usuario consultarUsuario(int id) {
		Session session 	= SessionFactoryUtils.getSession(factory, true);
		Criteria criteria	= session.createCriteria(Usuario.class);
		
		criteria.add(Restrictions.eq("id", id));
		
		return (Usuario) criteria.uniqueResult();
	}

	@Override
	public void agregarUsuario(Usuario usuario) throws Exception {
		Session session 		= SessionFactoryUtils.getSession(factory, true);
		Transaction transaction	= session.beginTransaction();
		
		try {
			session.save(usuario);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
	}

	@Override
	public void actualizarUsuario(Usuario usuario) throws Exception {
		Session session 		= SessionFactoryUtils.getSession(factory, true);
		Transaction transaction	= session.beginTransaction();
		
		try {
			session.update(usuario);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
	}

	@Override
	public Usuario login(String correo, String password) {
		Session session 	= SessionFactoryUtils.getSession(factory, true);
		Criteria criteria	= session.createCriteria(Usuario.class);
		
		criteria.add(Restrictions.eq("correo", correo));
		criteria.add(Restrictions.eq("password", password));
		
		return (Usuario) criteria.uniqueResult();
	}

	@Override
	public void eliminarUsuario(Usuario usuario) throws Exception {
		Session session 		= SessionFactoryUtils.getSession(factory, true);
		Transaction transaction	= session.beginTransaction();
		
		try{
			session.delete(usuario);
			transaction.commit();
		}catch (Exception e){
			transaction.rollback();
			throw e;
		}
		
	}

}
