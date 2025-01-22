/**
 * Main class to test the <i>factory</i> design pattern
 * @author WoeckenerM
 */
public class Main {
    /**
     * Main method, shows the difference between creating a user with and without a factory
     * @param args
     */
    public static void main(String[] args) {
        String type = "moderator";
        int id = 2;
        String name = "Paul";
        User user;
        
        // Messy way - without a factory
        if (type.equals("admin")) {
            user = new Admin(id, name);
        } else if (type.equals("moderator")) {
            user = new Moderator(id, name);
        } else {
            user = new RegularUser(id, name);
        }

        // Clean factory way
        User cleanUser = UserFactory.createUser("admin", 1, "John");
        System.out.println(cleanUser);
        System.out.println(user);
    }
}
