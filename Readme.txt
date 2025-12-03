This is a Java RMI (Remote Method Invocation) project for parallel programming. Here's how it works:

Project Components
1. MiInterfazRemota.java - Remote Interface

Defines the contract for remote methods

Extends Remote interface (required for RMI)

All methods must throw RemoteException

2. MiClaseRemota.java - Server Implementation

Implements the remote interface

Extends UnicastRemoteObject for RMI functionality

Contains the main method that acts as the RMI Server

3. MiClienteRMI.java - Client Application

Connects to the remote server

Calls remote methods as if they were local

How It Works
Server Side (MiClaseRemota):
Creates an RMI registry on a specified port

Instantiates the remote object

Binds it to the registry with name "PruebaRMI"

Waits for client connections

Client Side (MiClienteRMI):
Looks up the remote object by name and address

Calls miMetodo2() to get a number (returns 5)

Calls miMetodo1() that many times (prints "Estoy en miMetodo1()")

Execution Flow
Start Server:
java MiClaseRemota <port>


Run Client:
java MiClienteRMI <server_ip> <port>


The client will print "Estoy en miMetodo1()" 5 times, demonstrating remote method execution across the network. This shows distributed computing - the client executes methods on a remote server, which is a fundamental concept in parallel programming.