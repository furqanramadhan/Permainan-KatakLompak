import java.util.ArrayList;
import java.util.Collections;

/**
 * Menyatakan class KotakPermainan yang digunakan
 * sebagai tempat katak akan bergerak.
 *
 * @author Furqan Ramadhan
 * @version 1.2
 * 
 *          link video :
 *          https://drive.google.com/file/d/1kTKx3f08K3Ggywy_oTlfxz81CQTAmEE6/view?usp=sharing
 */
public class KotakPermainan {
    private Kotak boardGame[];
    private int jumKotak;
    private int jumlahKoin;
    private int jumlahMonster;
    private int acakKoin[];
    private int acakMonster[];
    private int i;

    /**
     * 
     * @param j  method constructor untuk menginisialiasi j untuk jumKotak.
     * @param jk method constructor untuk menginisialiasi jk untuk jumlahKoin.
     * @param jm method constructor untuk menginisialiasi jm untuk jumlahMonster.
     * 
     */
    public KotakPermainan(int j, int jk, int jm) {
        this.jumKotak = j;
        this.jumlahKoin = jk;
        this.jumlahMonster = jm;

        // memberikan nilai acak kepada koin dan monster
        generateAcak();
        // memasukkan nilai acak kepada boardGame
        inisialisasiKotak();
    }

    /**
     * Method mutator untuk memberikan nilai acak kepada variabel
     * acakKoin dan acakMonster.
     */
    private void generateAcak() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        acakKoin = new int[jumlahKoin];
        acakMonster = new int[jumlahKoin];
        // nilai acak ditentukan sebanyak jumlah kotak
        for (i = 0; i < jumKotak; i++) {
            list.add(i);
        }
        // Collection untuk mengacak nilai kepada koin
        Collections.shuffle(list);
        // generate nilai acak untuk koin
        for (i = 0; i < jumlahKoin; i++) {
            acakKoin[i] = list.get(i);// koin
        }
        // generate posisi monster dimana posisi monster != posisi koin
        for (i = jumlahKoin; i < jumlahMonster + jumlahKoin; i++) {
            acakMonster[i - jumlahKoin] = list.get(i);
        }
    }

    /**
     * Method mutator untuk memberi isi kotak yang sudah
     * di generate dengan salah satu, yaitu koin atau monster.
     */
    private void inisialisasiKotak() {
        boardGame = new Kotak[jumKotak];
        Koin koin_1 = new Koin(10);

        Monster monster_1 = new Monster(-8, "Snake");
        for (i = 0; i < jumKotak; i++) {
            boardGame[i] = new Kotak();
            // System.out.println(acakKoin[i] + "\t");
        }

        for (i = 0; i < jumlahKoin; i++) {
            boardGame[acakKoin[i]].addKoin(koin_1);
            // System.out.println(acakKoin[i] + "\t");
        }
        for (i = 0; i < jumlahMonster; i++) {
            boardGame[acakMonster[i]].addMonster(monster_1);
        }

    }

    /**
     * 
     * @param posisi method accessor dimana contain akan
     *               return -> boardGame koin, nilai, atau monster
     * @return
     */
    public int contain(int posisi) {
        if (boardGame[posisi].isThereKoin()) {
            return boardGame[posisi].getKoin().getNilai();
        } else if (boardGame[posisi].isThereMonster()) {
            return boardGame[posisi].getMonster().getNilai();
        } else {
            return 0;
        }
    }
}
