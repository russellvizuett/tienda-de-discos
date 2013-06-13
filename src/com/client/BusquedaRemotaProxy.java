package com.client;

public class BusquedaRemotaProxy implements com.client.BusquedaRemota_PortType {
  private String _endpoint = null;
  private com.client.BusquedaRemota_PortType busquedaRemota_PortType = null;
  
  public BusquedaRemotaProxy() {
    _initBusquedaRemotaProxy();
  }
  
  public BusquedaRemotaProxy(String endpoint) {
    _endpoint = endpoint;
    _initBusquedaRemotaProxy();
  }
  
  private void _initBusquedaRemotaProxy() {
    try {
      busquedaRemota_PortType = (new com.client.BusquedaRemota_ServiceLocator()).getBusquedaRemotaPort();
      if (busquedaRemota_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)busquedaRemota_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)busquedaRemota_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (busquedaRemota_PortType != null)
      ((javax.xml.rpc.Stub)busquedaRemota_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.client.BusquedaRemota_PortType getBusquedaRemota_PortType() {
    if (busquedaRemota_PortType == null)
      _initBusquedaRemotaProxy();
    return busquedaRemota_PortType;
  }
  
  public com.client.Disco[] buscarTodo(java.lang.String arg0) throws java.rmi.RemoteException{
    if (busquedaRemota_PortType == null)
      _initBusquedaRemotaProxy();
    return busquedaRemota_PortType.buscarTodo(arg0);
  }
  
  public com.client.Disco[] buscarColumna(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (busquedaRemota_PortType == null)
      _initBusquedaRemotaProxy();
    return busquedaRemota_PortType.buscarColumna(arg0, arg1);
  }
  
  
}