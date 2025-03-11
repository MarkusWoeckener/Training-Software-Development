
/**
 * Factory class for creating User objects.
 * The factory method takes a user type, an id,<br>
 * and a name, and returns a new User object of the specified type.
 * @author WoeckenerM
 */
public class UserFactory {
    /**
     * Creates a new User object of the specified type.
     * @param type {@code String} the type of user to create
     * @param id {@code int} the unique identifier for the user
     * @param name {@code String} the name of the user
     * @return {@code User} a new User object
     */
    public static User createUser(String type, int id, String name) {
        // Create a new User object based on the type
        switch (type.toLowerCase()) {
            case "admin":
                return new Admin(id, name);
            case "moderator":
                return new Moderator(id, name);
            case "regular":
                return new RegularUser(id, name);
            default:
                throw new IllegalArgumentException("Invalid user type: " + type);
        }
    }
}