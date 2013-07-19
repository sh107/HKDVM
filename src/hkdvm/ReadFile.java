/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hkdvm;

import au.com.bytecode.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sijin
 */
public class ReadFile {

    public static void main(String[] array) throws FileNotFoundException, IOException {

        String myDirectoryPath = "/hadoopdata/wsc/data";
        //   String myDirectoryPath = "C:\\Users\\Sijin\\Desktop\\data";
        File dir = new File(myDirectoryPath);
        for (File child : dir.listFiles()) {
            // Do something with child
            System.out.println(child.toString());
            String csvFilename = child.toString();//"C:\\Users\\Sijin\\Desktop\\data\\xaa";
            CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
            String[] row = null;
            while ((row = csvReader.readNext()) != null) {

                if (!row[0].trim().equalsIgnoreCase("TRIAL_NAME")) {
                    try {
                        Data d = new Data();
                        d.setTrialName(row[0].trim());
                        d.setGeneSymbol(row[1].trim());
                     //   System.out.println(row[2].trim());
                        d.setPatientId(Integer.parseInt(row[2].trim()));
                        d.setProbeSet(row[3].trim());
                        if (row[4].trim().isEmpty()) {
                            d.setpValue(0);
                        } else {
                            d.setpValue(Double.parseDouble(row[4].trim()));
                        }
                        d.setSubjectId(row[5].trim());
                        d.setRawIntensity(Double.parseDouble(row[6].trim()));
                        d.setLogIntensity(Double.parseDouble(row[7].trim()));
                        d.setzScore(Double.parseDouble(row[11].trim()));
                        //   System.out.println(row[0] + " # " + row[1] + " # " + row[2] + " # " + row[3] + " # " + row[4] + " # " + row[5] + " # " + row[6] + " # " + row[7] + " #  " + row[11]);
                        ConnectDB db = new ConnectDB();
                        db.readDataBase(d);
                    } catch (Exception ex) {
                        Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

            csvReader.close();

        }

    }
}
