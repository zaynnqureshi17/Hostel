/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intihotel;

/**
 *
 * @author zayn
 */
public class Booking {
    //Number generator of the booking id
    protected static int numberOfBooking = 99; 
    
    // AutoGenerated booking ID
    private int bookingID; 
    
    //Customers Information, name, passport, address, phone number 
    private String name; 
    private String passport; 
    private String address; 
    private int pNumber; 
    
    // Number of Booking Nights 
    private int numOfNights; 
    
    // Type of room 
    private String room; 
    
    // Cost of payment 
    private int cost; 
    
    private String promoCode;
    
    //date  of Booking
    private String date;
    
    
    public Booking ( String cName, String pass, String cAddress, int pNum, int nights, String room, int cost,String promoCode, String date)
    {
        name = cName;
        passport = pass;
        address = cAddress;
        pNumber = pNum;
        numOfNights = nights;
        this.room=room;
        this.cost=cost;
        this.promoCode= promoCode;
        this.date= date;
        bookingID = numberOfBooking;
        numberOfBooking++;
    }
      /**
     * The getBookingID method returns the booking ID of the customer
     * @return returns booking ID 
     */
    public int getBookingID()
    {
        return bookingID;
    }
    
    /**
     * The getNumOfNights method returns the number of Nights wanted for Book
     * @return returns the number of nights booked 
     */
    public int getNumOfNights()
    {
        return numOfNights;
    }
    
    /**
     * the getName method returns the name of the customer
     * @return returns the name of the customer
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * The getPass method returns the passport of the customer
     * @return returns the passport of the customer
     */
    public String getPass()
    {
        return passport;
    }
    
    /**
     * the getCost method returns the total cost for the customer
     * @return returns the total cost for the customer
     */
    public int getCost()
    {
        return cost;
    }
    public String getPromoCode()
    {
        return promoCode;
    }
    
    /**
     * the getRoom method returns the name of the room booked by the customer
     * @return returns the name of the room booked by the customer
     */
    public String getRoom()
    {
        return room;
    }
    
    /**
     * the getDate method returns the date the customer Booked the room.
     * @return returns the date the customer booked the room in.
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * the getAddress method returns the address of the customer.
     * @return returns the address of the customer.
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * the getNumber method returns the phone number of the customer.
     * @return returns the phone number of the customer.
     */
    public int getPNumber()
    {
        return pNumber;
    }
    
}
