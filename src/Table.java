
import java.util.Random;

public class Table 
{
    //dilosi metablitwn kai constractor
    static int col;
    static int newcol;
    public  Table(int col)
    {
        this.col=col;
    }
    //tixeo gemisma tou pinaka
    public static void  fillTableRandomly(char tab[])
    {
        for (int i=0; i<col; i++)
        {
            tab[i]=(char) (new Random().nextInt(25+1)+65);
        }
    }
    //ektiposi se grammh
    public static void printTableΗ(char tab[])
    {
         System.out.print("Horizontal print: ");
        for (int i=0; i<col; i++)
        {
            System.out.print(tab[i]+" ");
        }
    }
    //ektiposi se stili
    public static void printTableV(char tab[])
    {
        System.out.println("\nVertical print: ");
        for (int i=0; i<col; i++)
        {
            System.out.println(tab[i]+" ");
        }
    }
    //allagi tou periexomenou twn epilegmenwn keliwn
    public static void swapValues(char tab[], int a, int b)
    {
        char temp;
        temp=tab[a];
        tab[a]=tab[b];
        tab[b]=temp;
    }
    //entopismos tis prwtis emfanisis tou anazitoumenou grammatos
    public static int LocationChar(char tab[], char find)
    {
        int ok=0;
        for (int i=0; i<col; i++)
        {
            if(find == tab[i])
            {
                System.out.println(tab[i]);
                ok=i;
                break;
                
            }
        }
        return ok;
    }
    //dimiourgia enos pinaka klonou tou idi uparxontos
    public static char [] cloneTable (char tab[])
    {
        char cloneTab[]=new char[col];
        for (int i=0; i<col; i++)
        {
            cloneTab[i]=tab[i];
        }
        return cloneTab;
    }
    //sugxoneusi duo pinakwn se enan kainourio
    public static char [] mergeTables (char tab[], char tab2[] )
    {
        
        newcol = col*2;
        char mergedTable[]=new char[newcol];
        for (int i=0; i<newcol; i++)
        {
            if(i>=0 && i<10)
                mergedTable[i]=tab[i];
            else if(i>=10)
                mergedTable[i]=tab2[i-10];
        }
        return mergedTable;
    }
    //metatropi tou pinaka se ena string
    public static String ConvertToString (char tab[])
    {
        String str = new String(tab);
        return str;
    }
    //metatropi epilegmenou simeiou tou pinaka se ena string
    public static String ConvertToString (char tab[], int a, int b)
    {
        char prnt[]=new char[b-a+1];
        for (int i=0; i<col; i++)
        {
            if(i==a)
            {
                do
                {
                     prnt[i-a]=tab[i];
                     i++;
                }while(i<=b);
            }
        }
        String str2 = new String(prnt);
        return str2;
    }
    
}
