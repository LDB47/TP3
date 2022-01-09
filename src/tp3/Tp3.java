/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author laure
 */
public class Tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int i;
//        System.out.println("Saisissez un nombre");
//        i = Clavier.lireInt();
//        System.out.println(i != 1 ? "Vous avez saisi : " + i : "bravo");
//**************************************************************//
        System.out.println("Veuillez saisir la note: ");
        int note = Clavier.lireInt();
        if (note >= 10) {
            System.out.println("Vous êtes admis(e)");
            if (note >= 12 && note < 14) {
                System.out.println("Votre mention est assez bien");
            } else if (note >= 14 && note < 16) {
                System.out.println("Votre mention est bien");
            } else if (note >= 16) {
                System.out.println("Votre mention est très bien");
            }
        } else {
            if (note >= 8 && note < 10) {
            System.out.println("Vous êtes sur liste d'attente");
        } else {
            System.out.println("Vous êtes refusé(e)");
        }
        }
//**************************************************************//
//        System.out.println("Veuillez saisir 2 nombres:");
//        int i1 = Clavier.lireInt();
//        int i2 = Clavier.lireInt();
//        int max1 = Math.max(i1, i2);
//        System.out.println("Veleur plus grande: " + max1);
//        System.out.println("Veuillez saisir 2 autres nombres:");
//        int i3 = Clavier.lireInt();
//        int i4 = Clavier.lireInt();
//        int max2 = Math.max(i3, i4);
//        int maxFinal = Math.max(max1, max2);
//        System.out.println(maxFinal);
//**************************************************************//
//        Date dateTest = new Date();
//        Date.aujourdhui(dateTest);
//        Date.maintenant(dateTest);
//        Date.saisirDate();
    }

}
