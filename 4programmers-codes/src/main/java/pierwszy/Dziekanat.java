package pierwszy;

public class Dziekanat{
    public static boolean saPelne( Zajecia z ){
        return z.czyPelne();
    }

    public static boolean przyjecieStudenta( Zajecia z, Student s ){
        return z.dodajStudenta(s);
    }
}