

// File generated by OpenXava: Fri Feb 19 11:09:00 CET 2021
// Archivo generado por OpenXava: Fri Feb 19 11:09:00 CET 2021

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: City		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface ICity  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_code = "code"; 	
	int getCode() throws RemoteException; 	
	public static final String PROPERTY_name = "name"; 
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException;		

	// References/Referencias 

	// State : Reference/Referencia
	
	org.openxava.test.model.IState getState() throws RemoteException;
	void setState(org.openxava.test.model.IState newState) throws RemoteException;

	// Methods 


}