package WorkingWithAbstraction.Lab.HotelReservation_04;

public enum Season {

    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private int priceFactor;
    Season(int priceFactor) {
        this.priceFactor = priceFactor;
    }

    public int getPriceFactor() {
        return priceFactor;
    }
}
