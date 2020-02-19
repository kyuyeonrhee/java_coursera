

public class Part2 {
    public int howMany(String stringa, String stringb) {
        int startIndex = 0;
        int n = 0;
        startIndex = stringb.indexOf(stringa);
        while (startIndex != -1){
            n++;
            startIndex = stringb.indexOf(stringa, startIndex + stringa.length());            
        }
        return n;        
    }
    
    public void testHowMany() {
        String stringa = "GAA";
        String stringb = "ATGAACGAATTGAATC";
        int answer = howMany(stringa, stringb);
        System.out.println(stringa + " appears " + answer + " times.");
        
        stringa = "a";
        stringb = "banana";
        answer = howMany(stringa, stringb);
        System.out.println(stringa + " appears " + answer + " times.");
        
        stringa = "by";
        stringb = "A story by Abby Long";
        answer = howMany(stringa, stringb);
        System.out.println(stringa + " appears " + answer + " times.");
    }
}   
