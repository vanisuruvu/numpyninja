package day3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class OnlineFoodOrdering {
	Scanner sc = new Scanner(System.in);
	int totalQuantity;
	final DecimalFormat df = new DecimalFormat("0.00");

	public static double roundAvoid(double value, int places) {
	    double scale = Math.pow(10, places);
	    return Math.round(value * scale) / scale;
	}
	
	//dinein =1 , takeaway =2
	public void displayNetTotal(double total, int dineInTakeAway) {
		double netTotal = 0;
		double gstTax = roundAvoid(0.06*total,1);
		double parcelDineInCharge = 0;
		double totalBillAmount = 0;
		double discount = 0;
		
		total = roundAvoid(total,1);
		if(dineInTakeAway ==1) {  // dinein
			parcelDineInCharge = 30;
		}else if(dineInTakeAway ==2) { // takeaway
			parcelDineInCharge = totalQuantity*10;
		}
		
		totalBillAmount = total + gstTax + parcelDineInCharge;
		if(totalBillAmount >=1500) {
			discount = 0.15*totalBillAmount;
		}else if(totalBillAmount>=1000 && totalBillAmount<1500) {
			discount = 0.1*totalBillAmount;
		}
		discount = roundAvoid(discount,1);
		
		netTotal = totalBillAmount - discount;
		netTotal = roundAvoid(netTotal,1);
		System.out.println("Total cost: "+df.format(total));
		System.out.println("GST tax: " + df.format(gstTax));
		System.out.println("Parcel/Dine-in charge :"+ df.format(parcelDineInCharge));
		System.out.println("Total bill amount: "+ df.format(totalBillAmount));
		System.out.println("Discount: "+ df.format(discount));
		System.out.println("Net bill amount: "+ df.format(netTotal));
		System.out.println("Thank you ! Visit again !");
	}
	
	public int getOptionDineInTakeAway() {
		System.out.println("Hello Welcome to Numpy Ninja restaurant !");
		System.out.println("Please select the service offering from below list :");
		System.out.println("[1] dine-in");
		System.out.println("[2] take away");
		System.out.println("Please enter the option - ");
		int isDineIn = sc.nextInt();
		return isDineIn;
	}
	
	public int getCategory() {
		System.out.println("Please select the category from the below list :");
		System.out.println("[1] vegetarian");
		System.out.println("[2] Non-vegetarian");
		System.out.println("Please enter the option - ");
		return sc.nextInt();
	}
	
	public int getVegCategory() {
		
		System.out.println("Below are the dishes available currently to order :");
		System.out.println("1. Paneer tikka - Rs. 120.00 (per item)");
		System.out.println("2. Cashew pulao - Rs. 150.00 (per item)");
		System.out.println("3. Veg fried rice - Rs. 130.00 (per item)");
		System.out.println("4. Gobi 65 - Rs. 100.00 (per item)");
		System.out.println("5. Veg. thali - Rs. 140.00 (per item)");
		System.out.println("Please enter the option - ");
		int optionVeg = sc.nextInt();
		return optionVeg;
	}

	public int getNonVegCategory() {
		
		System.out.println("Below are the dishes available currently to order :");
		System.out.println("1. Chicken briyani - Rs. 200.00 (per item)");
		System.out.println("2. Fish curry - Rs. 150.00 (per item)");
		System.out.println("3. Chicken 65 - Rs. 120.00 (per item)");
		System.out.println("4. Mutton gravy - Rs. 220.00 (per item)");
		System.out.println("5. Chicken fried rice - Rs. 180.00 (per item)");
		System.out.println("Please enter the option - ");
		int optionNonVeg = sc.nextInt();
		return optionNonVeg;
	}
	
	
	
	public double getItemTotal(int category, int subCategory) {
		double itemTotal = 0;
		int quantity = 0;
		if(category == 1) {
			switch(subCategory) {
				case 1: 
					System.out.println("Please enter number of \"Paneer tikka\" you would like to order - ");
					quantity = sc.nextInt();
					itemTotal = 120*quantity; 
					break;
				case 2:
					System.out.println("Please enter number of \"Cashew pulao\" you would like to order - ");
					quantity = sc.nextInt();
					itemTotal = 150*quantity; 
					break;
				case 3:
					System.out.println("Please enter number of \"Veg fried rice\" you would like to order - ");
					quantity = sc.nextInt();
					itemTotal = 130*quantity; 
					break;
				case 4:
					System.out.println("Please enter number of \"Gobi 65\" you would like to order - ");
					quantity = sc.nextInt();
					itemTotal = 100*quantity; 
					break;
				case 5:
					System.out.println("Please enter number of \"Veg. thali\" you would like to order - ");
					quantity = sc.nextInt();
					itemTotal = 140*quantity; 
					break;
				default:
					System.out.println("Wrong SubCategory");
			}
		}else if(category ==2) {
			switch(subCategory) {
			case 1: 
				System.out.println("Please enter number of \"Chicken briyani\" you would like to order - ");
				quantity = sc.nextInt();
				itemTotal = 200*quantity; 
				break;
			case 2:
				System.out.println("Please enter number of \"Fish curry\" you would like to order - ");
				quantity = sc.nextInt();
				itemTotal = 150*quantity; 
				break;
			case 3:
				System.out.println("Please enter number of \"Chicken 65\" you would like to order - ");
				quantity = sc.nextInt();
				itemTotal = 120*quantity; 
				break;
			case 4:
				System.out.println("Please enter number of \"Mutton gravy\" you would like to order - ");
				quantity = sc.nextInt();
				itemTotal = 220*quantity; 
				break;
			case 5:
				System.out.println("Please enter number of \"Chicken fried rice\" you would like to order - ");
				quantity = sc.nextInt();
				itemTotal = 180*quantity; 
				break;
			default:
				System.out.println("Wrong SubCategory");
			
			}
		}
		totalQuantity+= 1;
		return itemTotal;
	}
	
	public static void main(String[] args) {
		OnlineFoodOrdering ofo = new OnlineFoodOrdering();
		Scanner sc1 = new Scanner(System.in);
		
		boolean isCategory = true;
		boolean isVeg = false;
		boolean isNonVeg = false;
		boolean isOtherCategory = false;

		int isDineIn = ofo.getOptionDineInTakeAway();
		double itemTotals = 0;
		int vegCat, nonVegCat;
		int category = ofo.getCategory();
		while(isCategory) {		
			if(category == 1) { isVeg = true;
				while(isVeg) {
					vegCat = ofo.getVegCategory();
					itemTotals+= ofo.getItemTotal(1, vegCat);
					
					System.out.println("Would you like to order one more dish ? [Y] or [N] - ");
					isVeg = (sc1.next().equalsIgnoreCase("Y"))? true: false;
				}
			}else if(category ==2) { isNonVeg = true;
				while(isNonVeg) { 
					nonVegCat = ofo.getNonVegCategory();
					itemTotals+= ofo.getItemTotal(2, nonVegCat);
					
					System.out.println("Would you like to order one more dish ? [Y] or [N] - ");
					isNonVeg = (sc1.next().equalsIgnoreCase("Y"))? true: false;
				}
			}
			
			System.out.println("Would you like to order from other category ? [Y] or [N] - ");
			isOtherCategory = sc1.next().equalsIgnoreCase("Y");
			if(isOtherCategory && category == 1) {
				category = 2;
			}else if(isOtherCategory && category ==2) {
				category = 1;
			}
			if(!isOtherCategory) {
				isCategory = false;
			}
		}
		
		double netTotal = 0;
		if(isDineIn == 1) {
			ofo.displayNetTotal(itemTotals,1);  // dinein net total
		}else {
			ofo.displayNetTotal(itemTotals,2);  // take away net total 
		}
	}
}
