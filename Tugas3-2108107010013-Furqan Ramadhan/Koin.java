/*
 * Menyatakan class bernama Koin yang merupakan 
 * subclass dari class abstract KoinMonster.
 * 
 * @author Furqan Ramadhan
 * @version 1.2
 * 
 * link video : https://drive.google.com/file/d/1kTKx3f08K3Ggywy_oTlfxz81CQTAmEE6/view?usp=sharing
 */
public class Koin extends KoinMonster {
    /**
     * 
     * @param method constructor serta memanggil
     *               class parent menggunakan keyword super()
     *               pada nilai.
     */
    public Koin(int nilai) {
        super(10);
        // nilai = 10;
    }
}