/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hkdvm;

import au.com.bytecode.opencsv.CSVReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sijin
 */
public class ParseFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String myDirectoryPath = "C:\\Users\\Sijin\\Desktop\\data\\raw";
        //   String myDirectoryPath = "C:\\Users\\Sijin\\Desktop\\data";
        int number = 0;
        File dir = new File(myDirectoryPath);
        for (File child : dir.listFiles()) {
            // Do something with child
            number++;
            System.out.println(child.toString());
            String csvFilename = child.toString();//"C:\\Users\\Sijin\\Desktop\\data\\xaa";
            CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
            String[] row = null;

            File file = new File("D:\\data\\modified1\\" + number + ".csv");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            while ((row = csvReader.readNext()) != null) {

                if (!row[0].trim().equalsIgnoreCase("TRIAL_NAME")) {
                    try {

                    bw.write(row[0].trim());
                    bw.write(",");
                    bw.write(row[1].trim());
                    bw.write(",");
                    bw.write(row[2].trim());
                    bw.write(",");
                    bw.write(row[3].trim());
                    bw.write(",");
                    bw.write(row[4].trim());
                    bw.write(",");
                    bw.write(row[5].trim());
                    bw.write(",");
                    bw.write(row[6].trim());
                    bw.write(",");
                    bw.write(row[7].trim());
                    bw.write(",");
                    bw.write(row[8].trim());
                    bw.write(",");
                    bw.write(row[9].trim());
                    bw.write(",");
                    bw.write(row[10].trim());
                    bw.write(",");
                    bw.write(row[11].trim());
                    bw.write("\n");

                    } catch (Exception ex) {
                        Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

            bw.close();
            csvReader.close();

        }
    }
}
