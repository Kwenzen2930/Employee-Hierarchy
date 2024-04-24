public class employee {
    protected static String firstName;
    protected static String lastName;
    protected static String socialSecurityNumber;

    public employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public String getSocialSecurityNumber(){return socialSecurityNumber;}

    public void setFirstName(String firstNames){
        firstName = firstNames;
    }

    public void setLastName(String lastNames){
        lastName = lastNames;
    }

    public void setSocialSecurityNumber(String socialSecurityNumbers){
        socialSecurityNumber = socialSecurityNumbers;
    }

    public String toString(){
        return String.format("%s: %s %s%n%s: %s", 
        "Employee", getFirstName(), getLastName(),
        "Social Security Number", getSocialSecurityNumber());
    }


}
