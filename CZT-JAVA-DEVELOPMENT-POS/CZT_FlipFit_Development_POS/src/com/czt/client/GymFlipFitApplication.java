/**
 * 
 */
package com.czt.client;

import java.util.Scanner;

import com.czt.business.GymAdminInterface;
import com.czt.business.GymAdminServiceImpl;
import com.czt.business.GymCustomerInterface;
import com.czt.business.GymCustomerServiceImpl;
import com.czt.business.GymOwnerInterface;
import com.czt.business.GymOwnerServiceImpl;
import com.czt.business.GymPaymentInterface;
import com.czt.business.GymPaymentServiceImpl;

/**
 * 
 */
public class GymFlipFitApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1. login");
		System.out.println("2. Registration of GymCustomer");
		System.out.println("3. Registration of GymOwner");
		System.out.println("4. Exit");
		
		
		
		for(int i=0; i<5; i++)
		{
			System.out.println("select your Options :");
		
		
		
		int num = sc.nextInt();
		
		switch(num)
		{
			
		case 1:
			String str= "Login";
			System.out.println(str);
			break;
			
		case 2:
			String str1= "Registration of GymCustomer";
			System.out.println(str1);
			break;
			
		case 3:
			String str2= "Registration of GymOwner";
			System.out.println(str2);
			break;
		case 4:
			String str3= "Exit";
			System.out.println(str3);
			break;
			
		default: 
			System.out.println("Not Found");
		}
		}
		
		
		
		
		
		GymAdminInterface busi= new GymAdminServiceImpl();
		busi.checkpendingGymOwner();
		busi.checkpendingGymRequest();
		busi.validateNewGymCenter();
		busi.validateNewGymOwner();
		
		GymCustomerInterface cust = new GymCustomerServiceImpl();
		cust.newGymInformation();
		cust.viewBooking();
		cust.viewBooking();
		cust.viewprofile();
		cust.bookSlots();
		
		
		GymOwnerInterface owns = new GymOwnerServiceImpl();
		owns.addaGymandAvailableSlot();
		owns.editOwnersRegisteredGymsandSlots();
		owns.viewOwnersRegisteredGymandslots();
		owns.viewProfile();
		
		
		GymPaymentInterface pays = new GymPaymentServiceImpl();
		pays.makePayment();
		pays.refundPayment();
		pays.viewPaymentDetails();
		pays.viewPaymentStatus();

	}

}
