/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudedes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Jerry
 */
public class LanceJeu {

    public static void main(String[] args) {
        // TODO code application logic here
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();

        System.out.print("Bienvenue a ce jeu de de, aujourd'hui nous sommes le ");
        System.out.println(dtf.format(now));

        JeuDeDes jdd = new JeuDeDes();
    }
}
