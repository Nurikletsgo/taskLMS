import java.time.LocalDate;

public class Dancer extends Person {
    public static final String ANSI_RED = "\u001B[31m";

  private String groupName;

    public Dancer(String name, LocalDate dateOfBirth,String destination, String groupName) {
        super(name,dateOfBirth, destination);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void getDancing(){
        System.out.println(ANSI_RED+super.getName() +(" is dancing"));
    }


}
