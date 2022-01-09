package tp3;

import java.text.SimpleDateFormat;

/**
 *
 * @author laure
 */
public class Date {

    public static void aujourdhui(Date date) {
        SimpleDateFormat dateFormate = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormate.format(date));

    }

    public static void maintenant(Date date) {
        SimpleDateFormat dateFormate = new SimpleDateFormat("HH:MM:ss");
        System.out.println(dateFormate.format(date));
    }
    
    public static void saisirDate() {
        System.out.println("Saisissez un jour");
        int jour = Clavier.lireInt();
        System.out.println("Saisissez un jour");
        int mois = Clavier.lireInt();
        System.out.println("Saisissez un jour");
        int annee = Clavier.lireInt();
        System.out.println(jour + "/" + mois + "/" + annee);
    }
}
