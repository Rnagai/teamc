class Sample5_3_2{
	public static void main (String args [] ){
		Sedan sedan = new Sedan();
		StationWagon sw = new StationWagon();
		sedan.ride();
		sw.ride();
	}
}

abstract class Car{
	void stop(){
		System.out.println("止まる");
	}
	void run(){
		System.out.println("走る");
	}
	
	abstract void ride();
}

class Sedan extends Car{
	void ride(){
		System.out.println("運転手合わせて4人乗れます。");
	}
}

abstract class Wagon extends Car{
}

class StationWagon extends Wagon{
	void ride(){
		System.out.println("運転手合わせて6人乗れます。");
	}
}