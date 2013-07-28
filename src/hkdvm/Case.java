/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hkdvm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sijin
 */
public class Case {

    public String getCase(int number) {

        String content = "";

        BufferedReader br = null;

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("query/case"+ number +".txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                content += sCurrentLine.trim() + " ";
               // System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


        return content;
    }

    public String case1() {

        return getCase(1);
    }

    public String case2() {

        return getCase(2);
    }

    public String case3() {

        return getCase(3);
    }

    public String case4() {

        return getCase(4);
    }

    public String case5() {

        return getCase(5);
    }

    public String case6() {

        return getCase(6);
    }

    public static void main(String[] args){

        Case c = new Case();
        c.case1();

    }
}
