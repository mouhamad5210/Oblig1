import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public  class Oblig1{


////////////////oppgave 5
    private static Exception NoSuchElementException() {
        return null;
    }

    public static void rotasjon(char[] a) throws NoSuchElementException{
        if(a.length ==0){ // hvis listen er tom eller har bare en element saa gjor metoden ingenting
            return;
        }

        char[] b = new char[a.length];
        for(int i=0; i<a.length; i++){
            b[i] = a[i];
        }
        for(int i=0; i<a.length; i++){
            if(i == 0){
                a[i] = b[a.length-1];
            }
            else{
                a[i] = b[i-1];
            }
        }

    }


    ///////////////////////////oppgave6

    public static void rotasjon(char[] a, int k)throws NoSuchElementException{
        if(a.length ==0){ // hvis listen er tom eller har bare en element saa gjor metoden ingenting
            return;
        }

        if(k>a.length){
            k=k%a.length;
        }
        if(k*-1> a.length){
            k=k%a.length;
        }
        char[] b = new char[a.length];
        for(int i=0; i<a.length; i++){
            b[i] = a[i];
        }
            if(k>0) {
                for(int i=0; i<a.length; i++){
                    if(i >= k){
                        a[i] = b[i-k];
                    }
                    else{
                        a[i] = b[a.length-k+i];
                    }
                }
            }else if(k==0 ){
            }else{
                int teller = 0;
                for(int i=0; i<a.length; i++){
                    if(i+k*-1 >= a.length){
                        a[i] = b[teller];
                        teller++;

                    }
                    else{
                        a[i] = b[k*-1+i];
                    }
                }
            }
    }



    ////////////////////////////////oblig 7

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
            tekst +=char1.get(i);
            tekst +=char2.get(i);
 
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

    public static String flett(String ...s){
        int i=0;
        String s1 = "";
        int lengde = 0;

        for(String ss : s){
            char[] tekst = ss.toCharArray();
            if(lengde < tekst.length){
            lengde = tekst.length;
            }
        }
        while(i<lengde){
            for(String ss : s){
                char[]tekst = ss.toCharArray();
                if(tekst.length > i){
                    s1 = s1+tekst[i];
                }
            }
            i++;
        }
        return s1;

    }

    ///////////////////////////oppgave 8
    public static int[] indekssortering(int[] a){
        if(a.length == 0){
            //System.out.println("************   Listen er tom   ************");
            return new int[0];
        }

        int[] indeks = new int[a.length];
        int[] hjelpe = new int[a.length];
        for(int i=0; i<a.length; i++){
            hjelpe[i] = a[i];
        }
        int minstIndeks = 0;
        int minst = a[0];
        int indekser = 0;
        int element = 0;
        
        // finner minsste tall
        for(int i=0; i<a.length; i++){
            if(minst>a.length){
                minst = a.length;
                minstIndeks = i;
            }
        }
        indeks[indekser] = minstIndeks;
        indekser++;
        element = minst;

        // sjekker om noen tall er gjentatt
        int r=0;
        for(int i=0; i<a.length; i++){
            if(r>0 && a[i] == minst){
                indeks[indekser] = i;
            }
        }
        // gaa til neste tall
        for(int i=0; i<a.length; i++){
            if(minst > a[i]){
                
            }
        }




    }
}