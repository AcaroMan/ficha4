package pt.ipleiria.estg.dei.esoft;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
public class ContactsManager {
    private List<Contact> contacts;
    private HashMap<String, List<Contact>> labels;
    public ContactsManager() {
        contacts = new LinkedList<>();
        labels = new HashMap<>(200);
    }
    public List<String> getLabels() {
        // TODO return all the labels

        for(HashMap.Entry<String, List<Contact> >  entry: labels.entrySet()) {
            entry.getValue();
        }
    }
    public List<Contact> getContacts(String... labels) {
        // TODO get contacts in labels or all ...

        for (:
             ) {

        }
    }
    public List<Contact> search(String term, String... labels) {
        // TODO search for contacts with term, and also in specific labels
    }
    public void addContact(Contact contact, String... labels) {
        // TODO add contact and associate it with the labels, if any
        // DO NOT ALLOW TO ADD DUPLICATED CONTACTS (same phone and/or email)
    }
    public void removeContact(Contact contact) {
        // TODO remove the contact
    }
    public int size() {
        return contacts.size();
    }
}