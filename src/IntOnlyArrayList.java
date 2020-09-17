import java.lang.ArrayIndexOutOfBoundsException;

public class IntOnlyArrayList {
    private int [] ia;

    public IntOnlyArrayList() {
    }


    public void add(int value){
        int [] liste;
        if (ia == null){
            liste = new int[]{
                    value
            };
        }
        else{
            liste = new int[ia.length + 1];
            for (int i = 0; i < ia.length; i++){
                liste[i] = ia[i];
            }
            liste[ia.length]=value;
        }
        ia = liste;
    }

    public int get(int index){
        return ia[index];
    }

    public void remove(int index){
        if (ia == null || ia.length == 0){
            System.out.println("Ingen int Arraylist");
        }
        else if (index >= ia.length){
            System.out.println("Ingen index:" + index);
        }
        else {
            int [] liste = new int[ia.length -1];
            int a = 0;
            for (int i = 0; i < ia.length; i++){
                if (i == index) i++;
                if (liste.length != 0){
                    liste[a] = ia[i];
                    a++;
                }
            }
            ia = liste;
        }
    }

    public int size(){
        if (ia == null){
            return 0;
        }
        else {
            return ia.length;
        }
    }

    @Override
    public String toString(){
        if (ia == null || ia.length == 0){
            return "Ingen int ArrayList";
        }
        else {
            String resultat = "Int ArrayList: ";
            for (int i = 0; i < ia.length; i++){
                resultat = resultat + ia[i] +"";
            }
            resultat = resultat.substring(0, resultat.length()-2);
            resultat = resultat + "";
            return resultat;
        }
    }
}
