/**
 * @author Kelly Kurkowski
 * 3370 Software - Engineering and Practice
 * DUE JANUARY 29, 2018 by 11:55PM
 */

public class BeerSong {
    
    public static void main(String[] args) {
        BeerSong song = new BeerSong();
        song.Nintey_Nine_Bottles_of_Beer();        
    }
    
    public void Nintey_Nine_Bottles_of_Beer() {
        int bottles = 99;
        
        while (bottles != 1) {
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer");
            bottles--;
            System.out.println("take one down, pass it around, " + bottles + " bottles of beer on the wall.");
        }
        
        System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer");
        bottles--;
        System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
    }
}