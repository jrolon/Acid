package utilities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static utilities.LoggerHandler.logType.ERROR;
import static utilities.LoggerHandler.registerInfo;
import static utilities.constants.GeneralConstants.CONSTANT_CLASS;

public class CSVHandler {

    /**
     * Description: Loads a CSV file based on the submitted path
     * Date: 19/05/2023
     *
     * @author danielazuluaga
     * ChangeLog:
     */
    public static List<Map<String, String>> loadAllCSV(String csvPath) {
        List<Map<String, String>> listOfData = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(csvPath, StandardCharsets.UTF_8))) {
            List<String[]> allData = csvReader.readAll();
            String[] headers = allData.get(0);
            headers = headers[0].split(";");
            allData.remove(0);

            for (String[] row : allData) {
                String[] values = row[0].split(";");
                Map<String, String> dataMap = new HashMap<>();

                for (int i = 0; i <= headers.length - 1; i++) {
                    dataMap.put(headers[i], values[i]);
                }
                listOfData.add(dataMap);
            }
        } catch (IOException | CsvException e) {
            registerInfo(CSVHandler.class, ERROR, "CSV file could not be loaded");
        }
        return listOfData;
    }

    /**
     * Description: Loads a CSV file based on the submitted path and a condition related to the submitted column
     * Date: 19/05/2023
     *
     * @author danielazuluaga
     * ChangeLog:
     */
    public static List<Map<String, String>> loadCSVWithCondition(String csvPath, String parameter) {
        List<Map<String, String>> listOfData = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(csvPath, StandardCharsets.UTF_8))) {
            List<String[]> allData = csvReader.readAll();
            String[] headers = allData.get(0);
            headers = headers[0].split(";");
            allData.remove(0);

            for (String[] row : allData) {
                String[] values = row[0].split(";");
                Map<String, String> dataMap = new HashMap<>();

                for (int i = 0; i <= headers.length - 1; i++) {
                    if (Objects.equals(values[i], parameter)) {
                        for (int j = 0; j <= headers.length - 1; j++) {
                            dataMap.put(headers[j], values[j]);
                        }
                    }
                }
                if (dataMap.size() != 0) {
                    listOfData.add(dataMap);
                } else {
                    registerInfo(CSVHandler.class, ERROR, "It was not possible to find data according to the condition");
                }
            }
        } catch (IOException | CsvException e) {
            registerInfo(CSVHandler.class, ERROR, "CSV file could not be loaded");
        }
        return listOfData;
    }

    private CSVHandler() {
        throw new IllegalStateException(CONSTANT_CLASS);
    }
}
