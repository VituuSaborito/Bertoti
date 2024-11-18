public class Individual implements Person {
    private String name;
    private String birthDay;

    public Individual(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public void addRelationship(String type, Person person) {
        System.out.println("Não é possível adicionar relações diretas para indivíduos.");
    }

    @Override
    public void getDetails() {
        System.out.println("Nome: " + name + ", Data de nascimento: " + birthDay);
    }
}