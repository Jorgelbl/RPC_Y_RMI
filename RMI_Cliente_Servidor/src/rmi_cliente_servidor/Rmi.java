
package rmi_cliente_servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Jorge
 */
public class Rmi extends UnicastRemoteObject implements Suma {
    
    public Rmi() throws RemoteException{}
    
    @Override
    public String suma(String a, String b) throws RemoteException {
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
    
    
}
