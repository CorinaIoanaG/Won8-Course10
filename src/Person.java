public class Person {
    private String name;
    private String city;

    private boolean married;

    public Person(String name, String city, boolean married) {
        this.name = name;
        this.city = city;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public boolean isMarried() {
        return married;
    }

    public String personfromCity(String city) {
        if (this.city == city) {
            return this.name;
        }
        return null;
    }

    public String marriedPersonCity() {
        if (isMarried()) {
            return this.name + " " + this.city;
        }
        return null;
    }

}


