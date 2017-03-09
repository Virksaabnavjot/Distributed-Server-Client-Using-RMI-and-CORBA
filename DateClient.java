import DateApp.*;
import org.omg.CORBA.*;
import java.io.*;
import java.net.*;


public class DateClient{
  static String stringifiedObjectReference;

  public static void main(String args[]){
    try{

      // create and initialize the ORB
      ORB orb = ORB.init(args,null);

      //Read from file and convert the stringified object reference
      // to a generic CORBA object reference
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("IOR")) ;
        String ior = (String) in.readObject() ;
        in.close() ;

        //Convert the string read from the IOR file to an Object, using
        // string_to_object() method.
        org.omg.CORBA.Object obj = orb.string_to_object(ior);
        //Cast, or narrow the generic object reference to a
        // true object reference.
        DateInterface my = DateInterfaceHelper.narrow(obj);

        //Call the getDateMethod() and
        // print results
        String myCurrentDate = my.getDate();
        System.out.println(myCurrentDate);

         }catch (Exception e) {
      System.out.println("ERROR : " + e) ;
      e.printStackTrace(System.out);
    }//end catch block
  }//end main() method

}//end DateClient class
