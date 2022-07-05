
public class Ring {
	Fighter f1;
	Fighter f2;
	
	int minweight;
	int maxweight;
	
	Ring(Fighter f1,Fighter f2,int minweight,int maxweight){
		this.f1=f1;
		this.f2=f2;
		this.minweight=minweight;
		this.maxweight=maxweight;
	}
	
	
	 void run() {
		if(isCheck()) {
			while(this.f1.health>=0&&this.f2.health>=0) {
				System.out.println("NEW ROUND");
				this.f2.health=this.f1.hit(this.f2);
				if(isWin()) {
					break;
				}
				this.f1.health=this.f2.hit(this.f1);
				if(isWin()) {
					break;
				}
				
				System.out.println(this.f1.name+" HEALTH "+ this.f1.health);
				System.out.println(this.f2.name+" HEALTH "+ this.f2.health);
			}
		}else {
			System.out.println("your weight is not suitable for the competition");
		}
	}
	
	boolean isCheck() {
		return (this.f1.weight>=minweight&&this.f1.weight<=maxweight)&&(this.f2.weight>=minweight&&this.f2.weight<=maxweight);
	}
	
	boolean isWin() {
		if(this.f1.health==0) {
			System.out.println(this.f2.name+"won");
			return true;
		}
		if(this.f2.health==0) {
			System.out.println(this.f1.name+"won");
			return true;
		}
		return false;
	}
	
	
	
}
