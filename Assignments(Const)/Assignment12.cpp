/*Write a program to print the name, salary and date of joining of 10 employees in a company. Use
array of objects.
*/
#include <iostream>
#include <string>
using namespace std;

class Employee 
{
private:
    string name;
    float salary;
    string dateOfJoining;

public:
    Employee() {}  

    void set(string n, float s, string doj) 
	{
        name = n;
        salary = s;
        dateOfJoining = doj;
    }

    void Info() 
	{
        cout << "Name: " << name << "\tSalary: " << salary << "\tDate of Joining: " << dateOfJoining << endl;
    }
};

main() 
{
    Employee employees[10];

    for (int i = 0; i < 10; ++i) 
	{
        string name, dateOfJoining;
        float salary;

        cout << "Enter details for Employee " << i + 1 << ":" << endl;
        cout << "Name: ";
        getline(cin >> ws, name);  
        cout << "Salary: ";
        cin >> salary;
        cout << "Date of Joining (DD/MM/YYYY): ";
        cin >> dateOfJoining;

        employees[i].set(name, salary, dateOfJoining);
    }

    cout << "\nEmployee Information:" << endl;
    for (int i = 0; i < 10; ++i) {
        cout << "Employee " << i + 1 << ":" << endl;
        employees[i].Info();
    }

}
