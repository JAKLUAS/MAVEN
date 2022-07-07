package utilites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CVSReader {

    public static Object[][] readFromCSV(String str) {
        List<String[]> result = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(str));

            String strConv;

            while ((strConv = br.readLine()) != null) {
                String[] eachrow = strConv.split(",");
                result.add(eachrow);
            }

        } catch (IOException e) {
            System.out.println("Exception");
        }


        int rowNo = result.size();
        int colNo = result.get(0).length;

        Object[][] objArr = new Object[rowNo][colNo];

        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = result.get(i);
        }


        return objArr;


    }

//    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(readFromCSV("src/test/resources/data2.csv")));
//
//    }
}