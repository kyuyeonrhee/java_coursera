
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public String findSimpleGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if (stopIndex == -1) {
            return "";
        }
        if ((stopIndex - startIndex) % 3 == 0) {
            return dna.substring(startIndex, stopIndex+3);
        }
        else {
            return "";
        }
    }
    
    public void testSimpleGene() {
        String dna = "UEWONJFNGJKSDFTAAOENGFJJSD";
        System.out.println("DNA Strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "IOWRNDNKJDNATGDGNIWSD";
        System.out.println("DNA Strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);

        dna = "UWENSKDJNFWELJNTGFKGB";
        System.out.println("DNA Strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);

        dna = "WEFREGREVSDATGWEFGSDFDFSDETAA";
        System.out.println("DNA Strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);

        dna = "SDFATGDSFHSDFXVXCVDTAASDGFDHC";
        System.out.println("DNA Strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
    }
}


