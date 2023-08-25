package WorkingWithAbstraction.Lab.HotelReservation_04;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int days, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discountType = discountType;
    }

    public String calculate() {
        double totalPrice = getPricePerDay() * getDays() * season.getPriceFactor() * discountType.getDiscount();
        return String.format("%.2f", totalPrice);
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public int getDays() {
        return days;
    }


}
