//Name: Harkamalpreet singh
//Student ID: 201905122
//Date Submitted: March 13,2021
//Class IN2203 Group:2
//Class IN2203 Group:2: SAT 8am
//Name of Work: March 13: Class Work
p
public class Calculate{
	public static void main(String[] args){
calculator c1= new calculator();
calculator c2 = new calculator();
functions f1 = new functions();
functions f2 = new functions();
System.out.println("sum:"+c1.add(2,2));
System.out.println("subtraction:"+c2.sub(6,6));
System.out.println("multiply:"+f1.mul(10,4));
System.out.println("division:"+f2.div(6,3));
	}
}
class calculator{
	
	public int add(int a, int b){
		return a+b;
	}
	public int sub(int a, int b){
		return a-b;
	}}
class functions{
public int mul(int a, int b){
		return a*b;
	}
	public int div(int a,int b){
		return a/b;
	}
}