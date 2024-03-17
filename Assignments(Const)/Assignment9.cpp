/*Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
with separate functions for each operation whose real and imaginary parts are entered by the user.*/
#include <iostream>
using namespace std;

class Complex 
{
private:
    float real;
    float img;

public:
    void setComplex(float r, float i) 
	{
        real = r;
        img = i;
    }

    void sum(Complex c1, Complex c2) 
	{
        real = c1.real + c2.real;
        img = c1.img + c2.img;
    }

    void difference(Complex c1, Complex c2) 
	{
        real = c1.real - c2.real;
        img = c1.img - c2.img;
    }

    void product(Complex c1, Complex c2) 
	{
        real = c1.real * c2.real - c1.img * c2.img;
        img = c1.real * c2.img + c1.img * c2.real;
    }

    void display() 
	{
        cout << "Result: " << real << " + " << img << "i" << endl;
    }
};

main() 
{
    Complex c1, c2, result;

    float real1, img1, real2, img2;

    cout << "Enter real and imaginary parts of first complex number: ";
    cin >> real1 >> img1;
    cout << "Enter real and imaginary parts of second complex number: ";
    cin >> real2 >> img2;

    c1.setComplex(real1, img1);
    c2.setComplex(real2, img2);

    result.sum(c1, c2);
    cout << "Sum: ";
    result.display();

    result.difference(c1, c2);
    cout << "Difference: ";
    result.display();

    result.product(c1, c2);
    cout << "Product: ";
    result.display();
}
