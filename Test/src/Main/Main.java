package Main;

import E.Emp;
import M.Manager;

public class Main {
 public static void main(String[] args) {
	Emp e=new Emp();
	Manager m=new Manager();
	System.out.println(e.calSal(20000));
	System.out.println(m.calSal(20000, 9000));
	
}
}
