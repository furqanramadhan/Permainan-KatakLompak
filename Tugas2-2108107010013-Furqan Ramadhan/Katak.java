/**
 * Menyatakan class bernama Katak
 * untuk menentukan sifat katak,
 * yaitu dapat melangkah maju atau mundur,
 * serta mendapatkan posisi dan skor.
 *
 * @author Furqan Ramadhan
 * @version 1.0
 *          link video :
 *          https://drive.google.com/file/d/1zavRXUjC_y-4TbGRock8yVQpdlh6_qgi/view?usp=sharing
 */

public class Katak {
    private int posisi;
    private int skor;

    /**
     * Metode sederhana untuk menyatakan object dari
     * class katak dengan method constructor adalah
     * public.
     */
    public Katak() {
        // Inisialisasi nilai awal dari variabel
        skor = 100;
        posisi = 0;
    }

    /**
     * 
     * @return method accessor -> return posisi untuk menentukan posisi baru.
     */
    public int getPosisi() {
        return this.posisi;
    }

    /**
     * 
     * @return method accessor -> return skor untuk menentukan skor baru.
     */
    public int getSkor() {
        return this.skor;
    }

    /**
     * 
     * @param method mutator untuk setter skorBaru
     */
    public void setSkor(int skorBaru) {
        this.skor = skorBaru;
    }

    /**
     * Method mutator untuk memajukan posisi katak sebanyak satu
     */
    public void loncatDekat() {
        this.posisi += 1;
    }

    /**
     * Method mutator untuk memajukan posisi katak sebanyak dua
     */
    public void loncatJauh() {
        this.posisi += 2;
    }

    /**
     * Method mutator untuk memundurkan posisi katak sebanyak satu
     */
    public void belakangDekat() {
        this.posisi -= 1;
    }

    /**
     * 
     * Method mutator untuk memundurkan posisi katak sebanyak dua
     */
    public void belakangJauh() {
        this.posisi -= 2;
    }
}
