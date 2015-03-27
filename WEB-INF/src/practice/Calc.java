package practice;

public class Calc {

	private int x;
	private int y;

	Calc(){
		this.x = 0;
		this.y = 0;
	}

	Calc(int a,int b){
		this.x = a;
		this.y = b;
	}

	void setNumber(int a,int b){
		this.x = a;
		this.y = b;
	}

	public int plus(){
		return x + y;
	}

	public int minus(){
		return x - y;
	}

	public int multiply(){
		return x * y;
	}

	public int division(){
		return x / y;
	}

	public int residue(){
		return x % y;
	}

	public int max(){
		  return (x > y) ? x : y;
		 }

	public int min(){
		  return (x < y) ? x : y;
		 }

	public Calc addX(int a){
		x += a;
		return this;
	}

	public Calc subX(int a){
		x -= a;
		return this;
	}

	public Calc mulX(int a){
		x *= a;
		return this;
	}

	public Calc divX(int a){
		x /= a;
		return this;
	}

	public Calc modX(int a){
		x %= a;
		return this;
	}

	public Calc addY(int b){
		y += b;
		return this;
	}

	public Calc subY(int b){
		y -= b;
		return this;
	}

	public Calc mulY(int b){
		y *= b;
		return this;
	}

	public Calc divY(int b){
		y /= b;
		return this;
	}

	public Calc modY(int b){
		y %= b;
		return this;
	}
	/**
	 *
	 * @足し算
	 */
	static public int plus(int a,int b){
		return a + b;
	}
	/**
	 *
	 * @引き算
	 */
	static public int minus(int a,int b){
		return a - b;
	}
	/**
	 *
	 * @掛け算
	 */
	static public int multiply(int a,int b){
		return a * b;
	}
	/**
	 *
	 * @割り算
	 */
	static public int division(int a,int b){
		return a / b;
	}
	/**
	 *
	 * @剰余算
	 */
	static public int residue(int a,int b){
		return a % b;
	}

	private static boolean isEmpty(int[] nums){
		return nums == null || nums.length ==0;
	}
	/**
	 *
	 *
	 * @可変長引数足し算
	 */
	static public int plus(int... nums){
		if(Calc.isEmpty(nums)){
			return 0;
		}

		int sum = nums[0];
		for(int i = 1;i < nums.length;i++){
			sum += nums[i];
		}
		return sum;
	}
	/**
	 *
	 *
	 * @可変長引数引き算
	 */
	static public int minus(int... nums){
		if(Calc.isEmpty(nums)){
			return 0;
		}

		int sum = nums[0];
		for(int i = 1;i < nums.length;i++){
			sum -= nums[i];
		}
		return sum;
	}
	/**
	 *
	 *
	 * @可変長引数掛け算
	 */
	static public int multiply(int... nums){
		if(Calc.isEmpty(nums)){
			return 0;
		}

		int sum = nums[0];
		for(int i = 1;i < nums.length;i++){
			sum *= nums[i];
		}
		return sum;
	}
	/**
	 *
	 *
	 * @可変長引数割り算
	 */
	static public int division(int... nums){
		if(Calc.isEmpty(nums)){
			return 0;
		}

		int sum = nums[0];
		for(int i = 1;i < nums.length;i++){
			sum /= nums[i];
		}
		return sum;
	}

}
