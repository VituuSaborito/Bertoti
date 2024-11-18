public class PrintQueue {
    private static PrintQueue instance;

    private PrintQueue() {
        // Construtor privado para evitar instância externa
    }

    public static PrintQueue getInstance() {
        if (instance == null) {
            instance = new PrintQueue();
        }
        return instance;
    }

    public void addJob(String job) {
        System.out.println("Job adicionado à fila: " + job);
    }
}