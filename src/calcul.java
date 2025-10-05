import java.util.Scanner;
public class calcul {
    static void main() {
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue dans la calculatrice de ADEL Mahmoud ");
        System.out.println("Choisissez une  opération : ");
        System.out.println("1- L'addition +");
        System.out.println("2- La soustraction -");
        System.out.println("3- La multiplication *");
        System.out.println("4- La division /");
        System.out.println("0- Quitter ");
        System.out.print("Entrez le choix de l'opération: ");
        int choix = sc.nextInt();
        if (choix<0 || choix > 4) {
            System.out.println("Choix Invalide :(");
            continue;
        }
        if (choix==0){
            System.out.println("tchao <3");
            break;
        }
            System.out.print("Entrez le premier nombre : ");
            float nbr1 = sc.nextFloat();
            System.out.print("Entrez le deuxième nombre : ");
            float nbr2 = sc.nextFloat();
            switch (choix) {
                case 1:
                    System.out.println("Resulat: " + (nbr1 + nbr2));
                    break;
                case 2:
                    System.out.println("Resulat: " + (nbr1 - nbr2));
                    break;
                case 3:
                    System.out.println("Resulat: " + (nbr1 * nbr2));
                    break;
                case 4:
                    System.out.println("Resulat: " + (nbr1 / nbr2));
                    break;
            }
        }while (true);
    }
}
