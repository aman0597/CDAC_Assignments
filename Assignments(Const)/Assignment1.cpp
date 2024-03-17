/*Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign
the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.*/
#include <iostream>
#include <string>

using namespace std;

class Student 
{
public:
    string name;
    int roll_no;
};

main() 
{
    Student std1;
    std1.name = "John";
    std1.roll_no = 2;

    cout << "Student Name: " << std1.name << endl;
    cout << "Roll Number: " << std1.roll_no;
}

