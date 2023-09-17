
package databaseClass;

public class NhanVien 
{
    private int MaNhanVien;
    private String Hoten;
    private Date NgaySinh;
    private String SoDienThoai;
    
    
    NhanVien(int maNhanVien, String hoten, Date ngaySinh, String soDienThoai) {
		MaNhanVien = maNhanVien;
		Hoten = hoten;
		NgaySinh = ngaySinh;
		SoDienThoai = soDienThoai;
	}
    
    
    public int getMaNhanVien() {
		return MaNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		MaNhanVien = maNhanVien;
	}

	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}

	public Date getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return SoDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}
}
