package com.dao;

import java.util.List;

import com.bean.Usuario;

public interface DatosUsuario {
	
	List<Usuario> verUsuarios();
	Usuario consultarUsuario(int id);
	Usuario login(String correo, String password);
	void agregarUsuario(Usuario usuario) throws Exception;
	void actualizarUsuario(Usuario usuario) throws Exception;
	void eliminarUsuario(Usuario usuario) throws Exception;
}
