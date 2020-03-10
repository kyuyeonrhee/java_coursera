
public class Mystery {
  public String mystery(String dna) {
      int pos = dna.indexOf("T");
      int count = 0;
      int startPos = 0;
      String newDna = "";
      if (pos == -1) {
          return dna;
        }
        while (count < 3) {
            count += 1;
            newDna = newDna + dna.substring(startPos,pos);
            startPos = pos+1;
            pos = dna.indexOf("T", startPos);
            if (pos == -1) {
                break;
            }
        }
        newDna = newDna + dna.substring(startPos);
        return newDna;
    }
    
  public void test(){
      //              V   V   V   V   V
      String t1 = "ABCTABCTABCTABCTABCT";
      //                           V
      String t2 = "ABCDABCDABCDABCDT";
      //            VVV
      String t3 = "ATTTBCDBCDBCDBCD";
      
      System.out.println(mystery(t1));
      System.out.println(mystery(t2));
      System.out.println(mystery(t3));
    }
    

}
