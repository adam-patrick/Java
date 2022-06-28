import java.util.ArrayList;

public class Contacts {

    private ArrayList<String> contactList = new ArrayList<String>();

    public int findContact(String searchItem){
        return contactList.indexOf(searchItem);
    }

    public void addContact(String contact){
        int search = findContact(contact);
        if (search < 0){
            contactList.add(contact);
            System.out.println("Contact "+ contact + " has been added to the list");
        } else {
            System.out.println("Contact "+ contact + " is already in the list");
        }

    }

    public ArrayList<String> getContactList(){
        return contactList;
    }

    public void printContactList() {
        System.out.println("You have " + contactList.size() + " contacts in your Contact List");
        for (int i = 0; i < contactList.size(); i++){
            System.out.println((i + 1) + " . " + contactList.get(i));
        }
    }

    public void modifyContactList(String currentContact, String newContact){
        int position = findContact(currentContact);
        if (position >= 0 ){
            contactList.set(position, newContact);
            System.out.println("The contact " + newContact + " has been added to your Contact List");
        }
        else {
            System.out.println("Contact " + currentContact + " is not in the Contact List and cannot be modified.");
        }
    }

    public void removeContact(String contact){
        int position = findContact(contact);
        if (position >= 0 ){
            contactList.remove(position);
        } else {
            System.out.println("Contact " + contact + " is not in the Contact List and cannot be removed.");
        }
    }
}
