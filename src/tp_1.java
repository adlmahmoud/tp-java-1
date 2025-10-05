import java.util.Scanner;
public class tp_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = sc.nextLine();
        System.out.println("Bienvenue " + nom + " !");
        System.out.print("Rentrer un nombre réel A : ");
        float nbr1 = sc.nextFloat();
        System.out.print("Rentrer un nombre réel B : ");
        float nbr2 = sc.nextFloat();
        float max = 0;
        if (max < nbr2) {
            max = nbr2;
        } else if (max > nbr1) {
            max = nbr1;
        }
        System.out.println("Le maximum entre A et B est: " + max);
        System.out.print("Rentrer un entier :");
        int nbr = sc.nextInt();
        int ver = nbr % 2;
        if (ver == 0) {
            System.out.println("Le nombre " + nbr + " est pair.");
        } else {
            System.out.println("Le nombre " + nbr + " est impair.");
        }
        System.out.print("A bientôt,Merci:)");
    }
}
