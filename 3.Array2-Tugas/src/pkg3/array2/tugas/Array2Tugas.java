
package pkg3.array2.tugas;

public class Array2Tugas {

    public static void main(String[] args) {
        int a [][]= {{1,2},{3,5},{6,7}};
        int b [][]= {{8,9},{10,11},{12,13}};
        int c [][]= {{9,11},{13,16},{18,20}};
        int penjumlahan [][]= new int [3][3];
        
        System.out.println("1. Perkalian Matriks A & B");
        System.out.println("\nMatriks A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println("");
            
        }
        System.out.println("Matriks B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j]+" ");
                
            }
            System.out.println("");
            
        }
        System.out.println("Matriks C, Hasil penjumlahan A & B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
               penjumlahan [i][j]= a[i][j]+b[i][j];
                System.out.print(penjumlahan[i][j]+"  ");
                
            }
            System.out.println("");
            
        }
        
        System.out.println("\n2. Matriks C * 0.5");
        System.out.println("\nHasil penjumlahan (hasil sudah di bulatkan)");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
               penjumlahan [i][j]= (int) ((a[i][j]+b[i][j])*0.50);
                System.out.print(penjumlahan[i][j]+"  ");
                
            }
            System.out.println("");
            
        }
        
        
    }
    
} 
