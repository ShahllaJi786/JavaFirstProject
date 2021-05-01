package thirdpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ApartmentReadingText {

    public static void main(String[] args) {


        String temporaryApartment;
        String finalApartment = "";


        FileReader fileReader;

        {
            try {
                fileReader = new FileReader("src/thirdpackage/apartment.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((temporaryApartment = bufferedReader.readLine()) != null) {
                    finalApartment = finalApartment + "\n"+ temporaryApartment;
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(finalApartment);
        }
    }

}
