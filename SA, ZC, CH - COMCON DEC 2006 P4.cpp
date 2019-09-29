// NAMES        :  Shelby Alexander, Charlie Hinkley, Zach Collard
// GROUP        :  Hex
// PROJECT      :  COMCON DEC 2006
// PROBLEM #    :  4
// PROBEM NAME  :  A Good Year

#include <iostream>
using namespace std;

int main()
{
    // signature
    cout << "Shelby Alexander, Charlie Hinkley, Zach Collard\nHex\nComCon Dec 2006\nP4\nA Good Year\n\n";

    // declare variables
    int year = 1979, sum, j = 1, middleNums, firstNums, lastNums;
    
    // does whatever
    while (j !=0)
    {
        // calculates the numbers
        middleNums = year / 10 % 100;
        firstNums = year / 100;
        lastNums = year % 100;
        sum = firstNums + lastNums;
        
        // determines if the year is right
        if(sum == middleNums)
        {
            // prints the output and ends the while loop
            cout << year << endl;
            j = 0;
        }
        
        // increments year
        year++;
    }
    
    // exits program
    cout << "\n\n\n\n\n\n";
    return 0;
}
