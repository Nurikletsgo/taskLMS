import java.time.LocalDate;

public class Singer extends  Person{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";


private String bandName;

    public Singer(String name, LocalDate dateOfBirth, String destination, String bandName) {
        super(name, dateOfBirth,destination);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void getSinging(){
        System.out.println(ANSI_RED+super.getName() +(" is singing"));
    }
    public void getPlayGuitar(){
        System.out.println(ANSI_YELLOW+super.getName() +(" is playing komuz"));
    }
}
