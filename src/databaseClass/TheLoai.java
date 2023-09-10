
package databaseClass;

public class TheLoai 
{
    private int MaTheLoai;
    private String TenTheLoai;

    public TheLoai() {
    }

    public TheLoai(int MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public TheLoai(int MaTheLoai, String TenTheLoai) {
        this.MaTheLoai = MaTheLoai;
        this.TenTheLoai = TenTheLoai;
    }

    public int getMaTheLoai() {
        return MaTheLoai;
    }

    public String getTenTheLoai() {
        return TenTheLoai;
    }

    public void setMaTheLoai(int MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public void setTenTheLoai(String TenTheLoai) {
        this.TenTheLoai = TenTheLoai;
    }
    
}
