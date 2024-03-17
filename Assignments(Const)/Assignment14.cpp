/*Write a program to calculate the average height of all the students of a class. The number of students
and their heights are entered by the user.*/
#include <iostream>
using namespace std;

main() 
{
    int num;
    cout << "Enter the number of students: ";
    cin >> num;

    if (num <= 0) 
	{
        cout << "Invalid number of students." << endl;
        return 1;
    }

    float Height = 0;
    for (int i = 1; i <= num; ++i) 
	{
        float height;
        cout << "Enter the height of student " << i << " (in meters): ";
        cin >> height;

        if (height <= 0) 
		{
            cout << "Invalid height entered. Height should be a positive number." << endl;
            return 1;
        }

        Height = Height + height;
    }

    float avgHeight = Height / num;
    cout << "The average height of the students in the class is: " << avgHeight << " meters" << endl;
}
