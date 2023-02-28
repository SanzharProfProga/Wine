import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class WineAffairs implements NewWine {
    private String fullName;
    private TypeWine typeWine;
    private LocalDate yearOfOperation;
    private String address;
    private int years;
    private Wine[] wines;

    public WineAffairs(String fullName, TypeWine typeWine, LocalDate yearOfOperation, String address,Wine [] wines) {
        this.fullName = fullName;
        this.typeWine = typeWine;
        this.years = Period.between(yearOfOperation,LocalDate.now()).getYears();
        this.address = address;
        this.wines = wines;
    }

    public WineAffairs() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public TypeWine getTypeWine() {
        return typeWine;
    }

    public void setTypeWine(TypeWine typeWine) {
        this.typeWine = typeWine;
    }

    public LocalDate getYearOfOperation() {
        return yearOfOperation;
    }

    public void setYearOfOperation(LocalDate yearOfOperation) {
        this.yearOfOperation = yearOfOperation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void newWine() {
        System.out.println("Enter title");
        wines[5].setTitle(new Scanner(System.in).nextLine());
        System.out.println("Enter brand");
        wines[5].setBrand(new Scanner(System.in).nextLine());
        System.out.println("Enter country");
        wines[5].setCountry(new Scanner(System.in).nextLine());
        System.out.println("Enter date of bottling");
        System.out.println("Year");
        int year = new Scanner(System.in).nextInt();
        System.out.println("Month");
        int month = new Scanner(System.in).nextInt();
        System.out.println("Day");
        int day = new Scanner(System.in).nextInt();
        wines[5].setDateOfBottling(LocalDate.of(year,month,day));
    }
    public String wines1(){
        String str = "";
        for (Wine s:wines) {
            str += s.toString();
        }
        return str;
    }

    @Override
    public String toString() {
        return "\nFull name: " + fullName +
                "\nType wine: " + typeWine +
                "\nYear of experience" + years +
                "\nAddress: " + address +
                "\nWines: " + wines1() ;
    }
}
