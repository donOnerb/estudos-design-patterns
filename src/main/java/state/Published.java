package state;

public class Published implements State {
    private Document document;

    public Published(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        if (document.getOwner().isAdmin() || document.getOwner().isAuthor()) {
            System.out.println("Render Publication");
        } else {
            System.out.println("Error Publication");
        }
    }

    @Override
    public void publish() {
        System.out.println("Already published");
    }
}
