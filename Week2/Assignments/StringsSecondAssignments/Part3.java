
public class Part3 {
    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int currIndex = dna.indexOf(stopCodon, startIndex+3);
        while (currIndex != -1) {
            int diff = currIndex - startIndex;
            if (diff % 3 == 0) {
                return currIndex;
            }
            else{
                currIndex = dna.indexOf(stopCodon, currIndex+1);
            }
        }
        return dna.length();
    }
    
    public int countGenes(String dna){
        int n = 0;
        int startIndex = dna.indexOf("ATG");
        while (startIndex != -1) {
            n++;
            int taaIndex = findStopCodon(dna, startIndex, "TAA");
            int tagIndex = findStopCodon(dna, startIndex, "TAG");
            int tgaIndex = findStopCodon(dna, startIndex, "TGA");
            int temp = Math.min(taaIndex, tagIndex);
            int minIndex = Math.min(temp, tgaIndex);

            if (minIndex == dna.length()){
                return 0;
            }
            startIndex = dna.indexOf("ATG", minIndex + 3);
        }
        
        return n;
    }
    
    public void testcountGenes() {
        String dna = "ATGTAAGATGCCCTAGT";
        int answer = countGenes(dna);
        System.out.println("gene appears " + answer + " times.");
    }
    
}
