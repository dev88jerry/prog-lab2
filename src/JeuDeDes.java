/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudedes;

import java.util.Scanner;

/**
 *
 * @author Jerry
 */
public class JeuDeDes {

    /**
     * Default contstructor for class JeuDeDes
     */
    JeuDeDes() {
        String str, str2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nom du Joueur 1: ");
        str = sc.next();
        Joueur j1 = new Joueur(str);

        System.out.print("Entrez le nom du Joueur 2: ");
        str2 = sc.next();
        Joueur j2 = new Joueur(str2);

        De d1 = new De();

        jouer(j1, j2, d1);
    }

    /**
     *
     * @param j1 - joueur 1
     * @param j2 - joueur 2
     * @param d1 - de
     */
    public final void jouer(Joueur j1, Joueur j2, De d1) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("");
            System.out.println("Tour " + i);
            int valeurLancer;
            d1.lancer();
            valeurLancer = d1.getDe();
            System.out.println(j1.getNom() + " a obtenu " + valeurLancer);
            j1.ajoute(valeurLancer);
            j1.afficher();

            if (j1.getScore() >= 21) {
                System.out.println(j1.getNom() + " a gagne!!!");
                break;
            }

            d1.lancer();
            valeurLancer = d1.getDe();
            System.out.println(j2.getNom() + " a obtenu " + valeurLancer);
            j2.ajoute(valeurLancer);
            j2.afficher();

            if (j2.getScore() >= 21) {
                System.out.println(j2.getNom() + " a gagne!!!");
                break;
            }
        }
    }
}
