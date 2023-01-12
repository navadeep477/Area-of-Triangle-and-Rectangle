class Triangle{
double s1,s2,s3;

Triangle(double s1, double s2, double s3){
this.s1 = s1;
this.s2 = s2;
this.s3 = s3;
}
double getArea(){
return (s1*s2*s3);
}
}

class Circle{
double r;

Circle(double r){
this.r =r;
}
double getArea(){
return (3.14*r*r);
}
}

class ATR{ 
public static void main(String args[]){
Triangle tri = new Triangle(5,9,12);
System.out.println(tri.getArea());
Circle cir = new Circle(5.3);
System.out.println(cir.getArea());
}
}