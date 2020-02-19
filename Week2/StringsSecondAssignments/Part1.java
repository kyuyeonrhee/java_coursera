
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
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
    
    public void testFindStopCodon(){
        //            01234567890123456789012345
        String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";
        int dex = findStopCodon(dna, 0, "TAA");
        if (dex != 9) System.out.println("error on 9");
        dex = findStopCodon(dna, 9, "TAA");
        if (dex != 21) System.out.println("error on 21");
        dex = findStopCodon(dna, 1, "TAA");
        if (dex != -1) System.out.println("error on 26");
        dex = findStopCodon(dna, 0, "TAG");
        if (dex != -1) System.out.println("error on 26 TAG");
        System.out.println("tests finished");
    }
    
    public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1){
            return "";
        }
        
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        int temp = Math.min(taaIndex, tagIndex);
        int minIndex = Math.min(tgaIndex, temp);
        
        if (minIndex == dna.length()){
            return "";
        }
        
        return dna.substring(startIndex, minIndex+3);
    }
    
    public void testFindGene() {
        //              012345678901234567890123456789
        String dna = "xxxyyTGAyzzzTAGxxxyyyTAAzzz";
        String gene = findGene(dna); //none
        System.out.println("first trial: " + dna);
        if (gene.length() > 0) {
            System.out.println(gene);
        }
        else{
            System.out.println("");
        }     
        
        dna = "xxxyyyATGzzzxxTGAxyyyzzz";
        gene = findGene(dna); // none
        System.out.println("second trial: " +dna);
        if (gene.length() > 0) {
            System.out.println(gene);
        }
        else{
            System.out.println("");
        }
        
        dna = "xxxATGyyyzzTAGzxxxTGAyyyTAAzzz";
        gene = findGene(dna); // ATGyyyzzTAGzxxxTGA
        System.out.println("third trial: " +dna);
        if (gene.length() > 0) {
            System.out.println(gene);
        }
        else{
            System.out.println("");
        }
        
        dna = "xxxyyyATGzzzTAAxxxyyyTGAzzz";
        gene = findGene(dna); // ATGzzzTAA
        System.out.println("fourth trial: " +dna);
        if (gene.length() > 0) {
            System.out.println(gene);
        }
        else{
            System.out.println("");
        }
        
        dna = "xxxyyyzzzATGxxxyyTAAyzzz";
        gene = findGene("fifth trial: " +dna);
        System.out.println(dna); // none
        if (gene.length() > 0) {
            System.out.println(gene);
        }
        else{
            System.out.println("");
        }
    }
    
    public void printAllGenes(String dna) {
        int startIndex = 0;
        
        // Repeat the following steps
        while (true) {
            // Find the next gene after startIndex
            String currentGene = findGene(dna);
            // If no gene was found, leave this loop
            if (currentGene.isEmpty()) {
                break;
            }
            // Print that gene out
            System.out.println(currentGene);
            // Set startIndex to just past the end of the gene
            startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
            }
    }
}

