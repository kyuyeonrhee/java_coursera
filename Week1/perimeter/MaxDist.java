import edu.duke.*;

public class MaxDist {
    public double getDist (Shape s) {
        //Start with maxdist=0
        double maxdist = 0;
        Point prevPt = s.getLastPoint();
        //For each point currPt in the shape,
        for(Point currPt: s.getPoints()){
            //Find distance from prevPt pt to currPt, name it currDist
            double currDist = prevPt.distance(currPt);
            //Update maxdist if currdist>maxdist
            if (currDist>=maxdist){
                maxdist=currDist;
            }else;
        
        }
        return maxdist;
    }
    
    public void testDist () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double distance = getDist(s);
        System.out.println("maximum distance = " + distance);
    }
    
    public static void main (String[] args){
        MaxDist pr = new MaxDist();
        pr.testDist();
    }

}
