/**
 * Menyatakan class bernama Koin
 * untuk menentukan nilai koin dan input yang dimasukkan
 *
 * @author Furqan Ramadhan
 * @version 1.0
 *          link video :
 *          https://drive.google.com/file/d/1zavRXUjC_y-4TbGRock8yVQpdlh6_qgi/view?usp=sharing
 */
public class Koin {
    private int nilai;

    /**
     * @param method constructor untuk menyatakan nilai pemain
     */
    public Koin() {
        // Inisialisasi nilai awal pemain sebesar 10.
        nilai = 10;
    }

    /**
     * @param method constructor untuk menentukan nilai koin
     */
    public Koin(int nilai) {
        this.nilai = nilai;
    }

    /**
     * 
     * @return method constructor -> return nilai koin
     */
    public int getNilai() {
        return nilai;
    }

    /**
     * 
     * @param method mutator untuk setter nilai koin yang baru
     */
    public void setNilai(int nilaibaru) {
        this.nilai = nilaibaru;
    }
}
