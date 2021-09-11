import java.util.ArrayList;

public  class Oblig1{
    public static int maks(int[] a) throws NoSuchFieldException{
        if(a.length == 0){
            NoSuchElementException();
            return 0;
            }
            int minste = a[0];
            for(int i=0; i<a.length-1 ; i++){
                if(minste > a[i+1]){
                    minste = a[i+1];
                }
                if(a[i] > a[i+1]){
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }
            System.out.println("Test sortert liste\n");
            for(int i=0; i<a.length; i++){
                System.out.print(i + " - ");
            }
            return minste;
        }


////////////////oppgave 5
    private static Exception NoSuchElementException() {
        return null;
    }

    public static void rotasjon(char[] a){
        if(a.length <=1)throw NoSuchElementException(){ // hvis listen er tom eller har bare en element saa gjor metoden ingenting
            return;
        }

        char[] b = a;
        for(int i=0; i<a.length; i++){
            if(i == 0){
                a[i] = b[a.length-1];
            }
            else{
                a[i] = b[i+1];
            }
        }
    }


    ///////////////////////////oppgave6

    public static void rotasjon(char[] a, int k){
        if(k>0) {
            for (int i = 0; i < k; i++) {
                rotasjon(a);
            }
        }else{
            /* forste mote for aa rotere mot venstre
            int r = k-length;
            for(int i=0; i<r; i++){
                rotasjon(a);*/

            // andre mote for aa rotere mot venstre
            char[]b =a;
            for(int i=a.length-1; i>=0 ; i++){
                if(i == a.length-1){
                    a[i]= b[0];
                }
                else{
                    a[i] = b[i+1];
                }
            }
        }
    }

    public static String flett (String s, String t){
        ArrayList<Character> char1= new ArrayList<>();
        ArrayList<Character> char2= new ArrayList<>();
        for(char ch1 : s.toCharArray()){
            char1.add(ch1);
        }
        for(char ch2 : t.toCharArray()){
            char2.add(ch2);
        }

        String tekst = "";

        int minimum = Math.min(char1.size(), char2.size());
        for(int i=0; i<minimum; i++){
            tekst +=char1.get(i)+char2.get(i);
        }

        if(char1.size() > minimum){
            for(int i=minimum; i<char1.size(); i++){
                tekst += char1.get(i);
            }
        }
        if(char2.size()>minimum){
            for(int i= minimum; i<char2.size(); i++){
                tekst += char2.get(i);
            }
        }
        return tekst;    
    }

    ///////////////////////////oppgave 8
    public static int[] indekssorteing(int[]a){
        if(a.length == 0){
            System.out.println("Listen er tom");
            return null;
        }

        int[] indeks = new int[a.length];
        int[] hjelpe = a;
        int minstIndeks = 0;
        int minst = a[0];
        int indekser = 0;
        while(hjelpe.length>0){    
            for(int i=0; i<hjelpe.length; i++){
                if(a[i]<minst){
                    minst = a[i];
                    minstIndeks = i;
                }
            }
            indeks[indekser] = minstIndeks;
            indekser++;
            int andreArray[]= new int[hjelpe.length-1];
            for(int i=0; i<hjelpe.length; i++){
                if(i==minstIndeks){
                }
                else if(i>minstIndeks){
                    andreArray[i-1] = hjelpe[i];
                }else{
                    andreArray[i] = hjelpe[i];
                }
            }
            hjelpe = andreArray;
        }

    return indeks;

    }
}