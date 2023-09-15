
package databaseClass;

public class NhaXuatBan 
{
    private int MaNXB;
    private String TenNXB;
    private String DiaChi;
    private String Email;
    private String ThongTinNDD;

    public NhaXuatBan(int MaNXB, String TenNXB) {
        this.MaNXB = MaNXB;
        this.TenNXB = TenNXB;
    }

    public NhaXuatBan(String TenNXB) {
        this.TenNXB = TenNXB;
    }
    
    public NhaXuatBan() {
    }

    public NhaXuatBan(int MaNXB) {
        this.MaNXB = MaNXB;
    }

    public NhaXuatBan(int MaNXB, String TenNXB, String DiaChiNXB, String Email, String ThongTinNDD) {
        this.MaNXB = MaNXB;
        this.TenNXB = TenNXB;
        this.DiaChi = DiaChiNXB;
        this.Email = Email;
        this.ThongTinNDD = ThongTinNDD;
    }

    public int getMaNXB() {
        return MaNXB;
    }

    public String getTenNXB() {
        return TenNXB;
    }

    public String getDiaChiNXB() {
        return DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public String getThongTinNDD() {
        return ThongTinNDD;
    }

    public void setMaNXB(int MaNXB) {
        this.MaNXB = MaNXB;
    }

    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
    }

    public void setDiaChiNXB(String DiaChiNXB) {
        this.DiaChi = DiaChiNXB;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setThongTinNDD(String ThongTinNDD) {
        this.ThongTinNDD = ThongTinNDD;
    }
    
    
}
