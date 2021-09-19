package T7.B1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calc extends UnicastRemoteObject implements InterfaceCalc {

    public Calc() throws RemoteException{

    }

    @Override
    public int cong(int a, int b) throws RemoteException {
        int c = a + b;
        return c;
    }

    @Override
    public int tru(int a, int b) throws RemoteException {
        int t = a- b;
        return t;
    }

    @Override
    public int nhan(int a, int b) throws RemoteException {
        int n = a*b;
        return n;
    }

    @Override
    public String chia(int a, int b) throws RemoteException {
        int ch = a/b;
        int du = a%b;
        return ch+"@"+du;
    }

    @Override
    public PhanSo cong(PhanSo a, PhanSo b) throws RemoteException {
        return a.cong(b);
    }

    @Override
    public PhanSo tru(PhanSo a, PhanSo b) throws RemoteException {
        return a.tru(b);
    }

    @Override
    public PhanSo nhan(PhanSo a, PhanSo b) throws RemoteException {
        return a.nhan(b);
    }

    @Override
    public PhanSo chia(PhanSo a, PhanSo b) throws RemoteException {
        return a.chia(b);
    }
}
//