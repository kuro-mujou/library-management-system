
package databaseClass;

public class DocGia 
{
    private int MaDocGia;
    private String TenDocGia;
    private String DiaChiDG;
    
    
    DocGia(){}
    DocGia(int maDocGia,String tenDocGia,String diaChiDG){
        setMaDocGia(maDocGia);
        setTenDocGia(tenDocGia);
        setDiaChiDG(diaChiDG);
    }
      public int getMaDocGia() {
		return MaDocGia;
	}

	public void setMaDocGia(int maDocGia) {
		MaDocGia = maDocGia;
	}

	public String getTenDocGia() {
		return TenDocGia;
	}

	public void setTenDocGia(String tenDocGia) {
		TenDocGia = tenDocGia;
	}

	public String getDiaChiDG() {
		return DiaChiDG;
	}

	public void setDiaChiDG(String diaChiDG) {
		DiaChiDG = diaChiDG;
	}
}
