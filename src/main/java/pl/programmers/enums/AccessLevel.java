package pl.programmers.enums;

/**
 * Author: Daniel
 */
public enum AccessLevel {
    ADMIN(false),
    USER(false);

    private boolean val;

    AccessLevel(boolean val) {
        this.val = val;
    }

    public boolean isVal() {
        return val;
    }

    public void setVal(boolean val) {
        this.val = val;
    }
}
