public class calc{
	public static void main (String[] args){
		System.out.println("Git + Note!!!");
		if (args.length == 0) {
			System.out.println("No args!!!");
		}
		else
		{
			int first, second, result;
			first = Integer.valueOf(args[0]);
			second = Integer.valueOf(args[1]);
			result = first + second;
			System.out.println("Summ = " + result);
		}
	}
}