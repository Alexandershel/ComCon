// Shelby Alexander and Anna Buck
// COMCON OCT 2001
// P3
// Got a Second?

import java.io.*;
import java.util.*;

public class second
{
    public static void main(String[] args) throws IOException
    {
        //creates objects for reading in and outputting
        File file = new File(System.getProperty("user.dir") + "/second.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        //signature
        System.out.println("Shelby Alexander and Anna Buck\nCOMCON OCT 2011\nP3\nGot a Second?");
        
        // declare variables
        int secTotal, secTotal2, answer;
        int hour1 = 0, hour2 = 0, min1 = 0, min2 = 0, sec1 = 0, sec2 = 0;
        String str;
        StringTokenizer tokenizer, tokenizer2, tokenizer3;
        String[] arr = new String[4];
        String[] tSplit, tSplit2;
        
        // repeats program
        while ((str = br.readLine()) != null)
        {
            // separates the string
            tokenizer = new StringTokenizer(str);
            int j = 0;
            while (tokenizer.hasMoreTokens())
            {
                arr[j] = tokenizer.nextToken();
                j++;
            }
            
            // determines the number of strings in the array
            if(j == 3)
            {
                if(arr[1].equals("AM") || arr[1].equals("PM"))
                {
                    // splits the string
                    tSplit = arr[0].split(":");
                    hour1 = Integer.parseInt(tSplit[0]);
                    min1 = Integer.parseInt(tSplit[1]);
                    sec1 = Integer.parseInt(tSplit[2]);
                    tSplit2 = arr[2].split(":");
                    hour2 = Integer.parseInt(tSplit2[0]);
                    min2 = Integer.parseInt(tSplit2[1]);
                    sec2 = Integer.parseInt(tSplit2[2]);
                    
                    // converts 12-hour clock to 24-hour clock
                    if(arr[1].equals("PM") && hour1 != 12)
                    {
                       hour1 += 12;
                    }
                    
                    // calculates the total number of seconds
                    secTotal = hour1 * 3600 + min1 * 60 + sec1;
                    secTotal2 = hour2 * 3600 + min2 * 60 + sec2;
                    
                    // calculates the difference
                    answer = Math.abs(secTotal - secTotal2);

                    // prints answer
                    System.out.print("\n" + answer);
                    
                }
                else if(arr[2].equals("AM") || arr[2].equals("PM"))
                {
                    // splits the string
                    tSplit = arr[0].split(":");
                    hour1 = Integer.parseInt(tSplit[0]);
                    min1 = Integer.parseInt(tSplit[1]);
                    sec1 = Integer.parseInt(tSplit[2]);
                    tSplit2 = arr[1].split(":");
                    hour2 = Integer.parseInt(tSplit2[0]);
                    min2 = Integer.parseInt(tSplit2[1]);
                    sec2 = Integer.parseInt(tSplit2[2]);
                    
                    // converts 12-hour clock to 24-hour clock
                    if(arr[2].equals("PM") && hour2 != 12)
                    {
                        hour2 += 12;
                    }
                    
                    // calculates the total number of seconds
                    secTotal = hour1 * 3600 + min1 * 60 + sec1;
                    secTotal2 = hour2 * 3600 + min2 * 60 + sec2;

                    // calculates the difference
                    answer = Math.abs(secTotal - secTotal2);

                    // prints answer
                    System.out.print("\n" + answer);
                }
            }
            else if(j == 4)
            {
                // splits the string
                tSplit = arr[0].split(":");
                hour1 = Integer.parseInt(tSplit[0]);
                min1 = Integer.parseInt(tSplit[1]);
                sec1 = Integer.parseInt(tSplit[2]);
                tSplit2 = arr[2].split(":");
                hour2 = Integer.parseInt(tSplit2[0]);
                min2 = Integer.parseInt(tSplit2[1]);
                sec2 = Integer.parseInt(tSplit2[2]);
                    
                // converts 12-hour clock to 24-hour clock
                if(arr[1].equals("PM") && hour1 != 12)
                {
                    hour1 += 12;
                }
                if(arr[2].equals("PM") && hour2 != 12)
                {
                    hour2 += 12;
                }
                    
                // calculates the total number of seconds
                secTotal = hour1 * 3600 + min1 * 60 + sec1;
                secTotal2 = hour2 * 3600 + min2 * 60 + sec2;
                    
                // calculates the difference
                answer = Math.abs(secTotal - secTotal2);

                // prints answer
                System.out.print("\n" + answer);
            }
            else
            {
                // splits the times into components
                tokenizer2 = new StringTokenizer(arr[0], ":");
                tokenizer3 = new StringTokenizer(arr[1], ":");
                while (tokenizer2.hasMoreTokens())
                {
                    hour1 = Integer.parseInt(tokenizer2.nextToken());
                    hour2 = Integer.parseInt(tokenizer3.nextToken());
                    min1 = Integer.parseInt(tokenizer2.nextToken());
                    min2 = Integer.parseInt(tokenizer3.nextToken());
                    sec1 = Integer.parseInt(tokenizer2.nextToken());
                    sec2 = Integer.parseInt(tokenizer3.nextToken());
                }
                // calculates the total number of seconds
                secTotal = hour1 * 3600 + min1 * 60 + sec1;
                secTotal2 = hour2 * 3600 + min2 * 60 + sec2;
                
                // calculates the difference
                answer = Math.abs(secTotal - secTotal2);
                
                // prints answer
                System.out.print("\n" + answer);
            }
        }
    }
}
