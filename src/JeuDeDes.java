/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudedes;

import java.util.Random;

/**
 *
 * @author Jerry
 */
public class JeuDeDes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    class Joueur{
        public Joueur(){
            
        }
        /**
         * 
         * @param newScore
         * @return 
         */
        public int ajoute(int newScore){
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
         * @param set string Nom
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
         * @param set score
         */
        public void setScore(int score) {
            this.score = score;
        }
    }
    
    class De{
        public De(){
            setNbFaces(6);
        }
        /**
         * 
         * @return 
         */
        public int getDe(){
            int res;
            Random r = new Random();
            res = r.ints(1,(6+1)).findFirst().getAsInt();
                        
            return res;
        }
        private int faces;

        /**
         * @return the faces
         */
        public int getNbFaces() {
            return faces;
        }

        /**
         * @param faces the faces to set
         */
        public final void setNbFaces(int faces) {
            this.faces = faces;
        }
        
    }
}


