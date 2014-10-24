package pl.programmers.enums;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        AccessLevel accessLevel = AccessLevel.ADMIN;
        accessLevel.setVal(true);

        switch (accessLevel) {
            case ADMIN:
                System.out.println("admin");
                break;
            case USER:
                System.out.println("user");
                break;

        }
    }
}
