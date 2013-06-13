package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.bean.Disco;

public interface DatosDisco {
	
	List<Disco> buscarColumna(String palabra, String columna);
	List<Disco> buscarTodo(String palabra);
	List<Disco> verDiscos();
	List<Disco> recomendados();
	Disco consultarDisco(int id);
	void agregarDisco(Disco disco) throws Exception;
	void actualizarDisco(Disco disco) throws Exception;
	void eliminarDisco(Disco disco) throws Exception;
	
}
