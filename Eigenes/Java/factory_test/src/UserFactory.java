
// UserFactory
public class UserFactory {
    public static User createUser(String type, int id, String name) {
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