package game;

import java.awt.Color;
import desktop_fields.Street;
import desktop_resources.GUI;

public class Fields {

    public Fields() {

        desktop_fields.Field[] fields = new desktop_fields.Field[21];


        fields[0] = new Street.Builder()
                .setTitle("Start")
                .setSubText("1")
                .setBgColor(Color.WHITE)
                .build();

        fields[1] = new Street.Builder()
                .setTitle("Tribe Encampment")
                .setDescription("Territory")
                .setRent("100")
                .setSubText("1")
                .setBgColor(Color.YELLOW)
                .build();
        
        fields[2] = new Street.Builder()
                .setTitle("Crater")
                .setDescription("Territory")
                .setRent("300")
                .setSubText("2")
                .setBgColor(Color.YELLOW)
                .build();
        
        fields[3] = new Street.Builder()
                .setTitle("Mountain")
                .setDescription("Territory")
                .setRent("500")
                .setSubText("3")
                .setBgColor(Color.YELLOW)
                .build();
        
        fields[4] = new Street.Builder()
                .setTitle("Cold Desert")
                .setDescription("Territory")
                .setRent("700")
                .setSubText("4")
                .setBgColor(Color.YELLOW)
                .build();
        
        fields[5] = new Street.Builder()
                .setTitle("Black cave")
                .setDescription("Territory")
                .setRent("1000")
                .setSubText("5")
                .setBgColor(Color.YELLOW)
                .build();
        
        fields[6] = new Street.Builder()
                .setTitle("The Werewall")
                .setDescription("Territory")
                .setRent("1300")
                .setSubText("6")
                .setBgColor(Color.YELLOW)
                .build();
        
        fields[7] = new Street.Builder()
                .setTitle("Mountain village")
                .setDescription("Territory")
                .setRent("1600")
                .setSubText("7")
                .setBgColor(Color.YELLOW)
                .build();
        
        fields[8] = new Street.Builder()
                .setTitle("South Citadel")
                .setDescription("Territory")
                .setRent("2000")
                .setSubText("8")
                .setBgColor(Color.YELLOW)
                .build();
        
        fields[9] = new Street.Builder()
                .setTitle("Palace gates")
                .setDescription("Territory")
                .setRent("2600")
                .setSubText("9")
                .setBgColor(Color.YELLOW)
                .build();
        
        fields[10] = new Street.Builder()
                .setTitle("Tower")
                .setDescription("Territory")
                .setRent("3200")
                .setSubText("10")
                .setBgColor(Color.YELLOW)
                .build();
        
        fields[11] = new Street.Builder()
                .setTitle("Castle")
                .setDescription("Territory")
                .setRent("4000")
                .setSubText("11")
                .setBgColor(Color.YELLOW)
                .build();
        
        fields[12] = new Street.Builder()
                .setTitle("Walled City")
                .setDescription("Refuge")
                .setRent("")
                .setSubText("12")
                .setBgColor(Color.BLUE)
                .build();
        
        fields[13] = new Street.Builder()
                .setTitle("Monastery")
                .setDescription("Refuge")
                .setRent("")
                .setSubText("13")
                .setBgColor(Color.BLUE)
                .build();
        
        fields[14] = new Street.Builder()
                .setTitle("Huts in the mountain")
                .setDescription("Labor camp")
                .setRent("")
                .setSubText("14")
                .setBgColor(Color.GREEN)
                .build();
        
        fields[15] = new Street.Builder()
                .setTitle("The pit")
                .setDescription("Labor camp")
                .setRent("")
                .setSubText("15")
                .setBgColor(Color.GREEN)
                .build();
        
        fields[16] = new Street.Builder()
                .setTitle("Goldmine")
                .setDescription("Tax")
                .setRent("")
                .setSubText("16")
                .setBgColor(Color.ORANGE)
                .build();
        
        fields[17] = new Street.Builder()
                .setTitle("Caravan")
                .setDescription("Tax")
                .setRent("")
                .setSubText("17")
                .setBgColor(Color.ORANGE)
                .build();
        
        fields[18] = new Street.Builder()
                .setTitle("Second sail")
                .setDescription("Fleet")
                .setRent("")
                .setSubText("18")
                .setBgColor(Color.RED)
                .build();
        
        fields[19] = new Street.Builder()
                .setTitle("Sea Grover")
                .setDescription("Fleet")
                .setRent("")
                .setSubText("19")
                .setBgColor(Color.RED)
                .build();
        
        fields[20] = new Street.Builder()
                .setTitle("The Buccaneers")
                .setDescription("Fleet")
                .setRent("")
                .setSubText("20")
                .setBgColor(Color.RED)
                .build();
        
        fields[21] = new Street.Builder()
                .setTitle("Privateer armade")
                .setDescription("Fleet")
                .setRent("")
                .setSubText("21")
                .setBgColor(Color.RED)
                .build();

        

        GUI.create(fields);


    }
}
