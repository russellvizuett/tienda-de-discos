package com.controller;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;



import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.bean.Disco;
import com.bean.Usuario;
import com.dao.DatosDisco;
import com.dao.DatosUsuario;

@Controller
public class Discos {
	
	@Autowired
	private DatosDisco datosDisco;
	
	@Autowired
	private DatosUsuario datosUsuario;
	
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request){
		
		request.setAttribute("discos", datosDisco.recomendados());
		
		return new ModelAndView("index");
	}
	
	@RequestMapping("/recomendados")
	public ModelAndView recomendados(HttpServletRequest request){
		
		request.setAttribute("discos", datosDisco.recomendados());
		
		return new ModelAndView("recomendaciones");
	}
	
	@RequestMapping("/recomendar")
	public RedirectView recomendar(@RequestParam("id") int id, HttpServletRequest request){
 		Disco disco = datosDisco.consultarDisco(id);
		disco.setRecomendado("si");
		
		try {
			datosDisco.actualizarDisco(disco);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new RedirectView("/Store/recomendados.html");
	}
	
	@RequestMapping("/desrecomendar")
	public RedirectView desrecomendar(@RequestParam("id") int id, HttpServletRequest request){
 		Disco disco = datosDisco.consultarDisco(id);
		disco.setRecomendado("no");
		
		try {
			datosDisco.actualizarDisco(disco);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new RedirectView("/Store/recomendados.html");
	}
	
	@RequestMapping(value="/ver_discos", method=RequestMethod.GET)
	public ModelAndView todos(HttpServletRequest request){
		
		request.setAttribute("discos", datosDisco.verDiscos());
		
		return new ModelAndView("lista_discos");
	}
	
	@RequestMapping(value="/ver_discos", method=RequestMethod.POST)
	public ModelAndView buscados(HttpServletRequest request){

		request.setAttribute("discos", datosDisco.buscarTodo(request.getParameter("palabra")));
		
		return new ModelAndView("lista_discos");
	}
	
	@RequestMapping(value="/buscar", method=RequestMethod.GET)
	public ModelAndView buscar(HttpServletRequest request){
		
		request.setAttribute("discos", datosDisco.verDiscos());
		
		return new ModelAndView("buscar");
	}
	
	@RequestMapping(value="/buscar", method=RequestMethod.POST)
	public ModelAndView buscar(@RequestParam("palabra") String palabra, HttpServletRequest request){
		
		String filtro = request.getParameter("filtro");
		
		if (filtro.equals("todo")){
			request.setAttribute("discos", datosDisco.buscarTodo(palabra));
			
		}else if (filtro.equals("nombre_disco")){
			request.setAttribute("discos", datosDisco.buscarColumna(palabra, "nombre_disco"));
			
		}else if (filtro.equals("artista")){
			request.setAttribute("discos", datosDisco.buscarColumna(palabra, "artista"));
			
		}else if (filtro.equals("genero")){
			request.setAttribute("discos", datosDisco.buscarColumna(palabra, "genero"));
		}
		
		return new ModelAndView("buscar");
	}
	
	@RequestMapping("/detalle_disco")
	public ModelAndView consultar(@RequestParam("id") int id, HttpServletRequest request){
		Disco disco;
		disco = datosDisco.consultarDisco(id);
		String[] tracklist;  
		String pistas = disco.getTracklist();
		tracklist = pistas.split(",");
		
		request.setAttribute("tracklist", tracklist);
		request.setAttribute("disco", disco);
		
		return new ModelAndView("detalleDisco");
	}
	
	@RequestMapping("/crear_disco")
	public ModelAndView crear(HttpServletRequest request){
		
		
		return new ModelAndView("createDisco");
	}
	
	@RequestMapping("/agregar_disco")
	public RedirectView alta(HttpServletRequest request) throws FileUploadException{
		Disco disco;
		disco = new Disco();
		
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		List<FileItem> items = upload.parseRequest(request);
		
		Iterator<FileItem> iter = items.iterator();
		while (iter.hasNext()) {
		    FileItem item = iter.next();
		    if (item.isFormField()){
			    String name = item.getFieldName();
			    String value = item.getString();
			  if(value!=""){
			    int opcion = Integer.parseInt(name);
				switch(opcion){
			    case 1:
			    	disco.setNombre_disco(value);
			    break;
			    case 2:
			    	disco.setArtista(value); 	
			    break;
			    case 3:
			    	disco.setGenero(value);   	
				break;
			    case 4:
			    	disco.setExistentes_compra(Integer.parseInt(value));    	
				break;
			    case 5:
			    	disco.setExistentes_renta(Integer.parseInt(value));    	
				break;
			    case 6:
			    	disco.setTracklist(value); 	
				break;
			    case 7:
			    	disco.setPrecio_compra(Integer.parseInt(value));    	
				break;
			    case 8:
			    	disco.setPrecio_renta(Integer.parseInt(value));    	
				break;
			    case 9:
			    	disco.setRecomendado(value);
				break;
		              } }
		    	
		    }else if(item.getContentType().equals("audio/mp3")){
		    	String destino="/Users/padrino_russ/Documents/workspace/Store/WebContent/mp3/";
			    File uploadedFile = new File(destino+item.getName());
			    disco.setDemo(item.getName());
			    try {item.write(uploadedFile);} catch (Exception e) {e.printStackTrace();} 
				   }else if(item.getSize()>0){
			       String destino="/Users/padrino_russ/Documents/workspace/Store/WebContent/img/";
			       String nombre_imagen = item.getName().replace(" ", "");
			       File uploadedFile = new File(destino+nombre_imagen);
			       disco.setNombre_imagen(nombre_imagen);
				   try {item.write(uploadedFile);} catch (Exception e) {e.printStackTrace();
						}}
			        }
		if(disco.getNombre_imagen()==null){
			disco.setNombre_imagen("default.jpg");
		}
		
		try {datosDisco.agregarDisco(disco);
			 request.setAttribute("msg", "Disco dado de alta");
		}catch (Exception e) {e.printStackTrace();
			request.setAttribute("msg", "Error al dar de alta el Disco");
		}
		    
		return new RedirectView("/Store/ver_discos.html");
	}
	
	@RequestMapping("/editar_disco")
	public ModelAndView consulta(@RequestParam("id") int id, HttpServletRequest request){
		
		request.setAttribute("disco", datosDisco.consultarDisco(id));
		
		return new ModelAndView("editDisco");
	}
	
	@RequestMapping("/actualizar_disco")
	public RedirectView update(@RequestParam("id") int id, HttpServletRequest request){
		Disco disco = datosDisco.consultarDisco(id);
		
		disco.setNombre_disco(request.getParameter("nombre_disco"));
		disco.setArtista(request.getParameter("artista"));
		disco.setGenero(request.getParameter("genero"));
		disco.setExistentes_compra(Integer.parseInt(request.getParameter("existentes_compra")));
		disco.setExistentes_renta(Integer.parseInt(request.getParameter("existentes_renta")));
		disco.setPrecio_compra(Integer.parseInt(request.getParameter("precio_compra")));
		disco.setPrecio_renta(Integer.parseInt(request.getParameter("precio_renta")));
		disco.setDisponible_compra(request.getParameter("disponible_compra"));
		disco.setDisponible_renta(request.getParameter("disponible_renta"));
		
		try {
			datosDisco.actualizarDisco(disco);
		} catch (Exception e) {
			request.setAttribute("msg", "Error al actualizar el Disco");
			e.printStackTrace();
		}
		
		return new RedirectView("/Store/ver_discos.html");
	}
	
	@RequestMapping("/eliminar_disco")
	public RedirectView eliminar(@RequestParam("id") int id, HttpServletRequest request){
			String ruta="/Users/padrino_russ/Documents/workspace/Store/WebContent/";
		
			Disco disco = datosDisco.consultarDisco(id);
			
			File demo = new File(ruta+"/mp3/"+disco.getDemo());
			demo.delete();
			
			if(!disco.getNombre_imagen().equals("default.jpg")){
				File imagen = new File(ruta+"/img/"+disco.getNombre_imagen());
				imagen.delete();}
			
		try {	
			datosDisco.eliminarDisco(disco);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new RedirectView("/Store/ver_discos.html");
	}
	
	@RequestMapping("/comprar_disco")
	public ModelAndView comprar(@RequestParam("id") int id, HttpServletRequest request){
		if (request.getParameter("usuario")==""){
			request.setAttribute("mensaje", "Inicie session para comprar");
			return new ModelAndView("login");
		}
		Disco disco;
		disco = datosDisco.consultarDisco(id);
		int existentes = disco.getExistentes_compra();
		if(existentes<1){
			request.setAttribute("agotado", "compra");
			if(disco.getDisponible_compra()!=null&disco.getDisponible_compra()!=""){
			request.setAttribute("disponibilidad", disco.getDisponible_compra());}
			
			return new ModelAndView("agotado");
		}
		existentes = existentes - 1;
		disco.setExistentes_compra(existentes);
		try {
			datosDisco.actualizarDisco(disco);
		} catch (Exception e) {
			request.setAttribute("msg", "Error al actualizar el Disco");
			e.printStackTrace();  }
		
		Usuario usuario;
		int id_usuario = Integer.parseInt(request.getParameter("usuario"));
		usuario = datosUsuario.consultarUsuario(id_usuario);
		String compras = usuario.getCompras();
		int gastos = usuario.getGastos();
		
		if(compras==null){
			compras = disco.getNombre_disco();
		}else{
			compras = compras + "," + disco.getNombre_disco();
		}
		
		gastos = gastos + disco.getPrecio_compra();
		
		usuario.setCompras(compras);
		usuario.setGastos(gastos);
		
		try {
			datosUsuario.actualizarUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/detalle_usuario.html?id="+request.getParameter("usuario"));
	}
	
	@RequestMapping("/rentar_disco")
	public ModelAndView rentar(@RequestParam("id") int id, HttpServletRequest request){
		if (request.getParameter("usuario")==""){
			request.setAttribute("mensaje", "Inicie session para rentar");
			return new ModelAndView("login");
		}
		Disco disco;
		disco = datosDisco.consultarDisco(id);
		int existentes = disco.getExistentes_renta();
		if(existentes<1){
			request.setAttribute("agotado", "renta");
			if(disco.getDisponible_renta()!=null&disco.getDisponible_renta()!=""){
			request.setAttribute("disponibilidad", disco.getDisponible_renta());}
			
			return new ModelAndView("agotado");
		}
		existentes = existentes - 1;
		disco.setExistentes_renta(existentes);
		try {
			datosDisco.actualizarDisco(disco);
		} catch (Exception e) {
			request.setAttribute("msg", "Error al actualizar el Disco");
			e.printStackTrace();  }
		
		Usuario usuario;
		int id_usuario = Integer.parseInt(request.getParameter("usuario"));
		usuario = datosUsuario.consultarUsuario(id_usuario);
		String rentas = usuario.getRentas();
		int gastos = usuario.getGastos();
		if(rentas==null){
			rentas = disco.getNombre_disco();
		}else{
			rentas = rentas + "," + disco.getNombre_disco();
		}
		gastos = gastos + disco.getPrecio_renta();
		
		usuario.setRentas(rentas);
		usuario.setGastos(gastos);
		
		try {
			datosUsuario.actualizarUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/detalle_usuario.html?id="+request.getParameter("usuario"));
	}

}
