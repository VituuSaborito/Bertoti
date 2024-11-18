import java.util.ArrayList;
import java.util.List;

public class GenealogyTree {
    private List<Family> families = new ArrayList<>();

    public void addRelationship(Family family) {
        families.add(family);
        System.out.println("Família adicionada à árvore genealógica.");
    }

    public void getTreeDetails() {
        System.out.println("Detalhes da Árvore Genealógica:");
        for (Family family : families) {
            family.getDetails();
        }
    }
}