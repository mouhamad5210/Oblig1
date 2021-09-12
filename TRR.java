public class TRR {
    public void rotasjon(char[] a){
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
                System.out.println("forste");
            }
            else{
                a[i] = b[i-1];
                System.out.println("Andre");
            }
        }

        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println("\n\n\n");
    }

    public static void main(String[] args) {
        TRR t = new TRR();
        char [] b = {'a','b','c','d'};
        t.rotasjon(b);
        System.out.println(b);
    }
}