
package databaseClass;
 
public class MuonTra 
{
    
    private  int MaMuonTra;
    private Date NgayMuon;
    private Date NgayTra;
    
    
    
    void setMaMuonTra(int maMuonTra){
        MaMuonTra=maMuonTra;
    }
    int getMaMuonTra(){
        return this.MaMuonTra;
    }
   
    void setNgayMuon(String dd,String mm,String yy){
        this.NgayMuon=new Date(dd,mm,yy);
    }
    String getNgayMuon(){
        return this.NgayMuon.toString();
    }
    
    void setNgayTra(String dd,String mm,String yy){
        this.NgayTra=new Date(dd,mm,yy);
    }
    String getNgayTra(){
        return this.NgayTra.toString();
    }
    
    private boolean Datra(){
        Date d = new Date();
        if (NgayTra.getNam().compareTo(NgayMuon.getNam())>0) 
            return true;
        else if(NgayTra.getThang().compareTo(NgayMuon.getThang())>0) 
            return true;
        else if (NgayTra.getNgay().compareTo(NgayMuon.getNgay())>=0 && NgayMuon.toString().compareTo(d.toString())>0) 
            return true;
        else 
            return false;
    }
    
    // da tinh toan den truong hop muon va tra trong cung 1 ngay...
}
