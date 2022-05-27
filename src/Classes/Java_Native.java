package Classes;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;


public class Java_Native {

    public static void saveCircle(List_of_Circles list_of_circles) {
        try {
            FileOutputStream fileOut = new FileOutputStream("./src/Circles&Triangles/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(list_of_circles);
            out.close();
            fileOut.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static List_of_Circles loadCircle() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/Circles&Triangles").listFiles())[Objects.requireNonNull(new File("./src/Circles&Triangles").listFiles()).length-1]);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List_of_Circles  list_of_circles = (List_of_Circles) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return  list_of_circles;
    }


    public static void saveCilinder(List_of_Cilinders list_of_cilinders) {
        try {

            FileOutputStream fileOut = new FileOutputStream("./src/Circles&Triangles/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + ".t");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(list_of_cilinders);
            out.close();
            fileOut.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static List_of_Cilinders loadCilinder() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/Circles&Triangles").listFiles())[Objects.requireNonNull(new File("./src/Circles&Triangles").listFiles()).length-2]);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List_of_Cilinders list_of_cilinders = (List_of_Cilinders) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return list_of_cilinders;
    }


}
