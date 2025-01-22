
// Admin
public class Admin extends User {
    public Admin(int id, String name) {
        super(id, name);
    }

    // Admin-specific methods
    public void adminMethod() {
        System.out.println("Admin method");
    }

    @Override
    public String toString() {
        return "\nAdmin name: " + this.name + "\nid: " + this.id;
    }
}