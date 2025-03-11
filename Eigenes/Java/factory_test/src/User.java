/**
 * User class.
 * Represents a user in the system.
 * Abstract class that is extended by other user types.
 * @see Admin
 * @see Moderator
 * @see RegularUser
 * @see UserFactory
 */
public abstract class User {
    protected int id;
    protected String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
    // ...
}