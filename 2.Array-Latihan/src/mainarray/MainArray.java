package mainarray;

public class MainArray {
    public static void main (String[] args) {
        int[] nils = {-5, -3, -6, -3, -4};
        int min = cariMin(nils);
        int maks = cariMaks(nils);
        double rerata = cariRerata(nils);       
        System.out.println("a)Nilai Rata-rata array: " +rerata);
        System.out.println("b)Nilai maksimum pada array: " +maks);
        System.out.println("c)Nilai minimum pada array: " +min);
        System.out.println("d)Index ke 3: " +nils[1]);
        
    }
    
    static double cariRerata(int[] arr) {
        double sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }
    
    static int cariMaks(int[] arr) {
        int maks = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (maks<arr[i]) {
                maks = arr[i];
            }
        }
        return maks;
    }
    
    static int cariMin(int[] arr) {
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    
        
    
    
}
