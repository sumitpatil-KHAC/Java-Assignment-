/*
10. Restaurant Order Management System 
Create a program for restaurant management. 
Requirements 
 Display a food menu with price list. 
 Let the user order multiple items. 
 Use loop and switch-case for repeated ordering. 
 Calculate total amount. 
 Add GST of 5%. 
 Print final bill
*/
import java.util.Scanner;
class RestaurantManagement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice;
		char more ;
		double total = 0;
		do{
			System.out.println("================== Menu ====================");
			System.out.println("Item Name                 :      Price  ");
			System.out.println("Starter ");
			System.out.println("1.Masala Papad(Urad)      :      30.00  ");
			System.out.println("2.Dry Manchurain          :      50.00  ");
			System.out.println("3.Masala Papad(Nagali)    :      25.00  ");
			System.out.println("4.Roasted Chana           :      45.00  ");
			System.out.println("Main Course ");
			System.out.println("5.Butter Paneer           :     140.00  ");
			System.out.println("6.Paneer Tikka            :     160.00  ");
			System.out.println("7.Paneer Angara           :     130.00  ");
			System.out.println("8.Butter Chicken          :     170.00  ");
			System.out.println("9.Chicken Handi           :     700.00  ");
			System.out.println("10.Mutton Handi           :     650.00  ");
			System.out.println("11.Bhakari                :      20.00  ");
			System.out.println("12.Chapati                :      10.00  ");
		    System.out.println("13.Tandoori Roti          :      30.00  ");
			System.out.println("14.Butter Nan             :      40.00  ");
			System.out.println("Desert(Ice cream)");
			System.out.println("15.Vanilla Cup            :      40.00  ");
			System.out.println("16.ButterScotch Cup       :      60.00  ");
			System.out.println("17.Strawberry Cup         :      70.00  ");
			System.out.println("18.Chocolate Cup          :     100.00  ");
			System.out.println("19.Mixed Fruit Cup        :     120.00  ");
			System.out.println("Drinking ");
			System.out.println("20.Water                  :      40.00  ");
		    System.out.println("21.Coldrink               :      60.00  ");
			System.out.println("22.Juice                  :      80.00  ");
			
			// number of items
            System.out.print("\nEnter number of different items: ");
            int n = sc.nextInt();

            int items[] = new int[n];
            int qty[] = new int[n];

            
            for (int i = 0; i < n; i++) {
                System.out.print("\nEnter item number: ");
                items[i] = sc.nextInt();

                System.out.print("Enter quantity: ");
                qty[i] = sc.nextInt();
            }
			for (int i = 0; i < n; i++){
			 switch (items[i]) {
                case 1: total += 30*qty[i]; break;
                case 2: total += 50*qty[i]; break;
                case 3: total += 25*qty[i]; break;
                case 4: total += 45*qty[i]; break;
                case 5: total += 140*qty[i]; break;
                case 6: total += 160*qty[i]; break;
                case 7: total += 130*qty[i]; break;
                case 8: total += 170*qty[i]; break;
                case 9: total += 700*qty[i]; break;
                case 10: total += 650*qty[i]; break;
                case 11: total += 20*qty[i]; break;
                case 12: total += 10*qty[i]; break;
                case 13: total += 30*qty[i]; break;
                case 14: total += 40*qty[i]; break;
                case 15: total += 40*qty[i]; break;
                case 16: total += 60*qty[i]; break;
                case 17: total += 70*qty[i]; break;
                case 18: total += 100*qty[i]; break;
                case 19: total += 120*qty[i]; break;
                case 20: total += 40*qty[i]; break;
                case 21: total += 60*qty[i]; break;
                case 22: total += 80*qty[i]; break;
                default:
                    System.out.println("Invalid choice!");
            }
			}
            System.out.print("Do you want to order more? (y/n): ");
            more = sc.next().charAt(0);
		}while(more =='y' || more =='Y');	
		
		// GST Calculation
        double gst = total * 0.05;
        double finalAmount = total + gst;

        // Final Bill
        System.out.println("\n========= FINAL BILL =========");
        System.out.println("Total Amount : " + total);
        System.out.println("GST (5%)     : " + gst);
        System.out.println("Final Amount : " + finalAmount);	

	}
}