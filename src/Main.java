import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);


        System.out.println("Bir Yıl Giriniz:Ç ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year + ": Artık Bir Yıldır");
                } else {
                    System.out.println(year + ": Artık Bir Yıl Değildir !");
                }
            }else {
                System.out.println( year + ": Artık Bir Yıldır ");
            }

        } else {
            System.out.println("Artık Bir Değildir !");
        }

    }
}