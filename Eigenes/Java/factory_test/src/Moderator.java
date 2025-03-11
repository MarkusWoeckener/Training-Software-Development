/**
 * Moderator class
 * Represents a moderator user in the system.
 * Extends the {@link User} class.
 */
public class Moderator extends User {
    public Moderator(int id, String name) {
        super(id, name);
    }

    // Moderator-specific methods
    public void moderatorMethod() {
        System.out.println("Moderator method");
    }

    @Override
    public String toString() {
        return "\nModerator name: " + this.name + "\nid: " + this.id;
    }
}