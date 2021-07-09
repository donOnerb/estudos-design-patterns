package state;

public class Document {
    private State state;
    private User owner;

    public Document(User owner) {
        this.owner = owner;
        this.state = new Draft(this);
    }

    public void render() {
        this.state.render();
    }

    public void publish() {
        this.state.publish();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public User getOwner() {
        return owner;
    }
}
