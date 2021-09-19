package T7.B1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class rmiServer {
    public static void main(String[] args) {
        try {
            Calc c = new Calc();
            Registry r = LocateRegistry.createRegistry(1234);
            r.bind("rmiCalc",c);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
