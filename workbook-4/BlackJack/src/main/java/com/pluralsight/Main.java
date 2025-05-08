package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter player 1's name: ");
        String playerOne = scanner.nextLine();

        System.out.println("Player 1 is: " + playerOne);

        System.out.println("Please enter player 2's name: ");
        String playerTwo = scanner.nextLine();

        System.out.println("Player 2 is: " + playerTwo);




        Deck deck = new Deck();
        deck.shuffle();


        Hand hand1 = new Hand();
        Hand hand2 = new Hand();


        hand1.deal(deck.deal());
        hand1.deal(deck.deal());

        hand2.deal(deck.deal());
        hand2.deal(deck.deal());

        System.out.println("Player 1's hand: " + playerOne);
        hand1.print();
        System.out.println(playerOne + " hand value: " + hand1.getValue());

        System.out.println("Player 2's hand: " + playerTwo);
        hand2.print();
        System.out.println(playerTwo + " hand value: " +hand2.getValue());


        int handValue = hand1.getValue();

        int hand2Value = hand2.getValue();

        if (handValue >21 && hand2Value > 21){
            System.out.println("You both lose!");
        } else if (handValue > 21) {
            System.out.println("Player 1 loses. Player 2 wins!");
        } else if (hand2Value > 21) {
            System.out.println("Player 2 loses. Player 1 wins!");

        } else if (handValue > hand2Value) {
            System.out.println("Player 1 wins!");

        } else if (hand2Value > handValue) {
            System.out.println("Player 2 wins!");

        }else {
            System.out.println("It's a tie!");
        }


    }
}