//remove duplicate elements
import java.util.HashMap;
  
public class Exercise27 {
    public static void removeDuplicate(int[] a, int n)
    {
  
        
        HashMap<Integer, Boolean> mp = new HashMap<>();
  
        for (int i = 0; i < n; ++i) {
            if (mp.get(a[i]) == null)
            {
                System.out.print(a[i] + " ");
                mp.put(a[i], true);
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 5, 1, 7, 2, 4, 2 };
        
        int n = a.length;
        removeDuplicate(a, n);
    }
}