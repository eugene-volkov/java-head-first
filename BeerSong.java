//cmd support utf-8
//chcp 65001

public class BeerSong {
    public static void main (String[] args) {
        int beerNum = 3;
        String word = "бутылок (бутылки)";
        
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "бутылка"; //В единственном - ОДНА бутылка.
            }
            
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьму одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            
            if (beerNum == 0) {
                System.out.println("Нет бутылок пива на стене");
            } //Конецelse
        } //Конецциклаwhile
    }
}