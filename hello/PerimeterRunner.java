import edu.duke.*;

public class PerimeterRunner {
    public double getPerimeter (Shape s) {
        //Start with totalPerim = 0
        double totalPerim = 0;
        //Start with prevPt = the last point
        Point prevPt = s.getLastPoint();
        //For each point currPt in the shape,
        for(Point currPt: s.getPoints()){
            //Find distance from prevPt pt to currPt, name it currDist
            double currDist = prevPt.distance(currPt);
            //Update totalPerim to be totalPerim + currDist
            totalPerim = totalPerim + currDist;
            //Update prevPt to be currPt.
            prevPt = currPt;
            }
        //totalPerim is my answer
        return totalPerim;
    }
}

