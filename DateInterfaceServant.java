import DateApp.*;
import org.omg.CORBA.*;
import java.util.Date;
import java.io.*;
import java.net.*;

class DateInterfaceServant extends _DateInterfaceImplBase{

	//define the public method getDateMethod(), which returns
	//the current date as a String.

	//use Date().toString() to obtain the current date.
	public String getDate() {
	// Instantiate a Date object
  Date date = new Date();
	String currentDate = date.toString();
  return currentDate;
  }//end getDateMethod()
}//end DateInterfaceservant class
