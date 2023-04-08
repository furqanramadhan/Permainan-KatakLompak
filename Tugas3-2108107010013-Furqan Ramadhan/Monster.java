/**
 * Menyatakan class bernama Monster yang merupakan subclass dari
 * class abstract KoinMonster.
 * 
 * @author Furqan Ramadhan
 * @version 1.4
 * 
 *          link video :
 *          https://drive.google.com/file/d/1kTKx3f08K3Ggywy_oTlfxz81CQTAmEE6/view?usp=sharing
 */
public class Monster extends KoinMonster {
    /**
     * 
     * @param nilai constructor serta memanggil
     *              class parent menggunakan keyword super()
     *              pada nilai dan nama.
     * @param nama
     */
    public Monster(int nilai, String nama) {
        super(-8, "Snake");
        /*
         * nilai = -8;
         * nama = "Snake";
         *
         */
    }
}