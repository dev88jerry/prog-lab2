/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudedes;

import java.util.Calendar;
import java.util.Formatter;

/**
 *
 * @author Jerry
 */
public class LanceJeu {

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt.format("%tB", cal);

        System.out.print("Bienvenue a ce jeu de dé, aujourd'hui nous sommes le ");
        System.out.println(cal.get(Calendar.DATE) + " " + fmt + " " +cal.get(Calendar.YEAR));

        JeuDeDes jdd = new JeuDeDes();
    }
}