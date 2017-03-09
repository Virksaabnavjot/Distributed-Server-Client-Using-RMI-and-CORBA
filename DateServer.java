/*
This is a Java/CORBA server that illustrates the use
of stringified object references stored in a file on
a server that is different from the machine on which
either the CORBA server or the CORBA client are located.

This server provides a servant object that returns the
date and time as a string. */

import DateApp.*;
import org.omg.CORBA.*;
import java.util.Date;
import java.io.*;
import java.net.*;

public class DateServer   {
	static String stringifiedObjectReference;

  public static void main(String args[]){
    try{
      //Create and initialize the ORB
      ORB orb = ORB.init(args,null);
      //Instantiate a DateInterfaceServant servant
      DateInterfaceServant dts = new DateInterfaceServant();
      // Register/connect the above servant with the ORB
      orb.connect(dts);
      //Convert the object reference to a string (using the predefined object_to_string() method)
			String ior = orb.object_to_string(dts);
      //and store it in a common file named IOR for access by the client.

      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("IOR")) ;

        //write the stringified object reference to the file
        out.writeObject(ior);
				out.close();
				System.out.println("Server is running");

        orb.run();
    }catch (Exception e) {
       System.err.println("ERROR: " + e);
       e.printStackTrace(System.out);
    }//end catch block
  }//end main()
}
