# Insertion Sort
El algoritmo de ordenamiento Insertion Sort se basa principalmente en generar una sección ordenada y desordenada, de manera que, usualmente, al lado izquierdo del arreglo es la zona ordenada en la cual se van insertando elementos de la zona desordenada. El elemento a insertar se va comparando con cada elemento de la zona ordenada hasta el punto en que el valor sea menor al comparado, entonces ahí se inserta.

![Imagen descriptiva Insertion Sort. Fuente: GeeksForGeeks](https://media.geeksforgeeks.org/wp-content/uploads/20240802210251/Insertion-sorting.png)

Fuente: geeksforgeeks.org

### Resolución de problema en código

```        //Definir Array
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
```
