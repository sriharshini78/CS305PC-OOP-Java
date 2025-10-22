class Report{
	String title;
        
	Report(){
		
		this.title = "Default Report";
	}
	Report(String t){
		this.title=t;
	}
	void display(){
		System.out.println(title);
	}
        public static void main(String...args){
        	Report r = new Report();
        	Report r1 = new Report("Sales Summary");
        	r.display();
        	r1.display();
       }
        
}
