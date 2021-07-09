package state;

public class Draft implements State {
    private Document document;

    public Draft(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        if (document.getOwner().isAdmin() || document.getOwner().isAuthor()) {
            System.out.println("Render draft");
        } else {
            System.out.println("Error draft");
        }
    }

    @Override
    public void publish() {
        if (document.getOwner().isAdmin() || document.getOwner().isAuthor()) {
            document.changeState(new Published(document));
        } else {
            document.changeState(new Moderation(document));
        }
    }
}
