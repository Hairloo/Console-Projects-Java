package Mirea.Seventh;

import java.util.*;

public class DrunkurdGame {
    private int movesCount;
    private Player player1, player2;
    public DrunkurdGame(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;

    }

    public void play(){
        if(player1.getCardQueue().isEmpty()){
            System.out.println(player2.getName() + " won on " + movesCount + " move");
            return;
        }
        if(player2.getCardQueue().isEmpty()){
            System.out.println(player1.getName() + " won on " + movesCount + " move");
            return;
        }
        if(movesCount == 106){
            System.out.println("Draw");
            return;
        }
        System.out.println(player1.getName() + " cards: " + player1.getCardQueue());
        System.out.println(player2.getName() + " cards: " + player2.getCardQueue());
        Card firstPlayerCard = player1.getCardQueue().pollLast();
        Card secondPlayerCard = player2.getCardQueue().pollLast();
        if(!(secondPlayerCard.getValue() == 0 && firstPlayerCard.getValue() == 9) && firstPlayerCard.getValue() > secondPlayerCard.getValue()){
            System.out.println("Cards " + firstPlayerCard.getName() + "(" + firstPlayerCard.getValue() + ") and " +  secondPlayerCard.getName() + "(" + secondPlayerCard.getValue() + ") were added to " + player1.getName() + " deque");
            player1.getCardQueue().addFirst(firstPlayerCard);
            player1.getCardQueue().addFirst(secondPlayerCard);
        }
        else{
            System.out.println("Cards " + firstPlayerCard.getName() + "(" + firstPlayerCard.getValue() + ") and " +  secondPlayerCard.getName() + "(" + secondPlayerCard.getValue() + ") were added to " + player2.getName() + " deque");
            player2.getCardQueue().addFirst(secondPlayerCard);
            player2.getCardQueue().addFirst(firstPlayerCard);
        }
        movesCount++;
        play();
    }

    public void getAndSetCards(Player player){
        Scanner sc = new Scanner(System.in);
        Card [] cards = new Card[5];
        for(int i = 0; i < 5; i++){
            cards[i] = new Card(sc.nextInt());
        }
        setPlayerCards(cards, player);
    }



    private void setPlayerCards(Card [] cards, Player player){
        for(int i = 0; i < 5; i++){
            player.getCardQueue().addFirst(cards[i]);
        }
    }
}

class Card{
    private String name;
    private int value;

    public Card(int value){
        this.value = value;
        setName(value);
    }

    public void setName(int value) {
        switch (value){
            case 0:
                name = "Five";
                break;
            case 1:
                name = "Six";
                break;
            case 2:
                name = "Seven";
                break;
            case 3:
                name = "Eight";
                break;
            case 4:
                name = "Nine";
                break;
            case 5:
                name = "Ten";
                break;
            case 6:
                name = "Jack";
                break;
            case 7:
                name = "Queen";
                break;
            case 8:
                name = "King";
                break;
            case 9:
                name = "Ace";
                break;
        }
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

class Player{
    private ArrayDeque<Card> cardQueue;
    private String name;
    public Player(String name){
        this.name = name;
        cardQueue = new ArrayDeque<>();
    }

    public String getName() {
        return name;
    }

    public ArrayDeque<Card> getCardQueue() {
        return cardQueue;
    }
}

class Test{
    public static void main(String[] args) {
        Player player1 = new Player("Ilya(First player)");
        Player player2 = new Player("Egor(Second player)");
        DrunkurdGame game = new DrunkurdGame(player1, player2);
        game.getAndSetCards(player1);
        game.getAndSetCards(player2);
        game.play();
    }
}
