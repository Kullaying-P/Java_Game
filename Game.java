import java.io.*;
import java.util.*;
public class Game
{   
    public static void main(String arg[])
    {
        Novice novice = new Novice();
        Bag bag = new Bag();
        int hp;
        int data;
        System.out.println("MY HP : " + novice.gethp());
        System.out.println("MY EXP : " + novice.getexp());
        System.out.println("MY POWER : " + novice.getpower());
        Scanner sc = new Scanner(System.in);
        while(novice.gethp() != 0){
            System.out.println("Choose 1 for attack / Choose 2 for heal");
            data = sc.nextInt();
            if(data == 1) novice.attack();
            else if(data == 2) {hp = bag.usePotion(0); novice.increaseHP(hp);}
            System.out.println("MY HP : " + novice.gethp());
            System.out.println("MY EXP : " + novice.getexp());
            System.out.println("MY POWER : " + novice.getpower());
            System.out.println("--------------------");
        }
        System.out.println("---YOU DIE---");
    }
}