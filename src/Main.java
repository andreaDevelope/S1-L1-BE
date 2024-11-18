import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //es1
        System.out.println(moltiplica(10,20));

        System.out.println(concatena("ciao ", 2));

        String[] arrayOriginale = new String[] { "1", "2", "3", "4", "5" };
        String[] nuovoArray = inserisciInArray(arrayOriginale, "new 3");
        for(int i = 0; i < nuovoArray.length; i++){
            System.out.println(nuovoArray[i]);
        }

        //es2
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci 3 stringhe e verranno restituite concatenate in ordine di inserimento e in ordine inverso");
        String[] stringArr = new String[3];
        for(int i = 0; i < stringArr.length; i++){
           stringArr[i] = sc.nextLine();
        }

        System.out.println("ordine di inserimento");

        for(int i = 0; i < stringArr.length; i++){
            System.out.println(stringArr[i]);
        }

        System.out.println("ordine inverso");

        for(int i = stringArr.length -1; i >=0 ; i--){
            System.out.println(stringArr[i]);
        }
    }

    //es1
    public static int moltiplica (int param1, int param2){
        return param1 * param2;
    }

    public static String concatena(String param1, int param2){
        return param1 + param2;
    }

    public static String[] inserisciInArray(String[] param1, String param2) {
        if (param1 == null || param1.length != 5) {
            throw new IllegalArgumentException("Il primo parametro deve essere un array di 5 stringhe.");
        }

        String[] risultato = new String[6];

        for (int i = 0; i < 2; i++) {
            risultato[i] = param1[i];
        }

        risultato[2] = param2;

        for (int i = 2; i < param1.length; i++) {
            risultato[i + 1] = param1[i];
        }

        return risultato;
    }



}