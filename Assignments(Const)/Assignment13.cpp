/*Write a program to print the roll number and average marks of 8 students in three subjects (each
out of 100). The marks are entered by the user and the roll numbers are automatically assigned.*/
#include <iostream>
using namespace std;

class Student 
{
private:
    int rollNumber;
    float marks[3];

public:
    static int count;
    Student() 
	{
        rollNumber = ++count;
    }

    void input() 
	{
        cout << "Enter marks for Student " << rollNumber << ":\n";
        for (int i = 0; i < 3; ++i) 
		{
            cout << "Enter marks for Subject " << i + 1 << ": ";
            cin >> marks[i];
        }
    }

    float Average() 
	{
        float sum = 0;
        for (int i = 0; i < 3; ++i) 
		{
            sum += marks[i];
        }
        return sum / 3;
    }

    void Info() 
	{
        cout << "Student " << rollNumber << ": Roll Number - " << rollNumber << ", Average Marks - " << Average() << endl;
    }
};

int Student::count = 0;

main() 
{
    const int numStudents = 8;
    Student students[numStudents];

    for (int i = 0; i < numStudents; ++i) 
	{
        students[i].input();
    }

    cout << "\nStudent Information:\n";
    for (int i = 0; i < numStudents; ++i) 
	{
        students[i].Info();
    }
}
