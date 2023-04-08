import java.util.Scanner;

/**
 * Menyatakan class bernama MainLompatKatak untuk memanggil
 * class lainnya seperti class Katak, class Pemain, dan class KotakPermainan.
 * 
 * @author Furqan Ramadhan
 * @version 1.3
 * 
 *          link video :
 *          https://drive.google.com/file/d/1kTKx3f08K3Ggywy_oTlfxz81CQTAmEE6/view?usp=sharing
 */

public class MainLompatKatak implements interfaceMainkan {
    public Scanner sc = new Scanner(System.in);
    int difficulty;
    int i;
    int jk, jm, j = 500;
    int nilai;
    String nama;

    /**
     * @param Method constructor dengan tanpa parameter.
     */
    public MainLompatKatak() {
    }

    /**
     * deklarasi method utama bernama Mainkan untuk bermain lompat katak
     * dengan parameter nama, tingkat kesulitan, kotak, koin,
     * dan menyelesaikan permainan.
     */
    public void Mainkan() {
        int decision;
        String namaPlayer;
        Pemain player;
        KotakPermainan theGames;
        Katak cangguk = new Katak();
        Monster bebas = new Monster(nilai, nama);

        // Masukkan nama pemain
        System.out.print("Insert name player: ");
        namaPlayer = sc.nextLine();
        player = new Pemain(namaPlayer);
        System.out.println("Player : " + namaPlayer);

        String difficulty_mode = "";
        System.out.println("Choose your level..");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");

        difficulty = sc.nextInt();

        // Handling exception jika bukan dipilih 1 - 3
        while (difficulty > 3 || difficulty < 1) {
            System.out.printf("Only insert level 1 - 3! \n");
            System.out.println("Your level: ");
            difficulty = sc.nextInt();
        }
        switch (difficulty) {
            case 1:
                difficulty_mode = "Easy";
                jk = 250;
                jm = 100;
                break;

            case 2:
                difficulty_mode = "Medium";
                jk = 200;
                jm = 150;
                break;

            case 3:
                difficulty_mode = "Hard";
                jk = 190;
                jm = 180;
                break;
        }
        System.out.printf("Your level is : %s\n", difficulty_mode);

        // Pemanggilan class KotakPermainan
        theGames = new KotakPermainan(j, jk, jm);

        while (cangguk.getPosisi() < 499 && cangguk.getSkor() > 0) {
            // Menampilkan posisi cangguk saat ini
            System.out.println("Position of cangguk: " + cangguk.getPosisi());
            System.out.println("Score: " + cangguk.getSkor());
            if (cangguk.getPosisi() == 498) {
                System.out.println("One more jump.");
            }
            System.out.println("Do you want to go forward or backward? (a/d)");
            decision = sc.next().charAt(0);
            // handling exception jika pilihan bukan a atau d
            try {
                if (decision != 'a' && decision != 'd' && decision != 'A' && decision != 'D') {
                    System.out.println("Insert according to instructions.");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("Insert only a or d!");
            }
            // input langkah yang ingin maju atau mundur
            System.out.println("How much?");
            System.out.println("1. One step");
            System.out.println("2. Two steps");
            System.out.print("Insert your choice   : ");
            int moving = sc.nextInt();

            while (moving > 2 || moving < 1) {
                // handling exception jika choice tidak sesuai
                System.out.println("Invalid choice!");
                System.out.print("Insert your choice   : ");
                moving = sc.nextInt();
            }
            if (decision == 'd' || decision == 'D') {
                if (moving == 2) {
                    cangguk.loncatJauh();
                } else if (moving == 1) {
                    cangguk.loncatDekat();
                }
                cangguk.getPosisi();
            } else if (decision == 'a' || decision == 'A') {
                if (moving == 2) {
                    cangguk.belakangJauh();
                } else if (moving == 1) {
                    cangguk.belakangDekat();
                }
            }
            if (cangguk.getPosisi() < 0) {
                System.out.println("You run out of positions, game over!");
                System.exit(1);
            }
            cangguk.setSkor(cangguk.getSkor() + theGames.contain(cangguk.getPosisi()));

            if (theGames.contain(cangguk.getPosisi()) == 10) {
                // get point and + 10 score
                System.out.println("Yuhuu, got a score!");
            } // bila mendapatkan kotak yang berisi monster
            else if (theGames.contain(cangguk.getPosisi()) == -8) {
                System.out.println("There is Monster!! " + bebas.getNama() + " :) " + "score reduced!");
            }
        }
        System.out.println("All done!");
        player.setNilai(cangguk.getSkor());
        System.out.println("player : " + player.getNama());
        System.out.println("Score : " + player.getNilai());

        if (player.getNilai() < 0) {
            System.out.println("You run out of scores, Game Over!");
        } else if (player.getNilai() < 500) {
            System.out.println("Bad!");
        } else if (player.getNilai() < 1500) {
            System.out.println("Good!");
        } else {
            System.out.println("Excellent!");
        }
    }

    /**
     * 
     * @param args Method main untuk memanggil class Mainkan dan template awal
     *             ketika bermain.
     */
    public static void main(String[] args) {
        MainLompatKatak hayuk = new MainLompatKatak();
        char confirm = 'y';
        System.out.print("Hai katak, melompatlah!... \n");
        System.out.println("Press any key to begin...");
        hayuk.sc.nextLine();
        while (confirm == 'y') {
            hayuk.Mainkan();

            System.out.print("Play again ? (y/n)   : ");
            confirm = hayuk.sc.next().charAt(0);
        }
        System.out.println("Thank you for playing!");
        hayuk.sc.close();

    }
}
