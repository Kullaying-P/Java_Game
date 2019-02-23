import java.io.*;
import java.util.*;
public class Bag
{
   private int count = 20;
   private Item item = new Item();
   public int usePotion(int index)
   {
       
       if(count!=0 && item.getpotion(index).equals("Potion"))
        {
            count--;
            return 50;
        }
        return 0;
   }

   public void increasePotion()
   {
       count++;
   }

   public int showcount()
   {
       return count;
   }
}