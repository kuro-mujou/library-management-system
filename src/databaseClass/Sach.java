
package databaseClass;

public class Sach
{
    private int MaSach;
    private String TenSach;
    private NhaXuatBan MaNXB;
    private TacGia MaTacGia;
    private TheLoai MaTheLoai;
     private int NamXB;

    public Sach() {
    }

    public Sach(int MaSach, String TenSach, int NamXB, NhaXuatBan MaNXB, TacGia MaTacGia, TheLoai MaTheLoai) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.NamXB = NamXB;
        this.MaNXB = MaNXB;
        this.MaTacGia = MaTacGia;
        this.MaTheLoai = MaTheLoai;
    }

    public Sach(String TenSach, NhaXuatBan MaNXB, TacGia MaTacGia, TheLoai MaTheLoai, int NamXB) {
        this.TenSach = TenSach;
        this.MaNXB = MaNXB;
        this.MaTacGia = MaTacGia;
        this.MaTheLoai = MaTheLoai;
        this.NamXB = NamXB;
    }

    public int getMaSach() {
        return MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public int getNamXB() {
        return NamXB;
    }

    public NhaXuatBan getMaNXB() {
        return MaNXB;
    }

    public TacGia getMaTacGia() {
        return MaTacGia;
    }

    public TheLoai getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public void setNamXB(int NamXB) {
        this.NamXB = NamXB;
    }

    public void setMaNXB(NhaXuatBan MaNXB) {
        this.MaNXB = MaNXB;
    }

    public void setMaTacGia(TacGia MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public void setMaTheLoai(TheLoai MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }
    
    
}
