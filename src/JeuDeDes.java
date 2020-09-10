/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudedes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        
        String str, str2;
        
        System.out.print("Bienvenue a ce jeu de de, aujourd'hui nous sommes le ");
        System.out.println(dtf.format(now));
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nom du Joueur 1: ");
        str = sc.next();
        Joueur j1 = new Joueur(str);
        
        System.out.print("Entrez le nom du Joueur 2: ");
        str2 = sc.next();
        Joueur j2 = new Joueur(str2);
        
        j1.afficher();
        j2.afficher();
        
    }
}
