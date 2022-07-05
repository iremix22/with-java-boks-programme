
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter a1 = new Fighter("A",10,120,100,30);
		Fighter a2=new Fighter("B",20,85,85,40);
		
		Ring r1=new Ring(a1,a2,85,100);
		r1.run();
	}

}
