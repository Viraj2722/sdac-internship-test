package A;

import C.Comp;

public class Acc extends Comp {

	@Override
	public double calSal(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}
	@Override
	public double calSal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return sal+bonus;
	}
	@Override
	public double calSal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
