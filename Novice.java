import java.io.*;
import java.util.Scanner;
public class Novice
{
    private int hp;
    private int exp;
    private int power;
    private int maxHp;
    private String job;
    Bag bag;

    public Novice()
    {
        hp = 500;
        exp = 0;
        power = 1;
        maxHp = 1000;
        job = "Novice";
        bag = new Bag();
    }
    public void attack()
    {
        exp = exp + 1;
        this.hp -= 10;
        if(exp == 10)
        {
            power = power + 1;
            exp = 0;
        }
    }

    public void increaseHP(int plusHP){
        
        if(hp + plusHP < maxHp)
        {
            this.hp += plusHP;
        }
        else if(hp + plusHP >= maxHp){
            this.hp += (maxHp - hp);
        }
        gethp();
    }

    public int gethp()
    {
        return hp;
    }

    public int getexp()
    {
        return exp;
    }

    public int getpower()
    {
        return power;
    }

    public String getjob()
    {
        return job;
    }

    public void setHp(int set)
    {
        hp += set;
    }

    public void setExp(int set)
    {
        exp += set;
    }

    public void setPower(int set)
    {
        power += set;
    }

    public void setJob(String set)
    {
        job = set;
    }

    public void setAll(int lastHp, int lastPower,Bag lastBag)
    {
        hp = lastHp;
        power = lastPower;
        bag = lastBag;
    }
}