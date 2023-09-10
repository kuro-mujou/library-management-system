
package databaseClass;

public class TacGia 
{
    private int MaTacGia;
    private String TenTacGia;
    private String GhiChu;

    public TacGia(int MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public TacGia() {
    }

    public TacGia(int MaTacGia, String TenTacGia, String GhiChuTG) {
        this.MaTacGia = MaTacGia;
        this.TenTacGia = TenTacGia;
        this.GhiChu = GhiChuTG;
    }

 

    public int getMaTacGia() {
        return MaTacGia;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setMaTacGia(int MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

    public void setGhiChuTG(String GhiChuTG) {
        this.GhiChu = GhiChuTG;
    }
    

    public String getGhiChuTG() {
        return GhiChu;
    }
    
}
