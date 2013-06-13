package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.bean.Usuario;
import com.dao.DatosUsuario;

@Controller
public class Usuarios {
	
	@Autowired
	private DatosUsuario datosUsuario;
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView forma(){
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView procesar(@RequestParam("password") String password, @RequestParam("correo") String correo,
	HttpServletRequest request, HttpSession session){
		Usuario usuario = datosUsuario.login(correo, password);
		if(correo.equals("administrador") && password.equals("administrador")){
			session = request.getSession();
			session.setAttribute("administrador", "administrador");
			return new ModelAndView("redirect:/");
		}else if(usuario!=null){
			session = request.getSession();
			session.setAttribute("usuario", usuario);
			return new ModelAndView("redirect:/");
		}else{
			request.setAttribute("mensaje", "Error en E-mail o Password");
			return new ModelAndView("login");
		}
		
	}
	
	@RequestMapping("/detalle_usuario")
	public ModelAndView consultar(@RequestParam("id") int id, HttpServletRequest request){
		Usuario usuario;
		usuario = datosUsuario.consultarUsuario(id);
		String[] compras, rentas; 
		
		String compra = usuario.getCompras();
		if(compra!=null){
		compras = compra.split(",");
		request.setAttribute("compras", compras);}
		
		String renta = usuario.getRentas();
		if(renta!=null){
		rentas = renta.split(",");
		request.setAttribute("rentas", rentas);}
		
		
		
		request.setAttribute("usuario", usuario);
		
		return new ModelAndView("detalleUsuario");
	}
	
	@RequestMapping("/ver_usuarios")
	public ModelAndView listar(HttpServletRequest request){
		
		request.setAttribute("usuarios", datosUsuario.verUsuarios());
		
		return new ModelAndView("lista_usuarios");
	}
	
	@RequestMapping("/crear_usuario")
	public ModelAndView crear(){
		
		return new ModelAndView("createUsuario");
	}
	
	@RequestMapping("/agregar_usuario")
	public RedirectView alta(HttpServletRequest request){
		Usuario usuario;
		usuario = new Usuario();
		usuario.setNombre(request.getParameter("nombre"));
		usuario.setEdad(request.getParameter("edad"));
		usuario.setSexo(request.getParameter("sexo"));
		usuario.setTelefono(request.getParameter("telefono"));
		usuario.setUbicacion(request.getParameter("ubicacion"));
		usuario.setCorreo(request.getParameter("correo"));
		usuario.setPassword(request.getParameter("password"));
		
		try {
			datosUsuario.agregarUsuario(usuario);
			request.setAttribute("msg", "Usuario dado de alta");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "Error al dar de alta el Usuario");
		}
		
		return new RedirectView("/Store/ver_usuarios.html");
	}
	
	@RequestMapping("/editar_usuario")
	public ModelAndView consulta(@RequestParam("id") int id, HttpServletRequest request){
		
		request.setAttribute("usuario", datosUsuario.consultarUsuario(id));
		
		return new ModelAndView("editUsuario");
	}
	
	@RequestMapping("/actualizar_usuario")
	public RedirectView update(@RequestParam("id") int id, HttpServletRequest request){
		Usuario usuario;
		usuario = datosUsuario.consultarUsuario(id);
		
		usuario.setNombre(request.getParameter("nombre"));
		usuario.setEdad(request.getParameter("edad"));
		usuario.setSexo(request.getParameter("sexo"));
		usuario.setTelefono(request.getParameter("telefono"));
		usuario.setUbicacion(request.getParameter("ubicacion"));
		usuario.setCorreo(request.getParameter("correo"));
		usuario.setPassword(request.getParameter("password"));
		
		try {
			datosUsuario.actualizarUsuario(usuario);
		} catch (Exception e) {
			request.setAttribute("msg", "Error al actualizar el Usuario");
			e.printStackTrace();
		}
		
		return new RedirectView("/Store/detalle_usuario.html?id="+request.getParameter("id"));
	}
	
	@RequestMapping("/eliminar_usuario")
	public RedirectView eliminar(@RequestParam("id") int id, HttpServletRequest request){
		
		Usuario usuario = datosUsuario.consultarUsuario(id);
		try {
			datosUsuario.eliminarUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new RedirectView("/Store/ver_usuarios.html");
	}
	
	@RequestMapping("/logout")
	public RedirectView logout(HttpServletRequest request, HttpSession session){
		request.getSession().invalidate();
		return new RedirectView("/Store/");
	}
	
	@RequestMapping("/contacto")
	public ModelAndView contacto(){
		
		return new ModelAndView("contacto");
	}
}
