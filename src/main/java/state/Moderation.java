package state;

public class Moderation implements State {
    private Document document;

    public Moderation(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        if (document.getOwner().isAdmin() || document.getOwner().isAuthor()) {
            System.out.println("Render Moderation");
        } else {
            System.out.println("Error Moderation");
        }
    }

    @Override
    public void publish() {
        if (document.getOwner().isAdmin()) {
            document.changeState(new Published(document));
        }
    }
}
