public class Main {
    public static void main(String[] args) {
        // Criando o modelo
        User user = new User("Vitor Saborito", "vitor.saborito@example.com");

        // Criando a visão
        UserView view = new UserView();

        // Criando o controlador
        UserController controller = new UserController(user, view);

        // Exibindo os dados iniciais
        controller.updateView();

        // Alterando os dados usando o controlador
        controller.setUserName("Carlos Oliveira");
        controller.setUserEmail("carlos.oliveira@example.com");

        // Atualizando a visão
        controller.updateView();
    }
}
