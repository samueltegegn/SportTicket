

/*
 * Date 3/10/2020
 * Name: Samuel Tegegn
 * Solution for question No 5 and No 6 on page 657 (Building java programs)
 * 
 */
package campEve;

public class SportCamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberofdays;
		WalkUpTicket wt= new WalkUpTicket(10);
		wt.setPrice(50);
		
		System.out.println(wt.toString());
		
		numberofdays=5;
		AdvanceTicket at = new AdvanceTicket(20);
		StudentAdvanceTicket st=new StudentAdvanceTicket(30);
		if (numberofdays >=10) {
			at.setPrice(40);
		}else {
			at.setPrice(30);
		}
		
		System.out.println(at.toString());
		
		if (numberofdays >=10) {
			st.setPrice(20);
		}else {
			st.setPrice(15);
		}
		System.out.println(st.toString());
	}

}
