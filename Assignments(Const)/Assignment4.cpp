/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' with the constructor having the three sides as its parameters.*/

#include <iostream>
#include <cmath>
using namespace std;

class Triangle 
{
private:
    float side1, side2, side3;

public:
    Triangle(float s1, float s2, float s3) 
	{
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    float calculatePerimeter() 
	{
        return side1 + side2 + side3;
    }

    float calculateArea() {
        float s = calculatePerimeter() / 2;
        return sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    void printDetails() 
	{
        cout << "Area of the triangle: " << calculateArea() << " square units" << endl;
        cout << "Perimeter of the triangle: " << calculatePerimeter() << " units" << endl;
    }
};

main() 
{
    Triangle triangle(7, 6, 2);

    triangle.printDetails();

    return 0;
}
