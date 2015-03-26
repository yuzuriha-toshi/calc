package practice;

public class Calc {

	private int x;
	private int y;
	private int z;

	public static void main(String[] args){

	}

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
		z = x + y;
		return z;
	}

	public int  minus(){
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
		if(x > y){
			return x;
		}else{
			return y;
		}
	}

	public int min(){
		if(x < y){
			return x;
		}else{
			return y;
		}
	}

	public Calc addX(int a){
		x += a;
		return this;
	}

	public Calc subX(int a){
		x -= a;
		return this;
	}

	public void mulX(int a){
		x *= a;
	}

	public void divX(int a){
		x /= a;
	}

	public void modX(int a){
		x %= a;
	}

	public void addY(int b){
		y += b;
	}

	public Calc subY(int b){
		y -= b;
		return this;
	}

	public void mulY(int b){
		y *= b;
	}

	public void divY(int b){
		y /= b;
	}

	public void modY(int b){
		y %= b;
	}

}
