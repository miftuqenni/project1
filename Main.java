public class Main {
    public static void main(String[] args) {
        Person person = new Person("mifta",23,true);
        System.out.println(person.getCorrectName());

        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.getCorrectName());

        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.getCorrectName());
    }
}