import java.time.LocalDate;

public class Person {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    private String name;
    private LocalDate dateOfBirth;
    private String destination;
    /* learn (),walk(), eat() */

//    public Person() {
//    }

    public Person(String name,LocalDate dateOfBirth, String destination) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.destination = destination;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void getEat() {
        System.out.println( ANSI_PURPLE+name+" is eating food ");
    }

    public void getLearn() {
        System.out.println(ANSI_GREEN+name+" is learning Java");
    }

    public void getWalk() {
        System.out.println(ANSI_CYAN+name+" is walking in the Park");
    }

    @Override
    public String toString() {
        return ANSI_CYAN+"-----------------------------------------------------"+
                "\nPerson :  " +
                ANSI_YELLOW+"Name " + name  +
                ANSI_BLUE+" destination='" + destination +ANSI_RESET
                +"\n-----------------------------------------------------";
    }
}

