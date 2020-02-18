
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public String twoOccurrences(String stringa, String stringb) {
        int firstIndex = stringb.indexOf(stringa);
        if (firstIndex == -1) {
            return "false";
        }
        else {
            int secondIndex = stringb.indexOf(stringa, firstIndex+1);
            if (secondIndex == -1) {
                return "false";
            }
            else {
                int thirdIndex = stringb.indexOf(stringa, secondIndex+1);
                if (thirdIndex == -1) {
                    return "true";
                }
                else {
                    return "false";
                }
            }
        }
    }
    
    public void testing() {
        // testing method twoOccurrences
        String results = twoOccurrences("by", "A story by Abby Long");
        System.out.println("The results for twoOccurrences are " + results);
        
        results = twoOccurrences("a", "banana");
        System.out.println("The results for twoOccurrences are " + results);
        
        results = twoOccurrences("atg", "ctgtatgta");
        System.out.println("The results for twoOccurrences are " + results);
        
        // testing method lastPart 
        String resulttwo = lastPart("an", "banana");
        System.out.println("The results for lastPart are " + resulttwo);
        
        resulttwo = lastPart("zoo", "forest");
        System.out.println("The results for lastPart are " + resulttwo);
    }
    
    
    public String lastPart(String stringa, String stringb) {
        int indexa = stringb.indexOf(stringa);
        if (indexa == -1) {
            return stringb;
        }
        else {
            return stringb.substring(indexa, indexa+2);
        }
    }
    
        
    
                
                

}
