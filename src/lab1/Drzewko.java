package lab1;

public class Drzewko {
    public static void main(String[] args) {
        System.out.println("Drzewko:");
        Drzewko drzewko = new Drzewko();
        drzewko.wypisz(5);

        System.out.println();
        System.out.println("Odwrotne drzewko:");
        drzewko.wypiszOdwrotnie(5);
    }
    
    public void wypisz(int liczbaLinii) {
        for (int i = 1; i <= liczbaLinii; i++) {
            for (int j = (liczbaLinii - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void wypiszOdwrotnie(int liczbaLinii) {
        for (int i = liczbaLinii; i > 0; i--) {
            for (int j = (liczbaLinii - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}