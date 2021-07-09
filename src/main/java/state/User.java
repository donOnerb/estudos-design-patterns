package state;

public class User {

    private boolean isAdmin;
    private boolean isAuthor;

    public User(boolean isAdmin, boolean isAuthor) {
        this.isAdmin = isAdmin;
        this.isAuthor = isAuthor;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isAuthor() {
        return isAuthor;
    }

    public void setAuthor(boolean author) {
        isAuthor = author;
    }
}
