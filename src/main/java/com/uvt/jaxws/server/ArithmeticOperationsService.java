package com.uvt.jaxws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name = "arithmeticService")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface ArithmeticOperationsService {	 
	  
	   @WebMethod( operationName = "add" ) 
	   public String add( @WebParam( name = "first" ) String first,
			   			  @WebParam( name = "second" ) String second );

	   @WebMethod( operationName = "sub" ) 
	   public String sub( @WebParam( name = "first" ) String first,
			   			  @WebParam( name = "second" ) String second );
	   
	   @WebMethod (operationName= "Factorielle")
		public String Fact  ( @WebParam( name = "operande" ) String Operande );

}



