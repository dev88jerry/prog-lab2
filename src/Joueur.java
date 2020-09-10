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

    Joueur(String j1) {
        nom = j1;
        score = 0;
    }

    public void afficher() {
        System.out.println(nom);
        System.out.println(score);
    }

    /**
     *
     * @param newScore
     * @return
     */
    public int ajoute(int newScore) {
        return newScore + getScore();
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

