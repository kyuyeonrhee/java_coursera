import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int i = 0;
        for (Point currPt : s.getPoints()){
            i++;
        }
        return i;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        double totalPerim = 0.0;
        Point prevPt = s.getLastPoint();
        int i = 0;
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            totalPerim = totalPerim + currDist;
            prevPt = currPt;
            i++;
        }
        
        double avgLength = totalPerim/i;
        return avgLength;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        Point prevPt = s.getLastPoint();
        double maxdist = 0.0;
        for (Point currPt : s.getPoints()) {
            double curdist = prevPt.distance(currPt);
            if (curdist > maxdist){
                maxdist = curdist;
            }else;
            

    } return maxdist;
}
 


    public double getLargestX(Shape s) {
        // Put code here
        int maxXval = 0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            int currXval = currPt.getX();
            if (currXval > maxXval){
                maxXval = currXval;
            }else;
        }
        return maxXval;
    }

    public double getLargestPerimeterMultipleFiles() {
        //put code here
        DirectoryResource dr = new DirectoryResource();
        double largestPerim = 0;
        for (File f: dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double currPerim = getPerimeter(s);
            if(currPerim >= largestPerim){
                largestPerim = currPerim;
            }
        }
        return largestPerim;
    }
    

    public String getFileWithLargestPerimeter() {
        //Variable for holding largest perimeter value initialized to 0
        double largestPerim = 0;
        
        //Variable for holding filename of each file that is iterated
        //on by the for loop initialized to 0
        String fileName = null;
        
        //Variable that you transfer filename's value to when the largest perimeter is selected for in your if conditional
        String fileNameLP = null;
        
        DirectoryResource dr = new DirectoryResource();
        for (File f: dr.selectedFiles()){
            //Set fileName to the name of current iteration
            fileName = f.getName();
            //Convert to file resource
            FileResource fr = new FileResource(f);
            //Convert to shape
            Shape s = new Shape(fr);
            //Set current perimeter value to value of get perimeter of shape
            double currPerim = getPerimeter(s);
        if (currPerim > largestPerim){
            //If current perimeter value is larger than the largest perimeter value, set largest perimeter variable to current perimeter value
            largestPerim = currPerim;
            //transfer the file name associated in the current iteration to new vairable FileNameLP
            fileNameLP = fileName;
        }
        if (currPerim <= largestPerim){
            continue;
        }
    }
    //Return the file name
    return fileNameLP;
}

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double largside = getLargestSide(s);
        System.out.println("Largest Side= " + largside);
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
            
            
            
            
        }
    

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
