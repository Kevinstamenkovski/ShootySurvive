package singleplayer;
import java.applet.*;
import java.awt.*;
import java.util.*;

public class SINGLEPLAYER { 
    private static Random random = new Random(); 

    public class Main extends Applet{
        public void paint(Graphics g){
           g.drawString("Welcome in Java Applet.",40,20);
        }
     }    public static void main(String[] args) {
        //this game Works randomly, no one now who is gonna win.
        int Health, regenTime, hit, Ammo, headShot, headshotCounter, hitCounter;
        boolean bodyHit;

        hitCounter = 0;
        headshotCounter = 0;
        regenTime = 0;
        Health = 100;
        Ammo = 16;

        while (Health != 0 && Ammo != 0) {

            hit = random.nextInt(2) + 1;
            headShot = random.nextInt(5) + 1;

            if (headShot == 5) {
                Health = Health - 6;
                Ammo = Ammo - 1;
                System.out.println("HEADSHOT");
                headshotCounter = headshotCounter + 1;
            }

            if (hit == 2) {
                bodyHit = true;
            }else{
                bodyHit = false;
            }

            if (bodyHit == true) {
                Health = Health - 12;
                regenTime = 0;
                hitCounter = hitCounter + 1;
            } else {
                regenTime = regenTime + 1; 
            }

            if (regenTime == 3) {
                Health = Health + 2;
                regenTime = 0;
            }
            if (Health > 100) {
                Health = 100;
            }
            if (Health < 0) {
                Health = 0;
            }
            Ammo = Ammo - 1;
            if (Ammo < 0) {
                Ammo = 0;
            }    
            System.out.println(Health);
        }
        System.out.println("you Are bleeding ...");
        Health = Health - 1;
        System.out.println(Health);
        Health = Health - 1;
        System.out.println(Health);
        Health = Health - 1;
        System.out.println(Health);
        Health = Health - 1;
        System.out.println(Health);
        Health = Health - 1;
        System.out.println(Health);
        Health = Health - 1;
        System.out.println(Health);
        Health = Health - 1;
        System.out.println(Health);
        Health = Health - 1;
        System.out.println(Health);
        Health = Health - 1;
        System.out.println(Health);
        Health = Health - 1;
        System.out.println(Health);
        if (Health < 0) {
            Health = 0;
        }
        if (Health == 0) {
            System.out.println("You Lose");
            System.out.println("You Have Been hitted " + hitCounter + " Times");
            System.out.println(headshotCounter + " HEADSHOTS");
        } else {
            System.out.println("Congrats, You Survived");
            System.out.println("You Have Been hitted " + hitCounter + " Times");
            System.out.println(headshotCounter + " HEADSHOTS");
            System.out.println("And You Bleed For Ten Seconds");
        }
    }
}