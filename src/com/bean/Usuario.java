package com.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USUARIOS")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID",nullable=false)
	private int id;
	
	@Column(name="NOMBRE", nullable=true)
	private String nombre;
	
	@Column(name="EDAD", nullable=true)
	private String edad;
	
	@Column(name="SEXO", nullable=true)
	private String sexo;
	
	@Column(name="UBICACION", nullable=true)
	private String ubicacion;
	
	@Column(name="TELEFONO", nullable=true)
	private String telefono;
	
	@Column(name="CORREO", nullable=true)
	private String correo;
	
	@Column(name="PASSWORD", nullable=true)
	private String password;
	
	@Column(name="COMPRAS", nullable=true)
	private String compras;
	
	@Column(name="RENTAS", nullable=true)
	private String rentas;
	
	@Column(name="GASTOS", nullable=true)
	private int gastos;
	
	public int getGastos() {
		return gastos;
	}

	public void setGastos(int gastos) {
		this.gastos = gastos;
	}

	public String getCompras() {
		return compras;
	}

	public void setCompras(String compras) {
		this.compras = compras;
	}

	public String getRentas() {
		return rentas;
	}

	public void setRentas(String rentas) {
		this.rentas = rentas;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
