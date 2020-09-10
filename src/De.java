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
public class De {
    /**
     * default contructor
     */
    De() {
        faces = 6;
    }
    /**
     * constructor with 1 param
     * @param nbF 
     */
    De(int nbF) {
        faces = nbF;
    }
    /**
     * display method
     */
    public void affiche() {
        System.out.println("La valeur du de est: " + valeur);
    }
    
    /**
     * throw dice method
     */
    public void lancer() {
        int res;
        Random r = new Random();
        res = r.ints(1, (faces + 1)).findFirst().getAsInt();

        valeur = res;
    }
    /**
     * 
     * @return value
     */
    public int getDe() {
        return valeur;
    }

    private int faces;
    private int valeur;

    /**
     * @return the faces
     */
    public int getNbFaces() {
        return faces;
    }

    /**
     * @param f
     */
    public void setNbFaces(int f) {
        this.faces = f;
    }
}
