package paf;

public class Marks {

		int StuId;
		String StuName;
		float marks1;
		float marks2;
		float marks3;
		//private float total;
		//private float average;

		void setData(int StuId, String StuName){
		this.StuId = StuId;
		this.StuName = StuName;
		}
		void setMarks(float marks1,float marks2,float marks3){
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		}
		private float total(){
		float total = this.marks1+this.marks2+this.marks3;
		return total;
		//System.out.println("Total is :"+total);
		}
		private float average(float total){
		float average = (total / 3);
		//float s = this.average();
		//System.out.println("Average is :"+s);
		return average;
		//System.out.println("Average is :"+average);
		}
		void display(){
		System.out.println("Student Id is :"+this.StuId);
		System.out.println("Student name is :"+this.StuName);
		System.out.println("Marks 1 is :"+this.marks1);
		System.out.println("Marks 2 is :"+this.marks2);
		System.out.println("Marks 3 is :"+this.marks3);
		float t = this.total();
		System.out.println("Total is :"+t);
		float s = this.average(t);
		System.out.println("Average is :"+s);
		}


}



