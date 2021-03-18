package com.techelevator;

import java.sql.SQLOutput;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("GENERAL AUCTION");
        Bid bid1 = new Bid("Josh", 1);
        Bid bid2 = new Bid("Fonz", 23);
        Bid bid3 = new Bid("Rick", 13);

        Auction general = new Auction("Tech Elevator T-Shirt");
        general.placeBid(bid1);
        general.placeBid(bid2);
        general.placeBid(bid3);

        List<Bid> resultsOfGeneral = general.getAllBids();
        System.out.println(resultsOfGeneral);
        System.out.println("The current winner is: " + general.getHighBid());


        System.out.println("Reserve Auction");
        Bid bid4 = new Bid("Rick", 20);
        Bid bid5 = new Bid("Michael", 30);
        Bid bid6 = new Bid("Dwight", 48);
        Bid bid7 = new Bid("Ryan", 56);

        ReserveAuction reserve = new ReserveAuction("Mug", 41 );
        reserve.placeBid(bid4);
        reserve.placeBid(bid5);
        reserve.placeBid(bid6);
        reserve.placeBid(bid7);


        List<Bid> listOfReserveBids = reserve.getAllBids();
        System.out.println(listOfReserveBids);
        System.out.println("The current winner is: " + reserve.getHighBid());
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

    }
}
