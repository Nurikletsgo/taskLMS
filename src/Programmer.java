import java.time.LocalDate;

public class Programmer extends Person {
      public static final String ANSI_RED = "\u001B[31m";

      private String companyName;

      public Programmer(String name, LocalDate dateOfBirth,String destination, String companyName) {
            super(name,dateOfBirth, destination);
            this.companyName = companyName;

      }

      public String getCompanyName() {
            return companyName;
      }

      public void setCompanyName(String companyName) {
            this.companyName = companyName;
      }
      public void getCoding(){
            System.out.println(ANSI_RED+super.getName() +(" is coding"));
      }



      }

