package com.services.imp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Disco;
import com.dao.DatosDisco;
import com.services.SearchRemote;

@Component
@WebService(serviceName="BusquedaRemota")
public class BusquedaRemota implements SearchRemote{
	
	@Autowired
	DatosDisco datosDisco;

	@Override
	@WebMethod
	public List<Disco> buscarColumna(String palabra, String columna) {
		
		return datosDisco.buscarColumna(palabra, columna);
	}

	@Override
	@WebMethod
	public List<Disco> buscarTodo(String palabra) {
		
		return datosDisco.buscarTodo(palabra);
	}

}
