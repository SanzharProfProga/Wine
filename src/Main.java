import javax.swing.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   /*   Ооп принциптерин колдонуп, Вино классын Сүрөттөңүз
        Класс кандай поля жана методдорду талап кылат:
     1. Вино түрү жөнүндө маалыматты сактоо: аталышы, бренди, өлкөсү, төгүлгөн датасы
        (класс убакыт классын тузуу) виного канча жыл болгонун  эсептөө
        Жана Винодел классын тузунуз, ал жөнүндө маалымат- ал кандай вино  кылат, эмгек стажы, жумуш дареги
     2. Консолдон жаңы вино кошуу методун тузунуз (интерфейс)
     3. Сиздин класстын натыйжалуулугун көрсөткөн жардамчы классты өзүнчө иштеп чыгыңыз.Main class
        Анда керектүү объектилерди түзүп, виноделге вино массивин дайындаңыз,
        массив ага ошол винолордун таандык экендигин билдирет
        Кошуу методун колдонуп жаны вино кошуп, вино тизмесине (массивине)кошуңуз*/

        Wine wine = new Wine("Ala Too", "Red", "Kyrgystan", LocalDate.of(2000, 6, 9));
        Wine wine1 = new Wine("Alto Adidje", "Red", "Italy", LocalDate.of(1980, 7, 1));
        Wine wine2 = new Wine("Altos-Corton", "Red", "France", LocalDate.of(1990, 1, 30));
        Wine wine3 = new Wine("Aleny", "Red", "Abhazya", LocalDate.of(2004, 9, 10));
        Wine wine4 = new Wine("Areni", "Red", "Armenya", LocalDate.of(2001, 11, 7));
        Wine wine5 = new Wine("","","");
        Wine[] wines = new Wine[6];
        wines[0] = wine;
        wines[1] = wine1;
        wines[2] = wine2;
        wines[3] = wine3;
        wines[4] = wine4;
        wines[5] = wine5;



        WineAffairs wineAffairs = new WineAffairs("Stan", TypeWine.RED, LocalDate.of(1986, 8, 9), "Italy", wines);

        while (true) {
            System.out.println("""
                    1: Information about the manufacturer
                    2: Add new wine
                    """);
            int selectMode = new Scanner(System.in).nextInt();
            switch (selectMode) {
                case 1 -> System.out.println(wineAffairs.toString());
                case 2 -> {
                    wineAffairs.newWine();
                    System.out.println(wineAffairs.toString());

                }
            }

        }


    }
}