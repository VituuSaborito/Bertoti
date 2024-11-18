public class Main {
    public static void main(String[] args) {
        Individual person1 = new Individual("Alice", "01/01/1990");
        Individual person2 = new Individual("Bob", "05/05/1985");

        Family family = new Family();
        family.addRelationship("Pai", person1);
        family.addRelationship("Mãe", person2);

        GenealogyTree tree = new GenealogyTree();
        tree.addRelationship(family);

        tree.getTreeDetails();
    }
}