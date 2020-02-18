import edu.duke.*;

public class Part4 {
    public String StringsFirstAssignments(String url) {
        URLResource file = new URLResource(url);
        for (String item : file.words()) {
            // print or process s
                String itemLower = item.toLowerCase();
                int pos = itemLower.indexOf("youtube.com");
                if (pos != -1) {
                    int beg = item.lastIndexOf("\"", pos);
                    int end = item.indexOf("\"", pos+1);
                    System.out.println(item.substring(beg+1, end));
                }
            }
        }
    }
    
