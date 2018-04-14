import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        Iterator<Rental> iterator = rentals.iterator();
        String result = "Rental Record for " + getName() + "\n";
        while (iterator.hasNext()) {
            Rental each = iterator.next();
            // Show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t"
                    + String.valueOf(each.getThisAmount()) + "\n";
        }

        // Add footer lines
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRentersPoint())
                + " frequent renter points";

        return result;
    }

    public double getTotalAmount() {
        Iterator<Rental> iterator = rentals.iterator();
        double totalAmount = 0;
        while (iterator.hasNext()) {
            Rental each = iterator.next();
            totalAmount += each.getThisAmount();
        }
        return totalAmount;
    }

    public int getTotalFrequentRentersPoint() {
        Iterator<Rental> iterator = rentals.iterator();
        int rentersPoint = 0;
        while (iterator.hasNext()) {
            Rental each = iterator.next();
            rentersPoint = each.getFrequentRentersPoint();
        }
        return rentersPoint;
    }




}