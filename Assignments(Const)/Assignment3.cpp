/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' with a function to print the area and perimeter.*/
#include <iostream>
#include <string>
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

    float getPerimeter() 
	{
        return side1 + side2 + side3;
    }

    float getArea() 
	{
        float s = getPerimeter() / 2;
        return s * (s - side1) * (s - side2) * (s - side3);
    }

    void print() 
	{
        cout << "Area of the Triangle : " << getArea() << " square units " << endl;
        cout << "Perimeter of the Triangle : " << getPerimeter() << " units " << endl;
    }
};

main() 
{
    Triangle triangle(8, 9, 5);
    triangle.print();
}
