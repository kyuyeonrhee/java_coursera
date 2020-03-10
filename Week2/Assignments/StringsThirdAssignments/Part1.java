import edu.duke.*;

public class Part1 {
    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int currIndex = dna.indexOf(stopCodon, startIndex+3);
        while (currIndex != -1) {
            int diff = currIndex - startIndex;
            if (diff % 3 == 0) {
                return currIndex;
            }
            else {
                currIndex = dna.indexOf(stopCodon, currIndex+1);
            }
        }
        return dna.length();
    }
    
    public String findGene(String dna, int where) {
        int startIndex = dna.indexOf("ATG", where);
        if (startIndex == -1){
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        int minIndex = 0;
        
        if (taaIndex == -1 ||
            (tgaIndex != -1 && tgaIndex < taaIndex)) {
                minIndex = tgaIndex;
            }
        else{
            minIndex = taaIndex;
        }
        if (minIndex == -1 ||
            (tagIndex != -1 && tagIndex < minIndex)) {
                minIndex = tagIndex;
        }
        if (minIndex == -1){
            return "";
        }
        return dna.substring(startIndex, minIndex+3);
    }
    
    public StorageResource getAllGenes(String dna) {
        // Create an empty StorageResource, call it geneList
        StorageResource geneList = new StorageResource();
        // Set startIndex to 0
        int startIndex = 0;
        //int i = 0;
        // Repeat the following steps
        while ( true ) {
            // Find the next gene after startIndex
            String currentGene = findGene(dna, startIndex);
            // If no gene was found, leave this loop
            if (currentGene.isEmpty()) {
                break;
            }
            else{
            // Add that gene to geneList
            geneList.add(currentGene);
            //i++;
            // Set startIndex to just past the end of the gene
            startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
            }
        }
        //System.out.println(i);
        // Your answer is geneList
        return geneList;
    }
    
    public double cgRatio(String dna){
        int dnaLength = dna.length();
        int numC = 0;
        int numG = 0;
        
        int startIndexC = dna.indexOf("C");
        if (startIndexC == -1){
            numC = 0;
        }
        else {
            int currentIndexC = dna.indexOf("C", startIndexC+1);
            while (currentIndexC != -1){
                numC++;
                currentIndexC = dna.indexOf("C", currentIndexC+1);
            }
        }
        
        int startIndexG = dna.indexOf("G");
        if (startIndexG == -1){
            numG = 0;
        }
        else {
            int currentIndexG = dna.indexOf("G", startIndexG+1);
            while (currentIndexG != -1){
                numG++;
                currentIndexG = dna.indexOf("G", currentIndexG+1);
            }
        }
        
        int cg = numC + numG;
        
        return cg/dnaLength;
    }
    
    public void quiz5(){
        FileResource fr = new FileResource("GRch38dnapart.fa");
        String dna = fr.asString();
        
        StorageResource gene = new StorageResource();
        gene = getAllGenes(dna);
        
        int count = 0;
        
        for (String s: gene.data()){
            double dnaLength = s.length();
            double numC = 0;
            double numG = 0;
    
            int startIndexC = s.indexOf("C");
            if (startIndexC == -1){
                break;
            }
            else {
                int currentIndexC = s.indexOf("C", startIndexC+1);
                while (currentIndexC != -1){
                    numC++;
                    currentIndexC = s.indexOf("C", currentIndexC+1);
                    }
            }
            
            int startIndexG = s.indexOf("G");
            if (startIndexG == -1){
                numG = 0;
            }
            else {
                int currentIndexG = s.indexOf("G", startIndexG+1);
                while (currentIndexG != -1){
                    numG++;
                    currentIndexG = s.indexOf("G", currentIndexG+1);
                    }
                }
            
            double cg = numC + numG;
            
            double cgRatio = cg/dnaLength;
            
            if (cgRatio > 0.35){
                count++;
                System.out.println(s);
            }
        }
        System.out.println("num is: " + count);
    }
    
    public int countCTG (String dna) {
        int startIndex = dna.indexOf("CTG");
        int num = 0;
        if (startIndex != -1){
            int currIndex = dna.indexOf("CTG", startIndex+3);
            num++;
            while (currIndex != -1){
                num++;
                currIndex = dna.indexOf("CTG", currIndex+3);
            }
        }
        else{
            num = 0;
        }

        return num;
    }
    
    public void quiz6(){
        FileResource fr = new FileResource("GRch38dnapart.fa");
        String dna = fr.asString();
        System.out.println(dna.length());
        int result = 0;
        result = countCTG(dna);
        System.out.println("CTG appears " + result + " times");
    }
    
    public void processGenes(StorageResource sr) {
        int i = 0;
        int r = 0;
        int c = 0;
        String longest = "";
        for (String s: sr.data()){
            // print all the Strings in sr that are longer than 9 char
            if (s.length() > 9){
                System.out.println(s);
                i++;
            }
            
            double currRatio = cgRatio(s);
            // print the strings in sr whose CG ratio is higher than 0.35
            if (currRatio > 0.35){
                System.out.println(currRatio);
                r++;
            }
            
            if (s.length() > longest.length()){
                longest = s;
            }
            
            if (s.length() > 60){
                c++;
                System.out.println(s);
            }
            
                
        }
        // print the number of Strings in sr that are longer than 9 char
        System.out.println(i);
        // print the number of strings in sr whose CG ratio is higher than 0.35
        System.out.println(r);
        // print the length of the longest gene in sr
        System.out.println(longest);
        //
        System.out.println(c);
        }
    
       public void quiz7(){
        FileResource fr = new FileResource("GRch38dnapart.fa");
        String dna = fr.asString();
        
        StorageResource gene = new StorageResource();
        gene = getAllGenes(dna);     
        
        String longest = "";
        String current = "";
        for (String s: gene.data()){
            if (s.length() > longest.length()){
                longest = s;
        }
        }
        System.out.println("Longest length is " + longest.length());
    }

        
    
}
    
