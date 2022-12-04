package CreateNewFolder;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class NewFolder {
    public static void main(String[] args) {
        String dataChanges;
        Date currentDate = new Date();
        dataChanges = new SimpleDateFormat("dd-MM-yyyy").format (currentDate);



        File folder = new File("C:\\Users\\mmmss\\OneDrive\\Рабочий стол\\java java\\" + dataChanges);
        if (!folder.exists()) {
            folder.mkdir();
        }

    }


}
