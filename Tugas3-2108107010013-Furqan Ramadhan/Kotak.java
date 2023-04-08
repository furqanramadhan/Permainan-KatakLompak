
/**
 * Menyatakan class bernama Kotak dimana setiap kotak
 * memiliki kemungkinan koin atau monster didalamnya.
 * 
 * @author Furqan Ramadhan
 * @version 1.1
 * 
 *          link video :
 *          https://drive.google.com/file/d/1kTKx3f08K3Ggywy_oTlfxz81CQTAmEE6/view?usp=sharing
 */
public class Kotak {
    private Koin coin;
    private Monster monsta;

    /**
     * @param method constructor dengan tanpa parameter.
     */
    public Kotak() {

    }

    /**
     * 
     * @param method constructor untuk menambahkan koin
     *               kedalam kotak.
     */
    public void addKoin(Koin c) {
        this.coin = c;
    }

    /**
     * 
     * @param method constructor untuk menambahkan monster
     *               kedalam kotak.
     */
    public void addMonster(Monster m) {
        this.monsta = m;
    }

    /**
     * 
     * @return method accessor untuk return koin kedalam kotak
     */
    public Koin getKoin() {
        return coin;
    }

    /**
     * 
     * @return method accessor untuk return monster kedalam kotak
     */
    public Monster getMonster() {
        return monsta;
    }

    /**
     * 
     * @return method accessor untuk return apakah didalam kotak ada koin?
     */
    public boolean isThereKoin() {
        return coin != null;
    }

    /**
     * @return method accessor untuk return apakah didalam kotak ada monster?
     */
    public boolean isThereMonster() {
        return monsta != null;
    }
}
