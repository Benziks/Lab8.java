package Classes;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;



public class Java_JSON {


    public static void serCircleJson(List_of_Circles list_of_circles) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("./src/Circles&Cilinders_JSON/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() +"1.json"),  list_of_circles);


    }

    public static List_of_Circles desCirceleJSON() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(Objects.requireNonNull(new File("./src/Circles&Cilinders_JSON").listFiles())[Objects.requireNonNull(new File("./src/Circles&Cilinders_JSON").listFiles()).length-1],List_of_Circles.class);
    }

    public static void serCilinderJSON(List_of_Cilinders list_of_cilinders) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("./src/Circles&Cilinders_JSON/" + LocalDate.now() + "," + LocalDateTime.now().getHour() + "," + LocalDateTime.now().getMinute() + "," + LocalDateTime.now().getSecond() +"0.json"), list_of_cilinders);

    }

    public static List_of_Cilinders desCilinderJSON() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(Objects.requireNonNull(new File("./src/Circles&Cilinders_JSON").listFiles())[Objects.requireNonNull(new File("./src/DCircles&Cilinders_JSON").listFiles()).length-2], List_of_Cilinders.class);
    }



}
