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

    De() {
        faces = 6;
    }

    De(int nbF) {
        faces = nbF;
    }
    
    public void affiche(){
        
    }
    
    public void lance(){
        
    }
    
    /**
     *
     * @return dice result
     */
    public int getDe() {
        int res;
        Random r = new Random();
        res = r.ints(1, (faces + 1)).findFirst().getAsInt();

        return res;
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

    /**
     * @return the valeur
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * @param v
     */
    public void setValeur(int v) {
        this.valeur = v;
    }
}
