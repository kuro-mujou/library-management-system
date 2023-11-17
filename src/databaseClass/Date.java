package databaseClass;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date
{
    private String Ngay;
    private String Thang;
    private String Nam;
    private LocalDate currentDate;

    Date()
    {
        Ngay = "1";
        Thang = "1";
        Nam = "1900";
        convertDay();
    }

    Date(String ngay, String thang, String nam)
    {
        setNam(nam);
        setThang(thang);
        setNgay(ngay);
        convertDay();
    }

    public String getNgay()
    {
        return Ngay;
    }

    private void setNgay(String Ngay)
    {
        int day = Integer.parseInt(Ngay);
        int year = Integer.parseInt(this.Nam);
        int month = Integer.parseInt(this.Thang);
        int maxday = YearMonth.of(year, month).lengthOfMonth();
        if (day < 0)
        {
            this.Ngay = "1";
        } else if (day > maxday)
        {
            this.Ngay = String.valueOf(maxday);
        } else
        {
            this.Ngay = Ngay;
        }
    }

    public String getThang()
    {
        return Thang;
    }

    private void setThang(String Thang)
    {
        int thang = Integer.parseInt(Thang);
        if (thang < 1)
        {
            this.Thang = "1";
        } else if (thang > 12)
        {
            this.Thang = "12";
        } else
        {
            this.Thang = Thang;
        }
    }

    public String getNam()
    {
        return Nam;
    }

    private void setNam(String Nam)
    {
        this.Nam = Nam;
    }

    private void convertDay()
    {
        currentDate = LocalDate.parse(this.toString(), DateTimeFormatter.ofPattern("d-M-yyyy"));
    }

    @Override
    public String toString()
    {
        return this.Ngay + "-" + this.Thang + "-" + this.Nam;
    }

    long CalculateDayDiff(Date secondDay)
    {
        Duration diff = Duration.between(this.currentDate.atStartOfDay(), secondDay.currentDate.atStartOfDay());
        long diffDays = diff.toDays();
        return diffDays;
    }
}
