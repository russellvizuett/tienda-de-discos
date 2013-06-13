package com.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.bean.Disco;

@WebService
@SOAPBinding(style=Style.RPC)
public interface SearchRemote {
	
	@WebMethod
	public abstract List<Disco> buscarColumna(
		@WebParam(name = "palabra")String palabra,@WebParam(name = "columna") String columna);
	
	@WebMethod
	public abstract List<Disco> buscarTodo(@WebParam(name = "palabra")String palabra);

}
