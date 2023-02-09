import java.util.Scanner;

public class Menu {
    public static void mainMenu(){

        try(Scanner scanner = new Scanner(System.in, "UTF-8")) {

            Filemanager fm = new Filemanager();
            Addressbook phones = new Addressbook();


            boolean state = true;
            while(state == true) {
                System.out.println("Выберите действие: ");
                System.out.println("0 - завершить работу");
                System.out.println("1 - отобразить справочник");
                System.out.println("2 - выгрузить данные в файл");
                System.out.println("3 - загрузить данные из файла");

                System.out.print("Введите номер: ");

                int number = Integer.parseInt(scanner.nextLine());
                switch(number) {
                    case 0:
                        state = false;
                        break;
                    case 1:
                        phones.addressbook();
                        phones.showPhoneBook();
                        break;
                    case 2:
                        phones.addressbook();
                        fm.exportFile(phones.pb);
                        System.out.println("Export ok.");
                        break;
                    case 3:
                        phones.addressbook();
                        fm.importFile(phones.pb);
                        break;
                    default:
                        System.out.println("Такого фильтра нет, попробуйте еще раз");
                        break;
                }
            }
            System.out.println("Спасибо за работу. До свидания!");
        }
    }
}