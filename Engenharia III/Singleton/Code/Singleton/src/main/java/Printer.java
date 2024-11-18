public class Printer {
    public void print(String job) {
        PrintQueue printQueue = PrintQueue.getInstance();
        printQueue.addJob(job);
        System.out.println("Impressão iniciada para o job: " + job);
    }
}