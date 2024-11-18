public class User {
    private String name;
    private String email;

    // Construtor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
