/**
 * Disco.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.client;

public class Disco  implements java.io.Serializable {
    private java.lang.String artista;

    private java.lang.String demo;

    private java.lang.String disponible_compra;

    private java.lang.String disponible_renta;

    private int existentes_compra;

    private int existentes_renta;

    private java.lang.String genero;

    private java.lang.String nombre_disco;

    private java.lang.String nombre_imagen;

    private int precio_compra;

    private int precio_renta;

    private java.lang.String recomendado;

    private java.lang.String tracklist;

    public Disco() {
    }

    public Disco(
           java.lang.String artista,
           java.lang.String demo,
           java.lang.String disponible_compra,
           java.lang.String disponible_renta,
           int existentes_compra,
           int existentes_renta,
           java.lang.String genero,
           java.lang.String nombre_disco,
           java.lang.String nombre_imagen,
           int precio_compra,
           int precio_renta,
           java.lang.String recomendado,
           java.lang.String tracklist) {
           this.artista = artista;
           this.demo = demo;
           this.disponible_compra = disponible_compra;
           this.disponible_renta = disponible_renta;
           this.existentes_compra = existentes_compra;
           this.existentes_renta = existentes_renta;
           this.genero = genero;
           this.nombre_disco = nombre_disco;
           this.nombre_imagen = nombre_imagen;
           this.precio_compra = precio_compra;
           this.precio_renta = precio_renta;
           this.recomendado = recomendado;
           this.tracklist = tracklist;
    }


    /**
     * Gets the artista value for this Disco.
     * 
     * @return artista
     */
    public java.lang.String getArtista() {
        return artista;
    }


    /**
     * Sets the artista value for this Disco.
     * 
     * @param artista
     */
    public void setArtista(java.lang.String artista) {
        this.artista = artista;
    }


    /**
     * Gets the demo value for this Disco.
     * 
     * @return demo
     */
    public java.lang.String getDemo() {
        return demo;
    }


    /**
     * Sets the demo value for this Disco.
     * 
     * @param demo
     */
    public void setDemo(java.lang.String demo) {
        this.demo = demo;
    }


    /**
     * Gets the disponible_compra value for this Disco.
     * 
     * @return disponible_compra
     */
    public java.lang.String getDisponible_compra() {
        return disponible_compra;
    }


    /**
     * Sets the disponible_compra value for this Disco.
     * 
     * @param disponible_compra
     */
    public void setDisponible_compra(java.lang.String disponible_compra) {
        this.disponible_compra = disponible_compra;
    }


    /**
     * Gets the disponible_renta value for this Disco.
     * 
     * @return disponible_renta
     */
    public java.lang.String getDisponible_renta() {
        return disponible_renta;
    }


    /**
     * Sets the disponible_renta value for this Disco.
     * 
     * @param disponible_renta
     */
    public void setDisponible_renta(java.lang.String disponible_renta) {
        this.disponible_renta = disponible_renta;
    }


    /**
     * Gets the existentes_compra value for this Disco.
     * 
     * @return existentes_compra
     */
    public int getExistentes_compra() {
        return existentes_compra;
    }


    /**
     * Sets the existentes_compra value for this Disco.
     * 
     * @param existentes_compra
     */
    public void setExistentes_compra(int existentes_compra) {
        this.existentes_compra = existentes_compra;
    }


    /**
     * Gets the existentes_renta value for this Disco.
     * 
     * @return existentes_renta
     */
    public int getExistentes_renta() {
        return existentes_renta;
    }


    /**
     * Sets the existentes_renta value for this Disco.
     * 
     * @param existentes_renta
     */
    public void setExistentes_renta(int existentes_renta) {
        this.existentes_renta = existentes_renta;
    }


    /**
     * Gets the genero value for this Disco.
     * 
     * @return genero
     */
    public java.lang.String getGenero() {
        return genero;
    }


    /**
     * Sets the genero value for this Disco.
     * 
     * @param genero
     */
    public void setGenero(java.lang.String genero) {
        this.genero = genero;
    }


    /**
     * Gets the nombre_disco value for this Disco.
     * 
     * @return nombre_disco
     */
    public java.lang.String getNombre_disco() {
        return nombre_disco;
    }


    /**
     * Sets the nombre_disco value for this Disco.
     * 
     * @param nombre_disco
     */
    public void setNombre_disco(java.lang.String nombre_disco) {
        this.nombre_disco = nombre_disco;
    }


    /**
     * Gets the nombre_imagen value for this Disco.
     * 
     * @return nombre_imagen
     */
    public java.lang.String getNombre_imagen() {
        return nombre_imagen;
    }


    /**
     * Sets the nombre_imagen value for this Disco.
     * 
     * @param nombre_imagen
     */
    public void setNombre_imagen(java.lang.String nombre_imagen) {
        this.nombre_imagen = nombre_imagen;
    }


    /**
     * Gets the precio_compra value for this Disco.
     * 
     * @return precio_compra
     */
    public int getPrecio_compra() {
        return precio_compra;
    }


    /**
     * Sets the precio_compra value for this Disco.
     * 
     * @param precio_compra
     */
    public void setPrecio_compra(int precio_compra) {
        this.precio_compra = precio_compra;
    }


    /**
     * Gets the precio_renta value for this Disco.
     * 
     * @return precio_renta
     */
    public int getPrecio_renta() {
        return precio_renta;
    }


    /**
     * Sets the precio_renta value for this Disco.
     * 
     * @param precio_renta
     */
    public void setPrecio_renta(int precio_renta) {
        this.precio_renta = precio_renta;
    }


    /**
     * Gets the recomendado value for this Disco.
     * 
     * @return recomendado
     */
    public java.lang.String getRecomendado() {
        return recomendado;
    }


    /**
     * Sets the recomendado value for this Disco.
     * 
     * @param recomendado
     */
    public void setRecomendado(java.lang.String recomendado) {
        this.recomendado = recomendado;
    }


    /**
     * Gets the tracklist value for this Disco.
     * 
     * @return tracklist
     */
    public java.lang.String getTracklist() {
        return tracklist;
    }


    /**
     * Sets the tracklist value for this Disco.
     * 
     * @param tracklist
     */
    public void setTracklist(java.lang.String tracklist) {
        this.tracklist = tracklist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Disco)) return false;
        Disco other = (Disco) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.artista==null && other.getArtista()==null) || 
             (this.artista!=null &&
              this.artista.equals(other.getArtista()))) &&
            ((this.demo==null && other.getDemo()==null) || 
             (this.demo!=null &&
              this.demo.equals(other.getDemo()))) &&
            ((this.disponible_compra==null && other.getDisponible_compra()==null) || 
             (this.disponible_compra!=null &&
              this.disponible_compra.equals(other.getDisponible_compra()))) &&
            ((this.disponible_renta==null && other.getDisponible_renta()==null) || 
             (this.disponible_renta!=null &&
              this.disponible_renta.equals(other.getDisponible_renta()))) &&
            this.existentes_compra == other.getExistentes_compra() &&
            this.existentes_renta == other.getExistentes_renta() &&
            ((this.genero==null && other.getGenero()==null) || 
             (this.genero!=null &&
              this.genero.equals(other.getGenero()))) &&
            ((this.nombre_disco==null && other.getNombre_disco()==null) || 
             (this.nombre_disco!=null &&
              this.nombre_disco.equals(other.getNombre_disco()))) &&
            ((this.nombre_imagen==null && other.getNombre_imagen()==null) || 
             (this.nombre_imagen!=null &&
              this.nombre_imagen.equals(other.getNombre_imagen()))) &&
            this.precio_compra == other.getPrecio_compra() &&
            this.precio_renta == other.getPrecio_renta() &&
            ((this.recomendado==null && other.getRecomendado()==null) || 
             (this.recomendado!=null &&
              this.recomendado.equals(other.getRecomendado()))) &&
            ((this.tracklist==null && other.getTracklist()==null) || 
             (this.tracklist!=null &&
              this.tracklist.equals(other.getTracklist())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getArtista() != null) {
            _hashCode += getArtista().hashCode();
        }
        if (getDemo() != null) {
            _hashCode += getDemo().hashCode();
        }
        if (getDisponible_compra() != null) {
            _hashCode += getDisponible_compra().hashCode();
        }
        if (getDisponible_renta() != null) {
            _hashCode += getDisponible_renta().hashCode();
        }
        _hashCode += getExistentes_compra();
        _hashCode += getExistentes_renta();
        if (getGenero() != null) {
            _hashCode += getGenero().hashCode();
        }
        if (getNombre_disco() != null) {
            _hashCode += getNombre_disco().hashCode();
        }
        if (getNombre_imagen() != null) {
            _hashCode += getNombre_imagen().hashCode();
        }
        _hashCode += getPrecio_compra();
        _hashCode += getPrecio_renta();
        if (getRecomendado() != null) {
            _hashCode += getRecomendado().hashCode();
        }
        if (getTracklist() != null) {
            _hashCode += getTracklist().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Disco.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imp.services.com/", "disco"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artista");
        elemField.setXmlName(new javax.xml.namespace.QName("", "artista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "demo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponible_compra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disponible_compra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponible_renta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disponible_renta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existentes_compra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "existentes_compra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existentes_renta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "existentes_renta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre_disco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre_disco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre_imagen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre_imagen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precio_compra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precio_compra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precio_renta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precio_renta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recomendado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recomendado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracklist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tracklist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
