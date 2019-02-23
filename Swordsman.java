import java.io.*;
import java.util.*;
public class Swordsman extends Novice
{
    public Swordsman(Novice lastNovice)
    {
        super.setJob("Swordsman");
        super.setAll(lastNovice.gethp(), lastNovice.getpower(), lastNovice.bag);
    }

    public void attack()
    {
        super.setExp(5);
        super.setHp(-50 + damageReduce());
        if(super.getexp() == 20)
        {
            super.setPower(1);
            super.setExp(-20);
        }
    }
    public int damageReduce()
    {
        return super.getpower();
    }
}