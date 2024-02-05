
public class Wartezimmer
{
    // Bezugsobjekte

    // Attribute    
   public Patient patient; 
   String patienten[] = new String[10];
   int n = 0;
   String ausgabe = "";
   String rewrite = "";
    // Konstruktor
   public Wartezimmer()
   {
        
   }
   public void Eintrag(String pVorname, String pName, String pKK)
   {
       patient = new Patient(pVorname, pName, pKK);
       if (n < patienten.length) 
            {
                patienten[n] = pName +"\t"+ pVorname +"\t"+ pKK;
                n++;
            }
      
   }
   public void Austragen()
   {
       if( n >= 0)
       {
           for (int i=0;i < patienten.length - 1; i++)
           {
                patienten[i] = patienten[i+1];
           }
           n = n-1;
        }
        
   }
   public String Rewrite() 
   {
        rewrite = "";
        for (int i=0;i<n;i++)
        {
            rewrite = rewrite + patienten[i] + "\n";
        }
        ausgabe = rewrite;
        return rewrite;
   }
   public String Ausgabe()
   {   
        ausgabe = ausgabe + patienten[n-1] + "\n";
        return ausgabe;
   }
   public int Counter()
   {
        return n; 
   }
}
