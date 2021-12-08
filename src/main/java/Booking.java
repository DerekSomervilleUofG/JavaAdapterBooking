public class Booking {

    Confirmation confirmation;

    public void setConfirmation(Confirmation confirmation){
        this.confirmation = confirmation;
    }

    public void makeABooking(String name){
        confirmation.confirm(name);
    }

    public static void main(String[ ] args){
        Booking booking = new Booking();
        booking.setConfirmation(new TextConfirmation());
        booking.makeABooking("Derek");
        booking.setConfirmation(new EmailConfirmation());
        booking.makeABooking("Susan");
    }
}
