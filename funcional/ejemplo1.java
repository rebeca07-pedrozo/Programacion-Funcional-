import java.util.LinkedList;
import java.util.List;

public class ejemplo1 {
    public static void main(String [] args){
        List<String> sierEmail = new LinkedList<>();
        sierEmail.add("sier@sier.com");

        MutablePerson sier = new MutablePerson();
        sier.setEmails(sierEmail);
        sier.setFirstName("Israel");
        sier.setFirstName("Sergio");

        System.out.pritnln(sier);
        badFuction(sier);
        System.out.println(sier);

        System.out.println("//////////////");
        MutablePerso_2 sinuhe = new MutablePerson_2(sierEmail);
        System.out.println(sinuhe);
        otherBadFunction(sinuhe);
        System.out.println(sinuhe);

    }

}
