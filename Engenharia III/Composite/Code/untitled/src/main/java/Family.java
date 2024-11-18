import java.util.ArrayList;
import java.util.List;

public class Family implements Person {
    private List<Person> members = new ArrayList<>();

    @Override
    public void addRelationship(String type, Person person) {
        members.add(person);
        System.out.println("Adicionado um membro à família com relação: " + type);
    }

    @Override
    public void getDetails() {
        System.out.println("Detalhes da Família:");
        for (Person member : members) {
            member.getDetails();
        }
    }
}