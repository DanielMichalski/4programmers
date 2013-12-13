package pierwszy;

public class Student {
    private String nazwisko;
    private int numer;

    public Student(String nazwisko, int numer) {
        this.nazwisko = nazwisko;
        this.numer = numer;
    }

    public void pokaz() {
        System.out.println(nazwisko + " " + numer);
    }
}