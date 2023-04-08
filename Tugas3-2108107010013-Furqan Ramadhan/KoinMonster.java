/**
 * Membuat sebuah abstract class bernama KoinMonster
 * yang memiliki dua subclass
 * 
 * @author Furqan Ramadhan
 * @version 1.3
 * 
 *          link video :
 *          https://drive.google.com/file/d/1kTKx3f08K3Ggywy_oTlfxz81CQTAmEE6/view?usp=sharing
 */
public abstract class KoinMonster {
    private int nilai;
    private String nama;

    /**
     * 
     * @param nilai method constructor untuk menentukan nilai koin
     */
    public KoinMonster(int nilai) {
        this.nilai = nilai;
    }

    /**
     * 
     * @param nilai method constructor untuk menentukan nama monster berserta nilai
     *              pengurangannya.
     * @param nama
     */
    public KoinMonster(int nilai, String nama) {
        this.nilai = nilai;
        this.nama = nama;

    }

    /**
     * 
     * @return method accessor untuk return dari nilai koin, serta juga dapat
     *         digunakan untuk return nilai monster.
     */
    public int getNilai() {
        return nilai;
    }

    /**
     * 
     * @return Method accessor untuk return dari nama monster.
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * 
     * @param nama Method mutator sebagai setter nama monster.
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * 
     * @param nilaibaru method mutator sebagai setter nilai koin yang baru.
     */
    public void setNilai(int nilaibaru) {
        this.nilai = nilaibaru;
    }
}