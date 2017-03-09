<h1>Terminal 1</h1>

<b>Compiling the idl file</b>

$ idlj -fall -oldImplBase Date.idl

<b>Compliling all our java files at once</b>

$ javac *. java

<b>Start RMI Registry</b>

$ rmiregistry &

<b>Start the Server</b>

$ java DateServer




<h1>Terminal 2</h1>

<b>Start the Client</b>

$ java DateClient
