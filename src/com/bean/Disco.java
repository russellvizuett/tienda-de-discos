package com.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="DISCOS")
public class Disco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID",nullable=false)
	private int id;

	@Column(name="NOMBRE_DISCO",nullable=false)
	private String nombre_disco;
	
	@Column(name="ARTISTA",nullable=false)
	private String artista;
	
	@Column(name="GENERO",nullable=true)
	private String genero;
	
	@Column(name="EXISTENTES_COMPRA",nullable=false)
	private int existentes_compra;
	
	@Column(name="EXISTENTES_RENTA",nullable=false)
	private int existentes_renta;
	
	@Column(name="PRECIO_COMPRA",nullable=false)
	private int precio_compra;
	
	@Column(name="PRECIO_RENTA",nullable=false)
	private int precio_renta;
	
	@Column(name="TRACKLIST",nullable=false)
	private  String tracklist;
	
	@Column(name="NOMBRE_IMAGEN",nullable=false)
	private  String nombre_imagen;
	
	@Column(name="DEMO",nullable=true)
	private  String demo;
	
	@Column(name="RECOMENDADO",nullable=false)
	private  String recomendado;
	
	@Column(name="DISPONIBLE_COMPRA",nullable=true)
	private  String disponible_compra;
	
	@Column(name="DISPONIBLE_RENTA",nullable=true)
	private  String disponible_renta;

	public String getDisponible_compra() {
		return disponible_compra;
	}

	public void setDisponible_compra(String disponible_compra) {
		this.disponible_compra = disponible_compra;
	}

	public String getDisponible_renta() {
		return disponible_renta;
	}

	public void setDisponible_renta(String disponible_renta) {
		this.disponible_renta = disponible_renta;
	}

	public String getRecomendado() {
		return recomendado;
	}

	public void setRecomendado(String recomendado) {
		this.recomendado = recomendado;
	}

	public String getNombre_imagen() {
		return nombre_imagen;
	}

	public void setNombre_imagen(String nombre_imagen) {
		this.nombre_imagen = nombre_imagen;
	}

	public String getDemo() {
		return demo;
	}

	public void setDemo(String demo) {
		this.demo = demo;
	}

	public int getId() {
		return id;
	}

	public String getNombre_disco() {
		return nombre_disco;
	}

	public void setNombre_disco(String nombre_disco) {
		this.nombre_disco = nombre_disco;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String nombre_artista) {
		this.artista = nombre_artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(int precio_compra) {
		this.precio_compra = precio_compra;
	}

	public int getPrecio_renta() {
		return precio_renta;
	}

	public void setPrecio_renta(int precio_renta) {
		this.precio_renta = precio_renta;
	}

	public String getTracklist() {
		return tracklist;
	}

	public void setTracklist(String tracklist) {
		this.tracklist = tracklist;
	}

	public int getExistentes_compra() {
		return existentes_compra;
	}

	public void setExistentes_compra(int existentes_compra) {
		this.existentes_compra = existentes_compra;
	}

	public int getExistentes_renta() {
		return existentes_renta;
	}

	public void setExistentes_renta(int existentes_renta) {
		this.existentes_renta = existentes_renta;
	}
}
