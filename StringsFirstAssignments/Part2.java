
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        // 전부 대문자로 바꿔주기
        String DNA = dna.toUpperCase();
        String StartCodon = startCodon.toUpperCase();
        String StopCodon = stopCodon.toUpperCase();
        
        // 이전과 비슷
        int StartIndex = dna.indexOf(StartCodon);
        if (StartIndex == -1) {
            return "";
        }
        int StopIndex = dna.indexOf(StopCodon, StartIndex+3);
        if (StopIndex == -1) {
            return "";
        }
        
        if ((StopIndex - StartIndex) % 3 ==0) {
            return DNA.substring(StartIndex, StopIndex+3);
        }
        else {
            return "";
        }
    }
}
