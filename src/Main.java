import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Programmer programmer = new Programmer("Nurmukhamed", LocalDate.of(1999, 8, 28), "Programmer", "Google");
        System.out.println(programmer);
        programmer.getEat();
        programmer.getLearn();
        programmer.getWalk();
        programmer.getCoding();

        Dancer dancer = new Dancer("Atay", LocalDate.of(1990, 10, 5), "Dancer", "Tumar KR");
        System.out.println(dancer);
        dancer.getEat();
        dancer.getLearn();
        dancer.getWalk();
        dancer.getDancing();

        Singer singer = new Singer("Mirbek", LocalDate.of(1989, 8, 11), "Siinger", "Ala-Too");
        System.out.println(singer);
        singer.getEat();
        singer.getLearn();
        singer.getWalk();
        singer.getPlayGuitar();
        singer.getSinging();


    }
}