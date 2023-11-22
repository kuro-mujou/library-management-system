package databaseClass;

public class DocGia
{
    private int MaDocGia;
    private String TenDocGia;
    private String DiaChiDG;
    private int SoThe;


    DocGia(int maDocGia, String tenDocGia, String diaChiDG, int SoThe)
    {
        setMaDocGia(maDocGia);
        setTenDocGia(tenDocGia);
        setDiaChiDG(diaChiDG);
        setSoThe(SoThe);
    }

    public DocGia()
    {
        
    }

    public int getMaDocGia()
    {
        return MaDocGia;
    }

    public void setMaDocGia(int maDocGia)
    {
        MaDocGia = maDocGia;
    }

    public String getTenDocGia()
    {
        return TenDocGia;
    }

    public void setTenDocGia(String tenDocGia)
    {
        TenDocGia = tenDocGia;
    }

    public String getDiaChiDG()
    {
        return DiaChiDG;
    }

    public void setDiaChiDG(String diaChiDG)
    {
        DiaChiDG = diaChiDG;
    }

    public int getSoThe()
    {
        return SoThe;
    }

    public void setSoThe(int SoThe)
    {
        this.SoThe = SoThe;
    }
}
