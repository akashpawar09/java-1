class Cricketer{
        String Name;
		String country;
		int matches;
		
		void setDetails(String Name,String country,int matches)
		{
	           this.Name = Name;
               this.country = country;
               this.matches = matches;			   
		}
		
		void printDetails()
	   	{
		    System.out.println(Name);
			System.out.println(country);
			System.out.println(matches);
		
		}
}

class Batsman extends Cricketer{
        int totruns;
		
		void settotruns(int totruns)
		{
		   this.totruns = totruns;
		   
		}  
        void printbatDetails()
        {
            System.out.println(totruns);
        }			
 		

}

class Bowler extends Cricketer{
        int totwickets;
		void settotwickets(int totwickets)
		{
		   this.totwickets = totwickets;
		}
		
		void printbowDetails()
		{ 
		   System.out.println(totwickets);
		}   
}

class CricketerDemo{
            public static void main(String args[]){
                Cricketer c1 = new Cricketer();
                c1.setDetails("akash","india",400);
                c1.printDetails();

                Batsman b1 = new Batsman();
                b1.setDetails("saurabh","india",400);
                b1.settotruns(10000);
                b1.printDetails();
                b1.printbatDetails();
 
                Bowler b2 = new Bowler();
                b2.setDetails("prasad","india",300);
                b2.settotwickets(200);
                b2.printDetails();
                b2.printbowDetails();				

}
}



