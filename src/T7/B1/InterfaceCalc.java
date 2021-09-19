package T7.B1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCalc extends Remote {
    public int cong(int a, int b) throws RemoteException;
    public int tru(int a, int b) throws RemoteException;
    public int nhan(int a, int b) throws RemoteException;
    public String chia(int a, int b) throws RemoteException;
    public PhanSo cong(PhanSo a, PhanSo b)throws RemoteException;
    public PhanSo tru(PhanSo a, PhanSo b)throws RemoteException;
    public PhanSo nhan(PhanSo a, PhanSo b)throws RemoteException;
    public PhanSo chia(PhanSo a, PhanSo b)throws RemoteException;

}
