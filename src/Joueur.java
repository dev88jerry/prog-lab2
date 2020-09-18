/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudedes;

/**
 *
 * @author Jerry
 */
public class Joueur {

    /**
     * Consturctor with 1 param
     *
     * @param j1
     */
    Joueur(String j1) {
        nom = j1;
        score = 0;
    }

    /**
     * Display method
     */
    public void afficher() {
        //System.out.println(nom + " a maintenant " + score + " points");
        System.out.printf("%s a maintenant %d points%n", nom, score);
    }

    /**
     *
     * @param newScore
     */
    public void ajoute(int newScore) {
        score += newScore;
    }

    private String nom;
    private int score;

    /**
     * @return String nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }
}
