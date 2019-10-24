// Shelby Alexander and Anna Buck
// COMCON OCT 2001
// P4
// How Deviant are you?

import java.io.*;

public class deviant
{
    public static void main(String[] args) throws IOException
    {
        //creates objects for reading in and outputting
        File file = new File(System.getProperty("user.dir") + "/deviant.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        //signature
        System.out.println("Shelby Alexander and Anna Buck\nCOMCON OCT 2011\nP4\nHow Deviant are you?\n\n");
        
        // declare variables
        int numPop, j = 0, output = 0;
        double mean = 0, distMean = 0, range1 = 0, range2 = 0;
        String str;
        
        // inputs the data
        numPop = Integer.parseInt(br.readLine());
        double[] pop = new double[numPop], distance = new double[numPop];
        while((str = br.readLine()) != null)
        {
            pop[j] = Integer.parseInt(str);
            j++;
        }
        
        // calculates the mean
        for(int k = 0; k < numPop; k++)
        {
            mean += pop[k];
        }
        mean /= numPop;
        
        // finds the distance between the mean and the data
        for(int k = 0; k < numPop; k++)
        {
            distance[k] = pop[k] - mean;
            distance[k] *= distance[k];
        }
        
        // finds the mean of the distances
        for(int k = 0; k < numPop; k++)
        {
            distMean += distance[k];
        }
        distMean /= numPop;
        distMean = Math.sqrt(distMean);
        
        // finds the acceptable range for the deviation
        range1 = mean - distMean;
        range2 = mean + distMean;
        
        // determines which numbers are in the range and prints the answe
        for(int k = 0; k < numPop; k++)
        {
            if(pop[k] < range1 || pop[k] > range2)
            {
                output = (int) pop[k];
                System.out.println(output);
            }
        }
    }
}
