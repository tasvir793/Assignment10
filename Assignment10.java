Que:1 Create a Dynamic Array Data structure?
Ans:1
package acadviewdemo;
import java.util.*;
import java.lang.reflect.Field;
public class DynamicArray extends ArrayList 
{
    ArrayList newlist;
    int size;
    DynamicArray (int Size)throws Exception
    {
        this.size=size;
        newlist=new ArrayList(Size);
        newlist.add("Tasvir");
        System.out.println(newlist);
        System.out.println(getCapacity(newlist));
        newlist.ensureCapacity(2*Size);
        System.out.println(getCapacity(newlist));
       
    }
    static int getCapacity(ArrayList a1)throws Exception
    {
        Field field=ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        int capacity=((Object[])field.get(a1)).length;
        return capacity;
    }    
}
class main
{
    public static void main(String args[])throws Exception
    {
        DynamicArray object=new DynamicArray(10);
    }
}
