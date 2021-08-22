package rentalvcd;

import java.util.Scanner;

/**
 *
 * @author anggamaulana
 */
public class Mainrentalvcd {
    public static void main(String[]args){
        cdfilm film = new cdfilm();
        cdmusik musik = new cdmusik();
        System.out.println("================");
         System.out.println("Input Rental VCD");
         System.out.println("===============");
         System.out.println("Pilihan Menu : ");
         System.out.println("1. CD Film");
         System.out.println("2. CD Musik");
         
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.print("Masukkan Pilihan :");
        int pilih;
        pilih = input1.nextInt();
        if (pilih == 1){
        System.out.println("Anda Memilih CD FILM");
        System.out.print("Masukan film      : ");
            film.judul = input.nextLine();
            System.out.print("Pemain            : ");
            film.pemain = input.nextLine();
            System.out.print("Sutradara         : ");
            film.sutradara = input.nextLine();
            System.out.print("Publisher         : ");
            film.publiser = input.nextLine();

        System.out.println("Kategori          : ");
        System.out.println("1.Semua Umur");
        System.out.println("2.Remaja");
        System.out.println("3.Dewasa");
        System.out.println("4.Anak-Anak");
        System.out.print("Masukan Pilihan   : ");
        int pil;
        pil = input1.nextInt();
        if (pil == 1){
        film.kategori = "Semua Umur";
        }
        else if (pil == 2){
        film.kategori = "Remaja";
        }
        else if (pil == 3){
        film.kategori = "Dewasa";
        }
        else if (pil == 4){
        film.kategori = "Anak-Anak";
        }
        else{
        film.kategori = "Pilihan Tidak Ada";
        }

            System.out.print("Stok              : ");
            film.stok = input.nextInt();
        System.out.println("Judul Film      : "+film.judul);
        System.out.println("Pemain          : "+film.pemain);
        System.out.println("Sutradara       : "+film.sutradara);
        System.out.println("Publisher       : "+film.publiser);
        System.out.println("Kategori        : "+film.kategori);
        System.out.println("Stok            : "+film.stok);
}
        else if (pilih == 2){
        System.out.println("Anda Memilih CD MUSIK");
        System.out.print("\nMasukan Judul Musik      : ");
            musik.judul1 = input.nextLine();
        System.out.print("Penyanyi             : ");
            musik.penyanyi = input.nextLine();
        System.out.print("Produser             : ");
            musik.produser = input.nextLine();
        System.out.print("Publisher            : ");
            musik.publiser = input.nextLine();
            System.out.print("Top Hits             : ");
            musik.tophits = input.nextLine();

        System.out.println("Kategori          : ");
        System.out.println("1.Classic");
        System.out.println("2.Jazz");
        System.out.println("3.Pop");
        System.out.println("4.Rock");
        System.out.print("Masukan Pilihan   : ");
        int pil;
        pil = input.nextInt();
        if (pil == 1){
        musik.kategori = "Classic";
        }
        else if (pil == 2){
        musik.kategori = "Jazz";
        }
        else if (pil == 3){
        musik.kategori = "Pop";
        }
        else if (pil == 4){
        musik.kategori = "Rock";
        }
        else{
        musik.kategori = "Other";
        }
            System.out.print("Stok              : ");
            musik.stok = input.nextInt();
        System.out.println("Judul Lagu      : "+musik.judul1);
        System.out.println("Penyanyi          : "+musik.penyanyi);
        System.out.println("Produser       : "+musik.produser);
        System.out.println("Publisher       : "+musik.publiser);
        System.out.println("Top Hits        : "+musik.tophits);
        System.out.println("Kategori        : "+musik.kategori);
        System.out.println("Stok            : "+musik.stok);
    }
        else{
            System.out.println("Tidak ada pilihan");
        }
        }
}
