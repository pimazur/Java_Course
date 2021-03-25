package academy.learnprogramming;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        double addedreal = this.real + real;
        double addedimaginary = this.imaginary + imaginary;
        System.out.println(addedreal + addedimaginary);
    }


}
