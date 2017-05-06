import java.util.*;

public class Docket
{
   private ArrayList<String> docket;
   
   public Docket(String doc)
   {
      docket = new ArrayList<String>();
      while(doc.length() > 1)
      {
         int i = doc.indexOf(" ");
         docket.add(doc.substring(0, i));
         doc = doc.substring(i + 1);
      }
   }
   
   public String toString()
   {
      String str = "";
      for(int i = 0; i < docket.size(); i++)
         str += docket.get(i) + "\n";
      return str;
   }
}