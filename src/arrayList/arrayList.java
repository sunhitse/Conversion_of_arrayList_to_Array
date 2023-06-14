package arrayList;

import java.util.*;

class arrayList {
    public static void main(String[] args)
    {
        List<String> al = new ArrayList<String>();
        al.add("My");
        al.add("Name");
        al.add("is");
        al.add("Sunil");
  
        // convert arrayList to array
        String[] arr = new String[al.size()];
        arr = al.toArray(arr);
  
        for (String x : arr)
            System.out.print(x + " ");
            
        
       // convert array to arrayList
            List ab = Arrays.asList(al);
            
        System.out.println(ab);
    }
}