import java.util.*;

class Test_program{

    public static int[] randPerm(int n){
        int[] a = new int[n];

        for (int i = 0; i<n ; i++) a[i] = i+1;

        Random r = new Random();

        for(int k = n-1 ; k>0 ; k--) {
            int i = r.nextInt(k + 1);
            bytt(a,k,i);
        }
        return a;
    }

    public static void snu(int[] a, int v, int h){
        while(v < h){
              bytt(a,v++,h--);
        }
    }



    public static void snu(int[]a,int v){
        snu(a,v,a.length-1);
    }
    public static void snu(int[] a){
        snu(a,0,a.length-1);
    }

    public static boolean nestePermutasjon(int[] a){
        int i = a.length -2;
        //int[] verdier = {3,1,4,9,7,10,8,6,5,2};
        while(i>= 0 && a[i] > a[i+1]){
            i--;
        }
        if(i < 0){
            return false;
        }
        else{

            int j = a.length -1;
            while(j >= 0 && a[j] < a[i]){
                j--;

            }
            bytt(a,i,j);
            snu(a,i+1);
            return true;
        }

    }

    public static void bytt(int[] a, int i,int k){ // hejelpe metode for maks metode
         int change = a[i];
         a[i] = a[k];
         a[k] = change;
    }

    ///// Oppgave 5 //////////////////////////////////////

  public static int oppgave5()
  {
    int antallFeil = 0;

    char[] a = {};

    try
    {
      Oblig1.rotasjon(a);  // kaller metoden
    }
    catch (Exception e)
    {
      System.out.println
        ("Oppgave 5: a) Skal ikke kaste unntak for en tom tabell!!");
        antallFeil++;
    }

    char[] b = {'A'};
    char[] b0 = {'A'};
    Oblig1.rotasjon(b);
    if (!Arrays.equals(b, b0))
    {
      System.out.println("Oppgave 5: b) Feil hvis tabellen har ett element!");
      antallFeil++;
    }

    char[] c = {'A','B'};
    char[] c0 = {'B','A'};
    Oblig1.rotasjon(c);
    if (!Arrays.equals(c, c0))
    {
      System.out.println("Oppgave 5: c) Feil hvis tabellen har to elementer!");
      antallFeil++;
    }

    char[] d = {'A','B','C','D','E','F','G','H','I','J'};
    char[] d0 = {'J','A','B','C','D','E','F','G','H','I'};

    Oblig1.rotasjon(d);
    if (!Arrays.equals(d, d0))
    {
      System.out.println("Oppgave 5: d) Feil hvis tabellen har flere elementer!");
      antallFeil++;
    }

    return antallFeil;
  }

  ///// Oppgave 6 //////////////////////////////////////

  public static int oppgave6()
  {
    int antallFeil = 0;

    char[] a = {};

    try
    {
      Oblig1.rotasjon(a,1);  // kaller metoden
    }
    catch (Exception e)
    {
      System.out.println(e);
      System.out.println
        ("Oppgave 6: a) Skal ikke kaste unntak for en tom tabell!!");
        antallFeil++;
    }

    char[] b = {'A'};
    char[] b0 = {'A'};
    Oblig1.rotasjon(b,0);
    if (!Arrays.equals(b, b0))
    {
      System.out.println("Oppgave 6: b) Feil hvis tabellen har ett element!");
      antallFeil++;
    }

    Oblig1.rotasjon(b,1);
    if (!Arrays.equals(b, b0))
    {
      System.out.println("Oppgave 6: c) Feil hvis tabellen har ett element!");
      antallFeil++;
    }

    Oblig1.rotasjon(b,-1);
    if (!Arrays.equals(b, b0))
    {
      System.out.println("Oppgave 6: d) Feil hvis tabellen har ett element!");
      antallFeil++;
    }

    char[] c = {'A','B'};
    char[] c0 = {'B','A'};
    Oblig1.rotasjon(c,1);

    if (!Arrays.equals(c, c0))
    {
      System.out.println("Oppgave 6: e) Feil hvis tabellen har to elementer!");
      antallFeil++;
    }

    c = new char[] {'A','B'};

    Oblig1.rotasjon(c,-1);
    if (!Arrays.equals(c, c0))
    {
      System.out.println("Oppgave 6: f) Feil hvis tabellen har to elementer!");
      antallFeil++;
    }

    char[] d = {'A','B','C','D','E','F','G','H','I','J'};
    char[] d0 = {'G','H','I','J','A','B','C','D','E','F'};

    Oblig1.rotasjon(d,4);
    if (!Arrays.equals(d, d0))
    {
      System.out.println("Oppgave 6: g) Feil hvis tabellen har flere elementer!");
      antallFeil++;
    }

    d = new char[]{'A','B','C','D','E','F','G','H','I','J'};
    System.out.println("------------------------\n\n\n");
    Oblig1.rotasjon(d,-6);
    if (!Arrays.equals(d, d0))
    {
      System.out.println("Oppgave 6: h) Feil hvis tabellen har flere elementer!");
      antallFeil++;
    }

    char[] x = new char[100_000];
    long tid = System.currentTimeMillis();
    Oblig1.rotasjon(x,99_999);
    tid = System.currentTimeMillis() - tid;

    if (tid > 20)
    {
      System.out.println("Oppgave 6: i) Metoden "
        + "er for ineffektiv. Må forbedres!");
      antallFeil++;
    }

    tid = System.currentTimeMillis();
    Oblig1.rotasjon(x,199_999);
    tid = System.currentTimeMillis() - tid;

    if (tid > 20)
    {
      System.out.println("Oppgave 6: j) Metoden "
        + "er for ineffektiv. Må forbedres!");
      antallFeil++;
    }

    tid = System.currentTimeMillis();
    Oblig1.rotasjon(x,50_000);
    tid = System.currentTimeMillis() - tid;

    if (tid > 20)
    {
      System.out.println("Oppgave 6: k) Metoden "
        + "er for ineffektiv. Må forbedres!");
      antallFeil++;
    }

    tid = System.currentTimeMillis();
    Oblig1.rotasjon(x,-40_000);
    tid = System.currentTimeMillis() - tid;

    if (tid > 20)
    {
      System.out.println("Oppgave 6: l) Metoden "
        + "er for ineffektiv. Må forbedres!");
      antallFeil++;
    }

    return antallFeil;
  }

  ///// Oppgave 7 //////////////////////////////////////

  public static int oppgave7()
  {
    int antallFeil = 0;
    String s = null;

    try
    {
      s = Oblig1.flett("","");  // kaller metoden
    }
    catch (Exception e)
    {
      System.out.println(e);
      System.out.println
        ("Oppgave 7a: a) Skal ikke kaste unntak for to tomme tegnstrenger!!");
        antallFeil++;
    }

    if (s.compareTo("") != 0)
    {
      System.out.println
        ("Oppgave 7a: b) Svaret skal bli lik en tom streng!");
        antallFeil++;
    }

    try
    {
      s = Oblig1.flett("","AB");  // kaller metoden
    }
    catch (Exception e)
    {
      System.out.println(e);
      System.out.println
        ("Oppgave 7a: c) Skal ikke kaste unntak for en tom tegnstreng!!");
        antallFeil++;
    }

    if (s.compareTo("AB") != 0)
    {
      System.out.println
        ("Oppgave 7a: d) Svaret skal bli lik AB");
        antallFeil++;
    }

    try
    {
      s = Oblig1.flett("AB","");  // kaller metoden
    }
    catch (Exception e)
    {
      System.out.println(e);
      System.out.println
        ("Oppgave 7a: e) Skal ikke kaste unntak for en tom tegnstreng!!");
        antallFeil++;
    }

    if (s.compareTo("AB") != 0)
    {
      System.out.println
        ("Oppgave 7a: f) Svaret skal bli lik AB");
        antallFeil++;
    }

    s = Oblig1.flett("A", "BCDEF");

    if (s.compareTo("ABCDEF") != 0)
    {
      System.out.println
        ("Oppgave 7a: g) Svaret skal bli lik ABCDEF");
        antallFeil++;
    }

    s = Oblig1.flett("ABCDE", "F");

    if (s.compareTo("AFBCDE") != 0)
    {
      System.out.println
        ("Oppgave 7a: h) Svaret skal bli lik AFBCDE");
        antallFeil++;
    }

    s = Oblig1.flett("ACEGIK", "BDFHJLMN");

    if (s.compareTo("ABCDEFGHIJKLMN") != 0)
    {
      System.out.println
        ("Oppgave 7a: i) Svaret skal bli lik ABCDEFGHIJKLMN");
        antallFeil++;
    }

    String[] a = {};

    try
    {
      s = Oblig1.flett(a);  // kaller metoden
    }
    catch (Exception e)
    {
      System.out.println(e);
      System.out.println
        ("Oppgave 7b: a) Skal ikke kaste unntak for en tom tabell!");
        antallFeil++;
    }

    if (s.compareTo("") != 0)
    {
      System.out.println
        ("Oppgave 7b: b) Svaret skal bli lik en tom streng!");
        antallFeil++;
    }

    try
    {
      s = Oblig1.flett("","ABC","");  // kaller metoden
    }
    catch (Exception e)
    {
      System.out.println(e);
      System.out.println
        ("Oppgave 7b: c) Skal ikke kaste unntak for en tom streng!");
        antallFeil++;
    }

    if (s.compareTo("ABC") != 0)
    {
      System.out.println
        ("Oppgave 7b: d) Svaret skal bli lik ABC");
        antallFeil++;
    }

    s = Oblig1.flett("AM ","L","GEDS","ORATKRR","","R TRTE","IO","TGAUU");

    if (s.compareTo("ALGORITMER OG DATASTRUKTURER") != 0)
    {
      System.out.println
        ("Oppgave 7b: e) Svaret skal bli ALGORITMER OG DATASTRUKTURER!");
        antallFeil++;
    }

    s = Oblig1.flett("AFK","BGLP","CHMQT","DINRUW","EJOSVXY");

    if (s.compareTo("ABCDEFGHIJKLMNOPQRSTUVWXY") != 0)
    {
      System.out.println
        ("Oppgave 7b: f) Svaret skal bli ABCDEFGHIJKLMNOPQRSTUVWXY!");
        antallFeil++;
    }

    return antallFeil;
  }

  ///// Oppgave 8 //////////////////////////////////////

  public static int oppgave8()
  {
    int antallFeil = 0;

    int[] a = {};  // en tom tabell
    int[] indeks = null;

    try
    {
      indeks = Oblig1.indekssortering(a);  // kaller metoden
    }
    catch (Exception e)
    {
      System.out.println
        ("Opgave 8: a) Skal ikke kastes unntak for en tom tabell!");
      antallFeil++;
    }

    if (indeks == null || indeks.length > 0)
    {
      System.out.println
        ("Opgave 8: b) Indekstabellen skal ha lengde 0!");
      antallFeil++;
    }

    a = new int[] {5};

    try
    {
      indeks = Oblig1.indekssortering(a);  // kaller metoden
    }
    catch (Exception e)
    {
      System.out.println
        ("Opgave 8: c) Skal ikke kastes unntak her!");
      antallFeil++;
    }

    if (indeks == null || indeks.length == 0 || indeks.length > 1)
    {
      System.out.println
        ("Opgave 8: d) Indekstabellen skal ha lengde 1!");
      antallFeil++;
    }

    if (indeks[0] != 0)
    {
      System.out.println
        ("Opgave 8: e) indeks[0] skal være lik 0!");
      antallFeil++;
    }

    a = new int[] {1,2,3,4,5,6};
    int[] b = new int[] {1,2,3,4,5,6};
    boolean flere = true;

    do
    {
      int[] c = a.clone();
      indeks = Oblig1.indekssortering(c);

      if (!Arrays.equals(a,c))
      {
        System.out.println
          ("Oppgave 8: f) Tabellen før kallet:   " + Arrays.toString(a));
        System.out.println
          ("              Tabellen etter kallet: " + Arrays.toString(c));
        System.out.println
          ("              Parametertabellen skal ikke endres!");

        antallFeil++;
        break;
      }

      int[] d = new int[a.length];
      for (int i = 0; i < d.length; i++) d[i] = a[indeks[i]];

      if (!Arrays.equals(b,d))
      {
        System.out.println
          ("Oppgave 8: g) Feil i indekstabellen for a = " + Arrays.toString(a));

        antallFeil++;
        break;
      }

    } while (nestePermutasjon(a));

    a = new int[] {5,2,8,3,5,10,7,5,2,10,6};
    int[] c = a.clone();
    b = new int[] {2,2,3,5,5,5,6,7,8,10,10};
    indeks = Oblig1.indekssortering(a);
    int[] d = new int[a.length];
    for (int i = 0; i < d.length; i++) d[i] = a[indeks[i]];

    if (!Arrays.equals(a,c))
    {
      System.out.println
        ("Oppgave 8: h) Parametertabellen endres når den er lik");
      System.out.println
        ("            " + Arrays.toString(a));

      antallFeil++;
    }

    if (!Arrays.equals(b,d))
    {
      System.out.println
        ("Oppgave 8: i) Feil i indekstabellen for a = " + Arrays.toString(a));

      antallFeil++;
    }

    return antallFeil;
  }

  public static void main(String args[]){
      int antallFeil = 0;

     // antallFeil += oppgave1();
      //antallFeil += oppgave2();
      //antallFeil += oppgave3();
      //antallFeil += oppgave4();
      antallFeil += oppgave5();
      antallFeil += oppgave6();
      antallFeil += oppgave7();
      antallFeil += oppgave8();
      //antallFeil += oppgave9();
      //antallFeil += oppgave10();

      if (antallFeil == 0)
      {
        System.out.println("Gratulerer!! Du passerte testen!");
      }
      else
      {
        System.out.println("Må forbedres! Du har minst "
          + antallFeil + " feil eller svakheter!");

      }
  }

}
