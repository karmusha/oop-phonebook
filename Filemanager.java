import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Filemanager {
    
    String filePath = "./";
    String fileNameExport = "export.csv";
    String pathName = filePath + "import.csv";

    PhonebookView view = new PhonebookView();

    public void exportFile (ArrayList<Phonebook> pb){
        try(FileWriter writer = new FileWriter(filePath+fileNameExport, false)){
            for (Phonebook phonebook : pb) {
                String text = phonebook.getName()+";"+phonebook.getPhone()+";"+phonebook.getCity();
                // запись всей строки
                writer.write(text);

                // запись по символам
                writer.append("\n");
            }
            writer.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        view.viewPhonebookInConsole(pb);
    }

    public void importFile (ArrayList<Phonebook> pb){
        try {
            File file = new File(pathName);
            FileReader fr = new FileReader (file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null){
                // System.out.println(line);
                String[] temp = line.split(";");
                pb.add(new Phonebook(temp[0], temp[1], temp[2]));
                line = reader.readLine();
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        view.viewPhonebookInConsole(pb);
    }
}
