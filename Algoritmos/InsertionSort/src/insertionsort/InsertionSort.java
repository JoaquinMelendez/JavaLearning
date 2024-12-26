package insertionsort;

/**
 *
 * @author joaquinmelendezhenriquez
 */
public class InsertionSort {

    public static void main(String[] args) {
        
        //Definir Array
        int [] UnsortedArray = {5, 2, 3, 8, 3, 1};
        
        //Bucle de ordenamiento
        for (int i = 1; i < UnsortedArray.length ; i++) {
            
            int num = UnsortedArray[i];
            int j = i - 1;
            
            while(j >= 0 && num < UnsortedArray[j]){
                UnsortedArray[j+1] = UnsortedArray[j];
                j =- 1;
            }
            UnsortedArray[j+1]  = num;
        }    
        //Imprimir array ordenado
        for (int i = 0; UnsortedArray.length > i; i++) {
            System.out.println(UnsortedArray[i]);
        }     
    }
   
}
