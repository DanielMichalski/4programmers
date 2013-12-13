package pierwszy;

import java.util.ArrayList;
import java.util.List;

public class Zajecia {
    private int nrsali;
    private String cwiczeniowiec;
    private String przedmiot;
    private List<Student> uczestnicy;
    private int pojemnosc;

    public Zajecia(int pojemnosc, int nrsali, String cwiczeniowiec, String przedmiot) {
        this.nrsali = nrsali;
        this.cwiczeniowiec = cwiczeniowiec;
        this.przedmiot = przedmiot;
        this.uczestnicy = new ArrayList<Student>();
        this.pojemnosc = pojemnosc;
    }

    public void pokaz() {
        System.out.println(nrsali);
        System.out.println(przedmiot);
        System.out.println(cwiczeniowiec);
        for (Student s : uczestnicy) {
            s.pokaz();
        }
    }

    public boolean czyPelne() {
        return uczestnicy.size() >= pojemnosc;
    }

    public boolean dodajStudenta(Student s) {
        if (!czyPelne()) {
            return uczestnicy.add(s);
        } else {
            return false;
        }
    }
}