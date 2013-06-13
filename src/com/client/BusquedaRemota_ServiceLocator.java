/**
 * BusquedaRemota_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.client;

public class BusquedaRemota_ServiceLocator extends org.apache.axis.client.Service implements com.client.BusquedaRemota_Service {

    public BusquedaRemota_ServiceLocator() {
    }


    public BusquedaRemota_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BusquedaRemota_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BusquedaRemotaPort
    private java.lang.String BusquedaRemotaPort_address = "http://localhost:8081/services/BusquedaRemota";

    public java.lang.String getBusquedaRemotaPortAddress() {
        return BusquedaRemotaPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BusquedaRemotaPortWSDDServiceName = "BusquedaRemotaPort";

    public java.lang.String getBusquedaRemotaPortWSDDServiceName() {
        return BusquedaRemotaPortWSDDServiceName;
    }

    public void setBusquedaRemotaPortWSDDServiceName(java.lang.String name) {
        BusquedaRemotaPortWSDDServiceName = name;
    }

    public com.client.BusquedaRemota_PortType getBusquedaRemotaPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BusquedaRemotaPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBusquedaRemotaPort(endpoint);
    }

    public com.client.BusquedaRemota_PortType getBusquedaRemotaPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.client.BusquedaRemotaPortBindingStub _stub = new com.client.BusquedaRemotaPortBindingStub(portAddress, this);
            _stub.setPortName(getBusquedaRemotaPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBusquedaRemotaPortEndpointAddress(java.lang.String address) {
        BusquedaRemotaPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.client.BusquedaRemota_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.client.BusquedaRemotaPortBindingStub _stub = new com.client.BusquedaRemotaPortBindingStub(new java.net.URL(BusquedaRemotaPort_address), this);
                _stub.setPortName(getBusquedaRemotaPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BusquedaRemotaPort".equals(inputPortName)) {
            return getBusquedaRemotaPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://imp.services.com/", "BusquedaRemota");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://imp.services.com/", "BusquedaRemotaPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BusquedaRemotaPort".equals(portName)) {
            setBusquedaRemotaPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
