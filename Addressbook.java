import java.util.ArrayList;

public class Addressbook {

    public ArrayList<Phonebook> pb = new ArrayList<>();

    public void addressbook(){
        pb.add(new Phonebook("Иванов Иван Иванович", "8 923 456 0001", "Иваново"));
        pb.add(new Phonebook("Сидоров Сидор Сидорович", "8 923 456 0002", "Москва"));
        pb.add(new Phonebook("Петров Петр Петрович", "8 923 456 0003", "Курск"));

    }

    public void showPhoneBook(){
        for (Phonebook phonebook : pb) {
            System.out.println(phonebook.toString());
        }
    }

}
