import java.util.*;

import Stack.ListStack;

public class PostFixCalculator
{
   private String invoerString;
   int resultaat;
   //----------------------------------CONSTRUCTOR----------------------
   public PostFixCalculator (String invoer)
   {
     this.invoerString = invoer;
     evaluate();
   }
   //---------------------------------------------------------------------------
   //GETTER
   public int getResultaat()
   {
     return (resultaat);
   }
   //-------------------------------------------------------------   
   private void evaluate()
   {
     ListStack mystack = new ListStack();
     
     StringTokenizer st = new StringTokenizer(invoerString);
     
     while (st.hasMoreTokens())
     {
       String token = st.nextToken();
       char eerste = 					// het eerste karakter van elk token 
    		   
       if (( eerste >= '0') && (eerste <= '9'))
         ..............  // zie algoritme 
       else
       {
         int v1 = ....  			// poppen en omzetten van een String naar int
         int v2 = ......			// idem
         int result = 0;
         switch (eerste)
         {
           case '+' : result = v1 + v2; 
                      break;
           case '*' : result = .......;
                      break;
           case '-' : result = .......;
                      break;
         }
         ....... // wat doe je met het resultaat? zie algoritme
       }
     }
     resultaat = ......... 	// als alles goed is gegaan resultaat
   }                       	// poppen en omzetten naar een int
   
}
