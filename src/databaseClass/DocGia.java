package databaseClass;

public class DocGia
{
    private int userID;
    private String name;
    private String phone;
    private String email;
    private String adrress;
    private String gender;
    private int age;

    public DocGia() {
    }

    public DocGia(int userID, String name, String phone, String email, String adrress, String gender, int age) {
        this.userID = userID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.adrress = adrress;
        this.gender = gender;
        this.age = age;
    }

    public DocGia(String name, String phone, String email, String adrress, String gender, int age) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.adrress = adrress;
        this.gender = gender;
        this.age = age;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAdrress() {
        return adrress;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    
}
