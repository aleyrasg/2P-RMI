import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MiClaseRemota extends UnicastRemoteObject implements MiInterfazRemota {

    public MiClaseRemota() throws RemoteException {
        // Código del constructor
    }

    public void miMetodo1() throws RemoteException {
        // Aquí ponemos el código que queramos
        System.out.println("Estoy en miMetodo1()");
    }

    public int miMetodo2() throws RemoteException {
        // Aquí ponemos el código que queramos
        return 5;
    }

    public void otroMetodo() {
        //
        //
    }

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(
                    Integer.parseInt(args[0]));

            MiInterfazRemota mir = new MiClaseRemota();

            java.rmi.Naming.rebind("//" +
                    java.net.InetAddress.getLocalHost().getHostAddress() +
                    ":" + args[0] + "/PruebaRMI", mir);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}