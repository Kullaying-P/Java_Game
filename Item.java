import java.io.*;
import java.util.*;
public class Item
{
    private String[] item = new String[2]; 
    public Item()
    {
        item[0] = "Potion";
    }
    
    public String getpotion(int i)
    {
        return item[i];
    }
}