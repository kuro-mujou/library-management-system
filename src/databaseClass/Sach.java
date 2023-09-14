
package databaseClass;

public class Sach
{
    private int MaSach;
    private String TenSach;
    private NhaXuatBan MaNXB;
    private TacGia MaTacGia;
    private TheLoai MaTheLoai;
    private int SoLuong;
     private int NamXB;

    public Sach() {
    }

    public Sach(int MaSach, String TenSach, NhaXuatBan MaNXB, TacGia MaTacGia, TheLoai MaTheLoai, int SoLuong, int NamXB) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.MaNXB = MaNXB;
        this.MaTacGia = MaTacGia;
        this.MaTheLoai = MaTheLoai;
        this.SoLuong = SoLuong;
        this.NamXB = NamXB;
    }

    public Sach(int MaSach) {
        this.MaSach = MaSach;
    }

    public Sach(String TenSach, NhaXuatBan MaNXB, TacGia MaTacGia, TheLoai MaTheLoai, int SoLuong, int NamXB) {
        this.TenSach = TenSach;
        this.MaNXB = MaNXB;
        this.MaTacGia = MaTacGia;
        this.MaTheLoai = MaTheLoai;
        this.SoLuong = SoLuong;
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

    public int getSoLuong() {
        return SoLuong;
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

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
}
