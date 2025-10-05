import java.util.Scanner;

public class surface {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculer la surface d'un trapèze grâce a Adel Mahmoud");
        System.out.print("Rentrer A (en m) :");
        float A = sc.nextFloat();
        System.out.print("Rentrer A (en m) :");
        float B = sc.nextFloat();
        System.out.print("Rentrer A (en m) :");
        float C = sc.nextFloat();
        float surface = (A+B)*C*0.5f;
        System.out.println("La surface d'un trapèze est: "+ surface);
        System.out.println("Merci et bonne journée,tadmirhikh :)");
    }
}
