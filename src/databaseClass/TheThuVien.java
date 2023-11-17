package databaseClass;

public class TheThuVien
{
    private int SoThe;
    private Date NgayBatDau;
    private Date NgayHetHan;
    private String GhichuTTV;

    TheThuVien()
    {
    }

    TheThuVien(int SoThe, Date NgayBatDau, Date NgayHetHan, String GhichuTTV)
    {
        setSoThe(SoThe);
        setNgayBatDau(NgayBatDau);
        setNgayHetHan(NgayHetHan);
        setGhichuTTV(GhichuTTV);
    }

    public int getSoThe()
    {
        return SoThe;
    }

    private void setSoThe(int SoThe)
    {
        this.SoThe = SoThe;
    }

    public Date getNgayBatDau()
    {
        return NgayBatDau;
    }

    private void setNgayBatDau(Date NgayBatDau)
    {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayHetHan()
    {
        return NgayHetHan;
    }

    private void setNgayHetHan(Date NgayHetHan)
    {
        this.NgayHetHan = NgayHetHan;
    }

    public String getGhichuTTV()
    {
        return GhichuTTV;
    }

    private void setGhichuTTV(String GhichuTTV)
    {
        this.GhichuTTV = GhichuTTV;
    }
}
