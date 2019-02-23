import java.io.*;
import java.util.*;
public class Merchant extends Novice
{
    public Merchant(Novice lastNovice)
    {
        super.setJob("Merchant");
        super.setAll(lastNovice.gethp(), lastNovice.getpower(), lastNovice.bag);
    }

    public void attack()
    {
        super.setExp(5);
        super.setHp(-20);
        if(super.getexp() == 20)
        {
            super.setPower(1);
            super.setExp(-20);
        }
        super.bag.increasePotion();
    }
}