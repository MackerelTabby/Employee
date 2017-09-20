public class Employee {
    private String name;
    private String title;
    private String company;
    private String birthday;

    public Employee(String name, String title, String company, String birthday) {
        if (name == null || title == null || company == null || birthday == null) {
            throw new IllegalArgumentException("Invalid");
        }
        this.name = name;
        this.title = title;
        this.company = company;
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setBirthday(String dob) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getBirthday() {
        return birthday;
    }

    public boolean equals(Object obj1, Object obj2) {
        if (obj1 == obj2) {
            return false;
        } else {
            return true;
        }
    }
}

