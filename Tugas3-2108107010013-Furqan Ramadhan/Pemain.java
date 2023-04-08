/**
 * Menyatakan class bernama Pemain dimana
 * pemain memiliki nama dan nilai.
 *
 * @author Furqan Ramadhan
 * @version 1.5
 * 
 *          link video :
 *          https://drive.google.com/file/d/1kTKx3f08K3Ggywy_oTlfxz81CQTAmEE6/view?usp=sharing
 */
public class Pemain {
    private String nama;
    private int nilai;

    /**
     * 
     * @param nama Method constructor dengan parameter untuk menginisialisasi nama
     *             dan nilai default 0.
     */
    public Pemain(String nama) {
        this.nama = nama;
        // nilai awal
        nilai = 0;
    }

    /**
     * 
     * @return Method accessor untuk return dari pemain -> nama
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * 
     * @param nama Method mutator menggunakan parameter sebagai setter nama dari
     *             pemain.
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * 
     * @return Method accessor untuk return dari pemain -> nilai
     */
    public int getNilai() {
        return this.nilai;
    }

    /**
     * 
     * @param Method accessor nilai menggunakan paramater sebagai setter nilai dari
     *               pemain
     */
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}
