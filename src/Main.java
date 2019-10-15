/*Nikos Potaris
  icsd15173*/
public class Main 
{

    public static void main(String[] args) 
    {
        //dilwsi metablitwn
       int col=10;
       char tab[]=new char[col];
       char tab2[]=new char[col];
       //dimiourgia antikeimenou
       Table table =new Table(col);
       //perasma tixewn timwn ston pinaka pou dinoume
       table.fillTableRandomly(tab);
       //emfanisi tou pinaka se mia grammi
       table.printTableΗ(tab);
       //emfanisi tou pinaka se mia stili
       table.printTableV(tab);
       //emfanisi tis prwtis thesis tou anazitoumenou grammatos ston pinaka
       System.out.println("\nThe first location is: "+table.LocationChar(tab, 'K'));
       //enalagi twn timwn stis theseis pou dinoume
       table.swapValues(tab, 0, 9);
       System.out.print("\nAfter swaping: ");
       table.printTableV(tab);
       System.out.println("\nThe first location is: "+table.LocationChar(tab, 'K'));
        //dimiourgia antigrafou pinaka me ton arxiko mas pinaka kai emfanisi autou
        char clTab[] = table.cloneTable(tab);
        System.out.print("\nCloned table: ");
        for (int i=0; i<col; i++)
        {
            System.out.print(clTab[i]+" ");
        }
        //gemisma tou deuterou pinaka me tixeo tropo me skopo na kanoume tin sugxoneusi 
        //twn duo pinakwn se ena kainourio kai emfanisi autou
        table.fillTableRandomly(tab2);
        int newcol=col*2;
        char mgTab[] = table.mergeTables(tab, tab2);
        System.out.print("\nMerged table: ");
        for (int i=0; i<newcol; i++)
        {
            System.out.print(mgTab[i]+" ");
        }
        //emfanisi tou pinaka se string
        System.out.println("\nTable to String: "+ table.ConvertToString(tab));
        //emfanisi epilegmenou tmimatos tou pinaka se string
        System.out.println("Table to String from a to b: "+ table.ConvertToString(tab,3,6));
        
    }
    
}
