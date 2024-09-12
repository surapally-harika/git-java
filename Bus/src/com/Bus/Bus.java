package com.Bus;

public class Bus {
	
	
		public String name;
		public int noOfSeats;
		public String source;
		public String destination;
		public int fairPerkm;
		
		
		
		
		public Bus(String name, int noOfSeats, String source, String destination, int fairPerkm) {
			super();
			this.name = name;
			this.noOfSeats = noOfSeats;
			this.source = source;
			this.destination = destination;
			this.fairPerkm = fairPerkm;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getNoOfSeats() {
			return noOfSeats;
		}


		public void setNoOfSeats(int noOfSeats) {
			this.noOfSeats = noOfSeats;
		}


		public String getSource() {
			return source;
		}


		public void setSource(String source) {
			this.source = source;
		}


		public String getDestination() {
			return destination;
		}


		public void setDestination(String destination) {
			this.destination = destination;
		}


		public int getFairPerkm() {
			return fairPerkm;
		}


		public void setFairPerkm(int fairPerkm) {
			this.fairPerkm = fairPerkm;
		}
		
		
		public static void getService() {
			
			System.out.println("SERVICES PROVIDE FOR THE PASSENGERS:");
			System.out.println("water Bottle");
			System.out.println("Meals");
			
		}
		
		public  int Calculate( int distance) {
			
			  return distance* fairPerkm;
			 
			
		}
		
		public static void main(String[] args) {
			
			Bus b = new Bus("rajadhani",32,"hyderabad","vijaywada",2);
			System.out.println("BUS DETAILS:");
			
			System.out.println("bus name:"+b.getName());
			System.out.println("NumOfSeats:"+b.getNoOfSeats());
			System.out.println("Source:"+b.getSource());
			System.out.println("Destination:"+b.getDestination());
			System.out.println("FairPerkm:"+b.getFairPerkm());
			System.out.println("-----------------------------");
			
			
			getService();
		    
			b.Calculate(15);
			
		}
		
		
		
}
