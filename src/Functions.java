import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Functions {
    public void openFile(String path) throws FileNotFoundException {
        try {
            File file = new File(path);
            Scanner in = new Scanner(file);
        }catch(FileNotFoundException e){
            throw new FileNotFoundException("Nie znaleziono takiego pliku!");
        }
    }
    public int conversion(String number){
        return Integer.parseInt(number);
    }
}
