import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String title;
    private String brand;
    private String country;
    private LocalDate dateOfBottling;
    private int year;

    public Wine(String title, String brand, String country, LocalDate dateOfBottling) {
        this.title = title;
        this.brand = brand;
        this.country = country;
        this.year = Period.between(dateOfBottling,LocalDate.now()).getYears();
    }

    public Wine(String title, String brand, String country) {
        this.title = title;
        this.brand = brand;
        this.country = country;
    }

    public Wine() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateOfBottling() {
        return dateOfBottling;
    }

    public void setDateOfBottling(LocalDate dateOfBottling) {
        this.dateOfBottling = dateOfBottling;
    }

    @Override
    public String toString() {
        return "\n" +
                "\nTitle: '" + title +
                "\nBrand: " + brand +
                "\nCountry: " + country +
                "\nYear: " + year ;
    }
}
