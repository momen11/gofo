public class booking_data {
    protected String playgroundName;
    protected float hour_price;
    protected int [][] booking_hours = new int[7][24];
    protected int num_of_hour;
    protected int hour;
    protected int day;
    protected double bill;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setBooking_hours(int[][] booking_hours) {
        this.booking_hours = booking_hours;
    }

    public void setHour_price(float hour_price) {
        this.hour_price = hour_price;
    }

    public void setNum_of_hour(int num_of_hour) {
        this.num_of_hour = num_of_hour;
    }

    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }

    public void getBooking_hours() {

        for(int i=0;i<7;i++)
        {

            for(int k=0;k<24;k++)
            {
                if(booking_hours[i][k]!=0)
                {
                    System.out.println("Booking hour : " + booking_hours[i][k]);

                }
            }
        }
    }

    public float getHour_price() {
        return hour_price;
    }

    public int getNum_of_hour() {
        return num_of_hour;
    }

    public String getPlaygroundName() {
        return playgroundName;
    }

}
