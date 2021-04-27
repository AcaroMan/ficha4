package pt.ipleiria.estg.dei.esoft.tests;
import org.junit.jupiter.api.Test;
import pt.ipleiria.estg.dei.esoft.managers.ContactsManager;
import pt.ipleiria.estg.dei.esoft.models.Contact;

import static org.junit.jupiter.api.Assertions.*;
public class ContactsManagerTesteCase {
    @Test
    public void testConstructor(){
        var cm = new ContactsManager();

        assertEquals("alguma coisa",cm.toString());
    }
    @Test
    public void testarAdicionarContacto(){
        var cm = new ContactsManager();
        var c1= new Contact("Carlos","1234567");
        var c2= new Contact("Carlos","1234567");
        cm.addContact(c1);
        cm.addContact(c2);
        assertEquals(1,cm.size());
    }

    @Test
    public void testarAdicionarContacto2(){
        var cm = new ContactsManager();
        var c1= new Contact("Carlos","1234567");
        try {
                cm.addContact(c1);
            }catch (Exception e){

        }
        assertEquals(1,cm.size());
        var c2= new Contact("Cona","1234567");
        assertThrows(Exception.class,() ->{
            cm.addContact(c2);
        });
        assertEquals(1,cm.size());
    }


}
