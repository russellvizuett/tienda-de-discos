/**
 * BusquedaRemota_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.client;

public interface BusquedaRemota_PortType extends java.rmi.Remote {
    public com.client.Disco[] buscarTodo(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.client.Disco[] buscarColumna(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
}
