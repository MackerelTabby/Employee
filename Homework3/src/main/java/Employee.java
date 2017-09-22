public class Employee {
    private String name;
    private String title;
    private Company company;
    private Calendar birthday;

    public Employee( String name, String title, Company company, Calendar birthday) {
        if (name == null || 0 == name.length() || title == null || 0 == title.length() || company == null || birthday == null) {
            throw new IllegalArgumentException("Invalid");
        }
        this.name = name;
        this.title = title;
        this.company = company;
        this.birthday = birthday;
    }

    public Employee (String name, String title, Company company, String day, String month, String year)
    {
        this.name = name;
        this.title = title;
        this.company = company;
        this.birthday = new Calendar(day, month, year);
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setCompany( Company company) {
        this.company = company;
    }

    public void setBirthday( Calendar birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public Company getCompany() {
        return company;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    @Override
    public boolean equals(final Object obj)
    {
        boolean result = false;
        if (obj != null && obj instanceof Employee) {
            final Employee c = (Employee) obj;
            result = (this.birthday.equals(c.getBirthday()) && this.name.equals(c.getName()) && this.title.equals(c.getTitle()) && this.company.equals(c.getCompany()));
        }
        return result;
    }
}
