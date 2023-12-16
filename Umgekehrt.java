
/**
 * Beschreiben Sie hier die Klasse Umgekehrt.
 * 
 * A. Pröpper
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Umgekehrt
{
    
    private Queue<Zahl> zahlenSchlange;
    private Stack<Zahl> zahlenStapel;

    /**
     * Konstruktor für Objekte der Klasse Umgekehrt
     */
    public Umgekehrt() 
    {
        zahlenSchlange = new Queue<Zahl>();
        zahlenStapel = new Stack<Zahl>();
    }

    public void erstelleZahl(int _wert)
    {
        zahlenSchlange.enqueue(new Zahl(_wert));
    }

    public void gebeZahlenUmgekehrtAus()
    {
        while(!zahlenSchlange.isEmpty())
        {
            zahlenStapel.push(zahlenSchlange.front());
            zahlenSchlange.dequeue();
        }
        while(!zahlenStapel.isEmpty())
        {
            System.out.println(zahlenStapel.top().gebeWert());
            zahlenStapel.pop();
        }
    }
    
    //Testbereich
    String text;
    public void erstelleText(String _text)
    {
        text=_text;
    }
    public void gebeStringfalschHerumAus()
    {
        for(int i=text.length();i>0;i--)
        {
            System.out.print(text.charAt(i-1));
        }
        System.out.println("");
    }
    public void gebeStringAus()
    {
        System.out.println(text);
    }
}

