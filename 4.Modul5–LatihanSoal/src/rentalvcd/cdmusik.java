package rentalvcd;

/**
 *
 * @author anggamaulana
 */
class cdmusik extends rentalvcd {
        public String penyanyi;
        public String tophits;
        public String kategori;
        public String produser;
    public cdmusik(String penyanyi, String tophits, String kategori, String produser, String judul, String publiser, int stok, String judul1) {
        super(judul, publiser, stok, judul1);
        this.penyanyi = penyanyi;
        this.tophits = tophits;
        this.kategori = kategori;
        this.produser = produser;
    }
    cdmusik() {
    }
}
