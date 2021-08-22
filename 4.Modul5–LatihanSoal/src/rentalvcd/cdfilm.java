package rentalvcd;

/**
 *
 * @author anggamaulana
 */
class cdfilm extends rentalvcd {
        public String pemain;
        public String sutradara;
        public String kategori;
    public cdfilm(String pemain, String sutradara, String kategori, String judul, String publiser, int stok, String judul1) {
        super(judul, publiser, stok, judul1);
        this.pemain = pemain;
        this.sutradara = sutradara;
        this.kategori = kategori;
    }
   cdfilm() {
    }
}  