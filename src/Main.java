import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //es1
        System.out.println(moltiplica(10,20));

        System.out.println("---------------------------------------------------");

        System.out.println(concatena("ciao ", 2));

        System.out.println("---------------------------------------------------");


        String[] arrayOriginale = new String[] { "1", "2", "3", "4", "5" };
        String[] nuovoArray = inserisciInArray(arrayOriginale, "new 3");
        for(int i = 0; i < nuovoArray.length; i++){
            System.out.println(nuovoArray[i]);
        }

        System.out.println("---------------------------------------------------");


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

        System.out.println("---------------------------------------------------");


        //es3
        System.out.println(perimetroRettangolo(10.2, 20.3));

        System.out.println("---------------------------------------------------");


        System.out.println(pariDispari(10));

        System.out.println("---------------------------------------------------");

        System.out.println("il perimetro del triangolo è: " + perimetroTriangolo(10.2, 10, 13.4));
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

    //es3

    public static String perimetroRettangolo(double param1, double param2){
        double perimetro = 2 * ( param1 + param2);
        String result = "il perimetro del tuo rettangolo è: " + perimetro;
        return result;
    }

    public static byte pariDispari(int param){
        if(param % 2 == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static double perimetroTriangolo(double param1, double param2, double param3){
        double semiPerimetro = (param1 + param2 + param3)/2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - param1) * (semiPerimetro - param2) * (semiPerimetro - param3));
        return area;
    }

}