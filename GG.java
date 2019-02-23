import java.io.*;
import java.util.*;
public class GG
{   
    public static void main(String arg[])
    {
        Novice novice = new Novice();
        int hp;
        int data=0;
        char job;
        System.out.println("MY HP : " + novice.gethp());
        System.out.println("MY EXP : " + novice.getexp());
        System.out.println("MY POWER : " + novice.getpower());
        System.out.println("MY JOB : " + novice.getjob());
        Scanner sc = new Scanner(System.in);
        while(novice.gethp() > 0){
            System.out.println("Choose 1 for attack / Choose 2 for heal - Potion have " + novice.bag.showcount()); 
            data = sc.nextInt();
            if(data == 1) novice.attack();
            else if(data == 2) {hp = novice.bag.usePotion(0); novice.increaseHP(hp);}
            if(novice.getpower() == 2 && novice.getjob().equals("Novice")){
                System.out.println("Please choose your job\npress 'S' or 's' for Swordsman");
                System.out.println("press 'M' or 'm' for Merchant");
                job = sc.next().charAt(0);
                if(job == 'S' || job == 's')
                {
                    novice = new Swordsman(novice);
                }
                else if(job == 'M' || job == 'm')
                {
                    novice = new Merchant(novice);
                }
            }
            System.out.println("MY HP : " + novice.gethp());
            System.out.println("MY EXP : " + novice.getexp());
            System.out.println("MY POWER : " + novice.getpower());
            System.out.println("MY JOB : " + novice.getjob());
            System.out.println("--------------------");
           
        }
        System.out.println("!!!!!! DIED !!!!!!");
    }
}