import java.lang.classfile.instruction.SwitchCase;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


void main() {
    List<Person> register = new ArrayList<>();

    register.add(new Person("Anna", 1990));
    register.add(new Person("Berit", 1955));
    register.add(new Person("Carl", 2005));
    register.add(new Person("David", 1982));

    String val;
    IO.println("""
            1. Lägg till
            2. Söka
            3. Ta bort
            """);
    val = IO.readln();
    switch (val) {
        case "1":
            IO.println("Namn: ");
            String namn = IO.readln();

            IO.println("Född");
            int född = Integer.parseInt(IO.readln());

            Person nyPerson = new Person(namn, född);
            register.add(nyPerson);
            break;
        case "2":
                IO.println("Namn att söka efter");
                String sökNamn = IO.readln();

                boolean hittad = false;

                for(Person p : register){
                    if (p.getNamn().equalsIgnoreCase(sökNamn)) {
                        IO.println("Person hittad: "+p);
                        hittad = true;
                    }
                }
                if (!hittad) {
                    IO.println("ingen person hittades med det namnet hittades");
                }

        case "3":
            IO.println("Säg den personen du vill ta bort");
            String tabortnamn=IO.readln();

            Iterator<Person> it = register.iterator();

            while (it.hasNext()) {
                Person p = it.next();
                if (p.getNamn().equalsIgnoreCase(tabortnamn)) {
                    it.remove();
                    IO.println(tabortnamn+" Har tagits bort from register");
                }
            }
            break;
        default:
            break;
    }
}
