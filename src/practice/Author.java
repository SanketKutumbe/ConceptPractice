package practice;

public class Author {

    private String fname;
    private String lName;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    Author(String name, String lname)
    {
        this.fname = name;
        this.lName = lname;
    }

    public String toString()
    {
        return "First name is " + this.fname;
    }

}
