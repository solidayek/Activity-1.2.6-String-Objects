class Main {
  public static void main(String[] args) 
  {
    //the lyrics are from "tour the state" by Renald Francoeur
    
    //state song
    String stateSong = 
      "\"First, I'm gonna see Nashville\\, Tennessee\\. \nThen Madison\\, Wisconsin\\, is where I gotta be, yeah \"";
    System.out.println(stateSong);
    //string literal
    String travelTo ="Maybe take a trip to Jackson,";

    //operator for concatenation
    travelTo += " Mississippi. ";
    System.out.println(travelTo);

    //string class constructor
    String travelTo3 = "Honolulu";
    String travelTo4 = new String ("Hawaii.");
    System.out.println("Aloha to " + travelTo3 + " " + travelTo4);


  //implicit type conversion or immutability
  int year = 1492;  
   String output = "In " + year+ ", he sailed the ocean blue.";
   System.out.println(output);      

   //string literal
    String travelTo5 = "Grab a little sunshine in Tallahassee, ";

    //operator for concatenation #2
    travelTo5 += "Florida.";
    System.out.println(travelTo5);                                                                     
  }

}