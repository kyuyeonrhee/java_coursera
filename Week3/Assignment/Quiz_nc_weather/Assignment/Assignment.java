import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;

public class Assignment {
    public CSVRecord coldestHourInFile (CSVParser parser) {
        // start with coldestSoFar as nothing
        CSVRecord coldestSoFar = null;
        // for each row (currentRow) in the CSV File
        for (CSVRecord currentRow : parser) {
            // if coldestSoFar is nothing
            if (coldestSoFar == null) {
                coldestSoFar = currentRow;
            }
            else {
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double coldestTemp = Double.parseDouble(coldestSoFar.get("TemperatureF"));
                // check if currentRow's temperature > coldestSoFar's temperature
                if (coldestTemp > currentTemp) {
                    // if so, update coldestTemp to currentRow
                    coldestSoFar = currentRow; 
                }
            }
        }
        // coldestSoFar is the answer
        return coldestSoFar;
    }
    
    public void testColdestHourInFile() {
        FileResource fr = new FileResource();
        CSVRecord coldest = coldestHourInFile(fr.getCSVParser());
        System.out.println("coldest temperature was " + coldest.get("TemperatureF") + " at " + coldest.get("TimeEDT"));
    }
    
    
        public CSVRecord lowestHumidityInFile (CSVParser parser) {
        // start with lowestHumidity as nothing
        CSVRecord lowestSoFar = null;
        // for each row (currentRow) in the CSV File
        for (CSVRecord currentRow : parser) {
            // if lowestSoFar is nothing
            if (lowestSoFar == null) {
                lowestSoFar = currentRow;
            }
            else {
                try {
                double currentHum = Double.parseDouble(currentRow.get("Humidity"));
                double lowestHum = Double.parseDouble(lowestSoFar.get("Humidity"));
                // check if currentRow's humidity > lowestSoFar's humidity
                if (lowestHum > currentHum) {
                    // if so, update lowestHum to currentRow
                    lowestSoFar = currentRow;
                }
                }
                catch(Exception e) {
                    System.out.println("");
                }    
            }
        }
        return lowestSoFar;
    }
    
    public void testLowestHumidityInFile() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        CSVRecord lowest = lowestHumidityInFile(parser);
        System.out.println("Lowest Humidity was " + lowest.get("Humidity") + " at " + lowest.get("DateUTC"));
    }
    
    
    public CSVRecord fileWithColdestTemperature () {
        CSVRecord coldestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        // iterate over files
        
        for (File f: dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            // use method to get coldest in file
            CSVRecord currentRow = coldestHourInFile(fr.getCSVParser());
            if (coldestSoFar == null) {
                coldestSoFar = currentRow;
            }
            else {
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double coldestTemp = Double.parseDouble(coldestSoFar.get("TemperatureF"));
                if ((currentTemp != -9999) && (coldestTemp > currentTemp)) {
                    coldestSoFar = currentRow;
                }
            }
        }
        return coldestSoFar;
    }
    
    public void testFileWithColdestTemperature() {
        CSVRecord coldest = fileWithColdestTemperature();
        System.out.println("Coldest Temperature was " + coldest.get("TemperatureF") + " at " + coldest.get("DateUTC"));
    }
    
    
    public CSVRecord lowestHumidityInManyFiles (){
        CSVRecord lowestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        // iterate over files
        
        for (File f: dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            // use method to get largest in file
            CSVRecord currentRow = lowestHumidityInFile(fr.getCSVParser());
            if (lowestSoFar == null) {
                lowestSoFar = currentRow;
            }
            else {
                double currentHum = Double.parseDouble(currentRow.get("Humidity"));
                double lowestHum = Double.parseDouble(lowestSoFar.get("Humidity"));
                if (lowestHum > currentHum) {
                    lowestSoFar = currentRow;
                }
            }    
        }
        
        //String Humidity = lowestSoFar.get("Humidity");
        //System.out.println("Lowest Humidity was " + Humidity + " at " + lowestSoFar.get("DateUTC"));
        return lowestSoFar;
    }
    
    public void testLowestHumidityInManyFiles() {
        CSVRecord lowest = lowestHumidityInManyFiles();
        System.out.println("lowest humidity was " + lowest.get("Humidity") + " at " + lowest.get("DateUTC"));
    }
    
    
    public double averageTemperatureInFile (CSVParser parser) {
        double sum = 0;
        double n = 0;
        
        // for each row (currentRow) in the CSV File
        for (CSVRecord currentRow: parser) {
            // add 1 to n (number of rows)
            n ++;
            // add current temperature to sum (sum of temperatures)
            double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
            sum = sum + currentTemp;
        }
        
        double avgTemp = sum/n;
        return avgTemp;
    }
    
    public void testAverageTemperatureInFile() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        double avg = averageTemperatureInFile(parser);
        System.out.println("Average temperature in file is " + avg);
    }
    
    
    public double averageTemperatureWithHighHumidityInFile (CSVParser parser, int value) {
        double sum = 0;
        double n = 0;

        for (CSVRecord currentRow: parser) {
            double currentHum = Double.parseDouble(currentRow.get("Humidity"));
            if (currentHum >= value) {
                // add 1 to n
                n ++;
                // add current temperature to sum
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                sum = sum + currentTemp;
            }
        }
        double avgTemp = sum/n;
        return avgTemp;
    }
    
    public void testAverageTemperatureWithHighHumidityInFile() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        double avg = averageTemperatureWithHighHumidityInFile(parser, 80);
        System.out.println("Average Temp when high Humidity is " + avg);
    }
    
    

    
    

}
