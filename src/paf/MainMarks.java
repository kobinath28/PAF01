package paf;

import java.util.Scanner;
class MainMarks{
public static void main(String args[]){

Marks M;
M = new Marks();

Scanner sc = new Scanner(System.in);

System.out.println("Enter the ID :");
int StuId = sc.nextInt();

System.out.println("Enter the Name : ");
String StuName = sc.next();

System.out.println("Marks1 :");
float marks1 = sc.nextFloat();

System.out.println("Marks2 :");
float marks2 = sc.nextFloat();

System.out.println("Marks3 :");
float marks3 = sc.nextFloat();

M.setData(StuId,StuName);
M.setMarks(marks1,marks2,marks3);
// M.total = 300;
// M.total();
// M.average(total);

    M.display();
}
}

