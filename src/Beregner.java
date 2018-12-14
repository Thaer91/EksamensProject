public class Beregner {

       public double a,b,c;
       public double X1;
       public double X2;

       Beregner (double a, double b, double c){     // konstruktere

           this.a = a;
           this.b = b;
           this.c = c;

       }
       public String beregnX(){

           double X1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
           double X2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
           String X ="X = "+ X1 +" , "+ X2;

           this.X1=X1;
           this.X2=X2;
           return X;
           }

           public double rumfangAfKasse(double a, double b, double c){
           double rumfang = a*b*c;
           return rumfang;
           }



       }



