package T7.B1;

import java.io.Serializable;

public class PhanSo implements Serializable {
    int tu;
    int mau;

    public PhanSo() {
        tu = 0; mau =1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public PhanSo cong(PhanSo b){
        PhanSo c= new PhanSo();
        c.setTu(tu*b.getMau()+b.getTu()*mau);
        c.setMau(mau*b.getMau());
        return c;
    }
    
    public PhanSo tru(PhanSo b){
        PhanSo c= new PhanSo();
        c.setTu(tu*b.getMau()-b.getTu()*mau);
        c.setMau(mau*b.getMau());
        return c;
    }
    
     public PhanSo nhan(PhanSo b){
        PhanSo c= new PhanSo();
        c.setTu(tu*b.getTu());
        c.setMau(mau*b.getMau());
        return c;
    }
     
      public PhanSo chia(PhanSo b){
        PhanSo c= new PhanSo();
        c.setTu(tu*b.getMau());
        c.setMau(mau*b.getTu());
        return c;
    }
}
