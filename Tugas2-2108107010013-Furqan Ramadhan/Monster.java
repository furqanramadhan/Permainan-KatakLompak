
/**
 * Menyatakan class Monster dimana monster akan
 * mengurangi skor dari pemain
 *
 * @author Furqan Ramadhan
 * @version 1.0
 *          link video :
 *          https://drive.google.com/file/d/1zavRXUjC_y-4TbGRock8yVQpdlh6_qgi/view?usp=sharing
 */
public class Monster {
    private int nilai;
    private String nama;

    /**
     * @param Method constructor dengan tanpa paramater.
     */
    public Monster() {
        // inisialisasi sebuah monster dengan nama dan pengurangan skor
        nama = "Snake";
        nilai = -8;
    }

    /**
     * 
     * @param nilai Method constructor dengan parameter untuk menginisialisasi
     *              nilai serta nama.
     * @param nama
     */
    public Monster(int nilai, String nama) {
        this.nilai = nilai;
        this.nama = nama;
    }

    /**
     * 
     * @return Method accessor untuk return dari monster -> nama monster
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * 
     * @return Method accessor untuk return dari monster -> nilai
     */
    public int getNilai() {
        return nilai;
    }

    /**
     * 
     * @param Method mutator sebagai setter nama monster.
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
}
