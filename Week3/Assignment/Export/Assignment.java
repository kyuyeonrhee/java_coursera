
import edu.duke.*;
import org.apache.commons.csv.*;

public class Assignment {
    public void countryInfo (CSVParser parser, String country) {
        for (CSVRecord record: parser) {
            if (record.get("Country").equals(country)) {
                String export = record.get("Exports");
                String value = record.get("Value (dollars)");// do something
                
                if ((export.length() > 0) && (value.length() > 0)){
                    System.out.println(country + ": " + export + ": " + value);
                }   
            }
            else {
                System.out.println("NOT FOUND");
            }
        }
    }

    
    public void listExportersTwoProducts (CSVParser parser, String exportItem1, String exportItem2){
        for (CSVRecord record: parser) {
            String export = record.get("Exports");
            
            if (export.contains(exportItem1) && export.contains(exportItem2)) {
                String country = record.get("Country");
                System.out.println(country);
                }                
            }            
        }
        
    public int numberOfExporters (CSVParser parser, String exportItem) {
        int n = 0;
        for (CSVRecord record: parser) {
            String export = record.get("Exports");
            //System.out.println(export);
            if (export.contains(exportItem)) {
                n += 1;
            }
        }
        return n;
    }
    
    public void bigExporters (CSVParser parser, String amount) {
        for (CSVRecord record: parser) {
            if (record.get("Value (dollars)").length() > amount.length()) {
                String country = record.get("Country");
                String dollar = record.get("Value (dollars)");
                System.out.println(country + " " + dollar);
            }
            }
        }
        
        
    public void tester() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        countryInfo(parser, "Germany");
        parser = fr.getCSVParser();
        listExportersTwoProducts(parser, "cotton", "flowers");
        parser = fr.getCSVParser();
        System.out.println(numberOfExporters(parser, "cocoa"));
        parser = fr.getCSVParser();
        bigExporters(parser, "$999,999,999,999");
    }
    

}
