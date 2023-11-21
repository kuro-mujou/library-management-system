package databaseClass;

public class Sach
{
    private int MaSach;
    private String TenSach;
    private TacGia MaTacGia;
    private TheLoai MaTheLoai;
    private int SoLuong;
    private int NamXB;
    private String moTa;

    public Sach()
    {
    }

    public Sach(int MaSach, String TenSach, NhaXuatBan MaNXB, TacGia MaTacGia, TheLoai MaTheLoai, int SoLuong, int NamXB)
    {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.MaTacGia = MaTacGia;
        this.MaTheLoai = MaTheLoai;
        this.SoLuong = SoLuong;
        this.NamXB = NamXB;
    }

    public Sach(int MaSach)
    {
        this.MaSach = MaSach;
    }

    public Sach(String TenSach, NhaXuatBan MaNXB, TacGia MaTacGia, TheLoai MaTheLoai, int SoLuong, int NamXB)
    {
        this.TenSach = TenSach;
        this.MaTacGia = MaTacGia;
        this.MaTheLoai = MaTheLoai;
        this.SoLuong = SoLuong;
        this.NamXB = NamXB;
    }

    public int getMaSach()
    {
        return MaSach;
    }

    public String getTenSach()
    {
        return TenSach;
    }

    public int getNamXB()
    {
        return NamXB;
    }

    public TacGia getMaTacGia()
    {
        return MaTacGia;
    }

    public TheLoai getMaTheLoai()
    {
        return MaTheLoai;
    }

    public int getSoLuong()
    {
        return SoLuong;
    }

    public void setMaSach(int MaSach)
    {
        this.MaSach = MaSach;
    }

    public void setTenSach(String TenSach)
    {

        this.TenSach = TenSach;
    }

    public void setNamXB(int NamXB)
    {

        this.NamXB = NamXB;
    }

    public void setMaTacGia(TacGia MaTacGia)
    {
        this.MaTacGia = MaTacGia;
    }

    public void setMaTheLoai(TheLoai MaTheLoai)
    {
        this.MaTheLoai = MaTheLoai;
    }

    public void setSoLuong(int SoLuong)
    {
        this.SoLuong = SoLuong;
    }

    public String getMoTa()
    {
        return moTa;
    }

    public void setMoTa(String moTa)
    {
        this.moTa = moTa;
    }
}
