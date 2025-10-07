import java.util.Scanner;
import java.math.MathContext;
public class surface_de_formes_géométriques {
    public static void main() {
        Scanner sc = new Scanner(System.in);
    System.out.println("Choisissez votre forme geometriques: ");
    System.out.println("1.Carre.");
    System.out.println("2.Rectangle.");
    System.out.println("3.Triangle rectangle.");
    System.out.println("4.Cercle.");
    System.out.println("5. 1/4 cercle");
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                System.out.print("Donnez C en (m): ");
                float C = sc.nextFloat();
                float surface = (C*C);
                System.out.println("surface S est : "+surface);
                break;
            case 2:
                System.out.print("Donnez L en (m): ");
                float L = sc.nextFloat();
                System.out.print("Donnez l en (m): ");
                float l = sc.nextFloat();
                float surface2=(L*l);
                System.out.println("surface S est : "+surface2);
                break;
            case 3:
                System.out.print("Donnez A en (m): ");
                float A = sc.nextFloat();
                System.out.print("Donnez B en (m): ");
                float B = sc.nextFloat();
                float surface3=(A*B)/2f;
                break;
            case 4:
                System.out.print("Donnez R en (m): ");
                float R = sc.nextFloat();
                double surface4 = Math.PI*(R*R);
                System.out.println("surface S est : "+surface4);
                break;
            case 5:
                System.out.print("Donnez r en (m): ");
                float r = sc.nextFloat();
                double surface5=(Math.PI*(r*r))/4;
                System.out.println("surface S est : "+surface5);
                break;
        }
    }
}
