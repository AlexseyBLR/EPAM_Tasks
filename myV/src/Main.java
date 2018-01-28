import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Main main = new Main();
        //main.print(main.fileReader());
        System.out.println(null instanceof Main);
    }

    public List<String> fileReader() throws FileNotFoundException {
        File file = new File("E:\\EPAM_Tasks\\Task_01\\jwd-task01-template\\src\\main\\resources\\appliances_db.txt");
        Scanner reader = new Scanner(file);
        List<String> list = new ArrayList<>();
        while (reader.hasNextLine()) {
            String str = reader.nextLine();
            String[] stringArr = str.split(" ");
            for (int i = 0; i < stringArr.length; i++) {
                list.add(stringArr[i]);
            }
        }
        return list;

    }

    public void print(List<String> list){
        for (int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }


}
