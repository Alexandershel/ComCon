// NAMES        : Anna Buck and Shelby Alexander
// GROUP        : AP CS
// COMP         : ComCon OCT 2008
// PROBLEM      : P3
// PROBLEM ID   : Match Digits

#include <iostream>
using namespace std;

int main()
{
    // signature
    cout << "Anna Buck and Shelby Alexander\nAP CS\nComCon OCT 2008 - P3" << endl << endl;
    
    // declare variables
    string chainOne, chainTwo;
    int count = 0;
    const int NUM_RUNS = 5;
    
    // repeats program
    for(int m = 0; m < NUM_RUNS; m++)
    {
        // asks the user for the number series
        cout << "\nPlease input a string of numbers (up to 10 digits):  ";
        cin >> chainOne;
        
        cout << "\n\nPlease input a second string of numbers (up to 10 digits):  ";
        cin >> chainTwo;

        // compares the two chains and outputs the answer
        for(int j = 0; j < chainOne.size(); j++)
        {
            for(int k = 0; k < chainOne.size(); k++)
            {
                if(chainOne[j] == chainTwo[k])
                {
                    count++;
                }
            }
        }
        
        // prints answer
        if(count >= chainOne.size() && chainOne.size() == chainTwo.size())
        {
            cout << "\nT" << endl << endl;
        }
        else
        {
            cout << "\nF" << endl << endl;
        }
    }
    cout << "\n\n\n\n";
    return 0;
}
