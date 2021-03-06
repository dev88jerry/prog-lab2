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
     * Default constructor for class JeuDeDes
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
            //System.out.println(j1.getNom() + " a obtenu " + valeurLancer);
            System.out.printf("%s a obtenu %d%n", j1.getNom(), valeurLancer);
            j1.ajoute(valeurLancer);
            j1.afficher();

            d1.lancer();
            valeurLancer = d1.getDe();
            //System.out.println(j2.getNom() + " a obtenu " + valeurLancer);
            System.out.printf("%s a obtenu %d%n", j2.getNom(), valeurLancer);
            j2.ajoute(valeurLancer);
            j2.afficher();

            if (j1.getScore() >= 21 && j1.getScore() > j2.getScore()) {
                afficher(j1, i);
                break;
            } else if (j2.getScore() >= 21 && j2.getScore() > j1.getScore()) {
                afficher(j2, i);
                break;
            }

            if (i == 10) {
                if (j1.getScore() > j2.getScore()) {
                    afficher(j1, i);
                } else {
                    afficher(j2, i);
                }
            }
        }
    }

    /**
     *
     * @param j - Joueur
     *
     * @param tour
     *
     */
    public void afficher(Joueur j, int tour) {

        if (tour != 10) {
            //System.out.println(j.getNom() + " a gagne au tour " + tour + " avec un total de " + j.getScore() + " points");
            System.out.printf("%s a gagne au tour %d avec un total de %d points%n", j.getNom(), tour, j.getScore());
        } else {
            //System.out.println(j.getNom() + " a gagne avec un total de " + j.getScore() + " points a la fin du jeu");
            System.out.printf("%s a gagne avec un total de %d points a fin du jeu", j.getNom(), j.getScore());
        }
    }
}
