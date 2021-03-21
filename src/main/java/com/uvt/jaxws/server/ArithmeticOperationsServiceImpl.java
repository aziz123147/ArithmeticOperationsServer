package com.uvt.jaxws.server;

import javax.jws.WebService;


@WebService(endpointInterface = "com.uvt.jaxws.server.ArithmeticOperationsService", 
serviceName = "arithmeticOperationsService", 
portName = "arithmeticOperationsPort", 
targetNamespace = "http://com.uvt.jaxws.server/" )

//<endpoint implementation="com.uvt.jaxws.server.ArithmeticOperationsServiceImpl"
public class ArithmeticOperationsServiceImpl implements ArithmeticOperationsService{

		   
	   private int parseInteger(String s)	{     
	      return Integer.parseInt(s);
	   }
	   
	   // WebMethod that adds two integers represented by String arguments
	   public String add( String first,  String second ) {  
	      int operand1 = this.parseInteger( first );
	      int operand2 = this.parseInteger( second );
	      int result = operand1 + operand2;    
     
	      return String.valueOf(result);
	   }   

	   
	   public String sub( String first,  String second ) {  
		      int operand1 = this.parseInteger( first );
		      int operand2 = this.parseInteger( second );
		      int result = operand1 - operand2;    
	     
		      return String.valueOf(result);
		   }
	   
	   public static int factorielle (int n) {
	        if (n==0) return(1);
	        else return(n*factorielle(n-1));
	    }
	  
	 public String Fact  ( String operande )
	 {
		int x =parseInteger ( operande);
		int result = factorielle ( x ) ; 
		return String.valueOf(result);
		 
	 }
}
