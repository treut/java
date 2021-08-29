//передаются только массивы с числами тк наследуется класс Number
//обобщенные классы
//+ метасимвольные аргументы

class Stats<T extends Number>{
	T nums[];

	Stats(T nums[]){
		this.nums=nums;
	}

	double average(){
		double sum=0.0;

		for(int i=0; i<nums.length; i++){
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
	}

	boolean sameAvg(Stats<?> obj){
		if(average()==obj.average()) return true;
		return false;
	}
}

public class BoundsDemo{
	public static void main(String args[]){
		Integer inums[]={1, 2, 3, 4, 5};
		Stats<Integer> iob=new Stats<Integer>(inums);
		double v=iob.average();
		System.out.println("Среднее значение iob="+v);

		Double dnums[]={1.1, 2.2, 3.3, 4.4, 5.5};
		Stats<Double> dob=new Stats<Double>(dnums);
		double w=dob.average();
		System.out.println("Среднее значение dob="+w);

		if(iob.sameAvg(dob)) System.out.println("iob & dob равны");
		else System.out.println("iob & dob НЕ равны");
	}
}