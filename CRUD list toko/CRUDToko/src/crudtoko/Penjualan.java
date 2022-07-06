package crudtoko;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Penjualan {
    String kode;
    LocalDate tgl;
    Pelanggan plg;
    List<PenjualanDetail> listPD = new ArrayList<PenjualanDetail>();
    
    public Penjualan(LocalDate tgl, Pelanggan plg,String kode) {
        this.tgl = tgl;
        this.plg = plg;
        this.kode=kode;
    }
    void setKode(String kode){
        this.kode=kode;
    }
    String getKode(){
        return kode;
    }
    void add(PenjualanDetail pd){
        listPD.add(pd);
    }
    int getTotal(){
        int total=0;
        for(int i=0;i<listPD.size();i++){
            total+=listPD.get(i).getSubTotal();
        }
    return total;
    }

}
