public class UserController {
    private User model;
    private UserView view;

    // Construtor
    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    // Métodos para manipular o modelo
    public void setUserName(String name) {
        model.setName(name);
    }

    public String getUserName() {
        return model.getName();
    }

    public void setUserEmail(String email) {
        model.setEmail(email);
    }

    public String getUserEmail() {
        return model.getEmail();
    }

    // Atualiza a visão
    public void updateView() {
        view.displayUserDetails(model.getName(), model.getEmail());
    }
}
