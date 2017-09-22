public class Calendar {

    private String Day;
    private String Month;
    private String Year;

    public Calendar(String day, String month, String year)
    {
        Day = day;
        Month = month;
        Year = year;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        this.Year = Year;
    }

    public boolean equals(final Object obj)
    {
        final Calendar temp = (Calendar) obj;
        return (this.Day.equals(temp.getDay()) && this.Month.equals(temp.getMonth()) && this.Year.equals(temp.getYear()));
    }
}
