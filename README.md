# CORBA-Server-Client-RMI
This is a Java/CORBA server that illustrates the use of stringified object references stored in a file on a server that is different from the machine on which either the CORBA server or the CORBA client are located.  This server provides a servant object that returns the date and time as a string.



<h1>Terminal 1</h1>

<b>Compiling the idl file</b>

$ idlj -fall -oldImplBase Date.idl

<b>Compliling all our java files at once</b>

$ javac *. java

<b>Start RMI Registry</b>

$ rmiregistry &

<b>Start the Server</b>

$ java DateServer


![screen shot 2017-03-09 at 04 24 25](https://cloud.githubusercontent.com/assets/5924811/23735899/90e744e4-0480-11e7-9108-165c5a4c628f.png)



<h1>Terminal 2</h1>

<b>Start the Client</b>

$ java DateClient


![screen shot 2017-03-09 at 04 25 43](https://cloud.githubusercontent.com/assets/5924811/23735900/90e850a0-0480-11e7-9f47-bbee9abfac73.png)



Copyrights - Navjot Singh Virk (https://navjot.mrvirk.com & https://mrvirk.com)
