
package org.example;

import java.sql.SQLOutput;
import java.util.*;
class Ticket {
    private int attractionID;
    private int numberOfTickets;

    public Ticket(int attractionID, int numberOfTickets)
    {
        this.attractionID = attractionID;
        this.numberOfTickets = numberOfTickets;
    }

    public int getAttractionID()
    {
        return attractionID;
    }

    public int getNumberOfTickets()
    {
        return numberOfTickets;
    }

    public void setAttractionID(int attractionID) {
        this.attractionID = attractionID;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
class DiscountCategory {
    private String name;
    private double discountPercentage;
    String couponcode;

    public DiscountCategory(String name, double discountPercentage) {
        this.name = name;
        this.discountPercentage = discountPercentage;
        this.couponcode=name+""+discountPercentage;
    }

    public String getName() {
        return name;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public String getCouponcode() {
        return couponcode;
    }

    public void setCouponcode(String couponcode) {
        this.couponcode = couponcode;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
class SpecialDeal {
    private int minAttractions;
    private double discountPercentage;
    public SpecialDeal( int minAttractions, double discountPercentage) {

        this.minAttractions = minAttractions;
        this.discountPercentage = discountPercentage;
    }
    public int getMinAttractions() {
        return minAttractions;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
}
class Attraction {
    private String name;
    private String description;

    private double ticketPrice;
    private int ticketCount;
    private int attractionID;
    private int isscheduled=0;
    static int attractionCounter=0;
    private int popularity=0;
    public Attraction( String name, String description) {

        this.name = name;
        this.description = description;
        attractionCounter++;
        this.attractionID=attractionCounter;

    }

    public void increasepopularity()
    {
        this.popularity++;
    }
    public int getPopularity()
    {
        return this.popularity;
    }

    public int getIsscheduled() {
        return isscheduled;
    }

    public void setIsscheduled(int isscheduled) {
        this.isscheduled = isscheduled;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getAttractionID() {
        return attractionID;
    }
    public void setAttractionID(int attractionID) {
        this.attractionID = attractionID;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
    public int getTicketCount() {
        return ticketCount;
    }
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public void increaseTicketCount(int count) {
        ticketCount += count;
    }
    public void decreaseTicketCount(int count) {
        ticketCount -= count;
    }

}

interface CanMakeSound {
    void makeSound();
    void showDescription();

}
class Animal {
    private String name;
    private String type;
    String desc;
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }



    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
class Mammal extends Animal implements CanMakeSound {
    public Mammal(String name) {
        super(name, "Mammal");
    }
    @Override
    public void makeSound() {
        if(getName().equals("Lion"))
        {
            System.out.println("Lion Roar");

        }
        else if(getName().equals("Monkey"))
        {
            System.out.println("Monkey chatter");

        }
        else
        {
            System.out.println(getName()+" makes sound");

        }
    }
    @Override
    public void showDescription()
    {
        if(getName().equals("Lion"))
        {
            System.out.println("The lion (Panthera leo) is a large cat of the genus Panthera native to Africa and India.");

        }
        else if(getName().equals("Monkey"))
        {
            System.out.println("Monkey is a common name that may refer to most mammals of the infraorder Simiiformes, also known as the simians.");

        }
        else
        {
            System.out.println(getName()+" is a mammal");

        }
    }
    @Override
    public String toString() {

        return "Mammal";
    }
}
class Reptile extends Animal implements CanMakeSound {
    public Reptile(String name) {
        super(name, "Reptile");
    }
    @Override
    public void makeSound() {
        if(getName().equals("Snake"))
        {
            System.out.println("Snake hisses");

        }
        else if(getName().equals("Alligator"))
        {
            System.out.println("Alligator gurgles");

        }
        else
        {
            System.out.println(getName()+"  makes sound");

        }
    }
    @Override
    public void showDescription()
    {
        if(getName().equals("Snake"))
        {
            System.out.println("snake, (suborder Serpentes), also called serpent, any of more than 3,400 species of reptiles disti…\n" +
                    "Snakes are thought to have evolved from terrestrial lizards as early as the Middle Jurassic Epoch (174.1 million to 163.5 million years ago)");

        }
        else if(getName().equals("Alligator"))
        {
            System.out.println("An alligator, or colloquially gator, is a large reptile in the Crocodilia order in the genus Alligator of the family Alligatoridae. ");

        }
        else
        {
            System.out.println(getName()+" is a Reptile");

        }
    }
    @Override
    public String toString() {
        return "Reptile";
    }
}
class Amphibian extends Animal implements CanMakeSound {
    public Amphibian(String name) {
        super(name, "Amphibian");
    }
    @Override
    public void makeSound() {
        if(getName().equals("Turtle"))
        {
            System.out.println("Turtle hisses");
        }
        else if(getName().equals("Frog"))
        {
            System.out.println("Frog ribbits ");
        }
        else
        {
            System.out.println(getName()+" the amphibian makes sound");
        }
    }
    @Override
    public void showDescription()
    {
        if(getName().equals("Turtle"))
        {
            System.out.println("Turtles are reptiles of the order Testudines, characterized by a special shell developed mainly from their ribs.");

        }
        else if(getName().equals("Frog"))
        {
            System.out.println(" frog is any member of a diverse and largely carnivorous group of short-bodied, tailless amphibians composing the order Anura");

        }
        else
        {
            System.out.println(getName()+" is a amphibian");

        }
    }
    @Override
    public String toString() {
        return "Amphibian";
    }
}

abstract class user {
    private String password;

    public user(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // You can add more common methods or attributes for users here.
}
class visitor extends user {
    private String name;
    private String email;
    private String phoneno;
    private int age;
    private double balance;
    private String feedback;
    private Membership membership;
    private List<Ticket> purchasedTickets;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Membership getMembership() {
        return membership;
    }
    public void setMembership(Membership membership)
    {
        this.membership = membership;
    }

    public String getFeedback()
    {
        return feedback;
    }
    public void setFeedback(String feedback)
    {
        this.feedback = feedback;
    }
    public boolean hasMembership()
    {
        return membership != null;
        // Check if the visitor has a membership
    }
    public void addPurchasedTicket(int attractionID, int numberOfTickets)
    {
        Ticket ticket = new Ticket(attractionID, numberOfTickets);
        purchasedTickets.add(ticket);
    }
    public void removeticket(Ticket t)
    {
        purchasedTickets.remove(t);
        t.setNumberOfTickets(t.getNumberOfTickets()-1);
        purchasedTickets.add(t);
    }
    public List<Ticket> getPurchasedTickets()
    {

        return purchasedTickets;
    }
    public visitor(String name, String email, String phoneno, int age, double balance ,String pass) {
        super(pass);
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
        this.age = age;
        this.balance = balance;
        purchasedTickets = new ArrayList<>();

    }
}
class admin extends user
{
    private String username;
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {

        this.username = username;

    }
    admin()
    {super("admin123");}

}
class Membership
{
    private String type; // Basic or Premium
    public Membership(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
public class Main {
    private static double revenue=0;

    private static ArrayList<visitor> visitors = new ArrayList<>();
    private static ArrayList<Animal> animals = new ArrayList<>(); // ArrayList for animals
    private static ArrayList<Attraction> attractionList = new ArrayList<>(); // ArrayList for attractions
    private static List<SpecialDeal> specialDeals = new ArrayList<>();
    private static ArrayList<DiscountCategory> discounts = new ArrayList<DiscountCategory>();

    public static void main(String[] args)
    {
        discounts.add(new DiscountCategory("Minor",20));
        discounts.add(new DiscountCategory("Senior",10));
        animals.add(new Animal("Lion","Mammal"));
        animals.add(new Animal("Monkey","Mammal"));
        animals.add(new Animal("Snake","Reptile"));
        animals.add(new Animal("Alligator","Reptile"));
        animals.add(new Animal("Turtle","Amphibian"));
        animals.add(new Animal("Frog","Amphibian"));


        System.out.println("Welcome to ZOOtopia!");
        SpecialDeal newDeal = new SpecialDeal( 2, 15);
        specialDeals.add(newDeal);
        SpecialDeal newDeal2 = new SpecialDeal(3,30);
        specialDeals.add(newDeal2);
        Scanner sc = new Scanner(System.in);



        while (true)
        {
            System.out.println("1. Enter as Admin");
            System.out.println("2. Enter as a Visitor");
            System.out.println("3. View Special Deals");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (choice)
            {
                case 1:
                    // Handle admin login and functionalities
                    System.out.print("Enter Admin Username: ");
                    String adminUsername = sc.nextLine();
                    System.out.print("Enter Admin Password: ");
                    String adminPassword = sc.nextLine();

                    if (adminAuthentication(adminUsername, adminPassword))
                    {
                        adminMenu();  // Pass the attractions data to the admin menu
                    }
                    else
                    {
                        System.out.println("Invalid admin credentials.");
                    }
                    break;
                case 2:
                    // Handle visitor registration or login and visitor functionalities
                    System.out.println("1. Register");
                    System.out.println("2. Login");
                    System.out.print("Enter your choice: ");
                    int visitorChoice = sc.nextInt();
                    sc.nextLine();  // Consume the newline character

                    switch (visitorChoice) {
                        case 1:
                            visitorReg();
                            break;
                        case 2:
                            visitor v= visitorLogin();
                            visitorMenu(v);

                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 3:
                    // Display special deals
                    for (SpecialDeal deal : specialDeals)
                    {
                        System.out.println("Buy " + deal.getMinAttractions() + " tickets and get " + deal.getDiscountPercentage() + "% off");
                    }
                    // Implement code to display special deals
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static boolean adminAuthentication(String username, String password)
    {
        return "admin".equals(username) && "admin123".equals(password);
    }
    private static void adminMenu()
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("\nLogged in as Admin.");
            System.out.println("Admin Menu:");
            System.out.println("1. Manage Attractions");
            System.out.println("2. Manage Animals");
            System.out.println("3. Schedule Events");
            System.out.println("4. Set Discounts");
            System.out.println("5. Set Special Deal");
            System.out.println("6. View Visitor Stats");
            System.out.println("7. View Feedback");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int adminChoice = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (adminChoice) {
                case 1:
                    manageAttractions();
                    break;
                case 2:
                    manageAnimals();
                    break;
                case 3:
                    scheduleEvents();
                    break;
                case 4:
                    setDiscounts();
                    break;
                case 5:
                    setSpecialDeal();
                    break;
                case 6:
                    viewVisitorStats();
                    break;
                case 7:
                    viewFeedback();
                    break;
                case 8:
                    System.out.println("Logged out.");
                    return;  // Return to the main menu
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void manageAttractions()
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("\nManage Attractions:");
            System.out.println("1. Add Attraction");
            System.out.println("2. View Attractions");
            System.out.println("3. Remove Attraction");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline character
            switch (choice)
            {
                case 1:
                    // Implement functionality to add attractions
                    System.out.print("Enter Attraction Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Attraction Description: ");
                    String description = sc.nextLine();

                    // Generate a unique ID for the attraction
                    // int attractionId = attractions.size() + 1;
                    // Create a new Attraction object and add it to the map.
                    Attraction newAttraction = new Attraction( name, description);
                    attractionList.add(newAttraction);

                    System.out.println("Attraction added successfully.");
                    break;
                case 2:
                    for(Attraction a : attractionList)
                    {
                        System.out.println("Attraction name:"+a.getName());
                        System.out.println("Attraction ID:"+a.getAttractionID());
                        System.out.println("Attraction Description:"+a.getDescription());
                    }
                    break;



                case 3:

                    System.out.print("Enter Attraction Id to Remove : ");
                    int id = sc.nextInt();
                    Iterator<Attraction> iterator = attractionList.iterator();
                    while (iterator.hasNext())
                    {
                        Attraction a = iterator.next();
                        if (id == a.getAttractionID())
                        {
                            iterator.remove();  // Safely remove the attraction using the iterator
                        }
                    }
                    break;

                case 4:
                    return;  // Return to the admin menu
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void visitorReg()
    {
        Scanner sc = new Scanner(System.in);

        // Implement visitor registration logic
        System.out.print("Enter Visitor Name: ");
        String vName = sc.nextLine();
        System.out.print("Enter Visitor Age: ");
        int vAge = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        System.out.print("Enter Visitor Phone Number: ");
        String vPhoneNumber = sc.nextLine();
        System.out.print("Enter Visitor Balance: ");
        double vBalance = sc.nextDouble();
        sc.nextLine();  // Consume the newline character
        System.out.print("Enter Visitor Email: ");
        String vEmail = sc.nextLine();
        System.out.print("Enter Visitor Password: ");
        String vPassword = sc.nextLine();

        // Create a new visitor object with the provided information and add it to your data structure (not implemented here).
        visitor nVisitor = new visitor(vName,vEmail,vPhoneNumber,vAge,vBalance,vPassword);


        // Add the new visitor to the ArrayList
        visitors.add(nVisitor);

        System.out.println("Registration is successful.");
    }

    // Implement visitor login
    private static visitor visitorLogin()
    {
        Scanner sc = new Scanner(System.in);

        // Implement visitor login logic
        System.out.print("Enter Visitor Email: ");
        String vEmail = sc.nextLine();
        System.out.print("Enter Visitor Password: ");
        String vPassword = sc.nextLine();

        // Implement logic to validate the visitor's login credentials (not implemented here).
        // If the login is successful, you can provide access to visitor functionalities.
        for (visitor v : visitors) {
            if (v.getEmail().equals(vEmail) && v.getPassword().equals(vPassword)) {
                // Implement logic for what to do when the login is successful
                System.out.println("Login Successful.");
                return v;  // Exit the loop once a matching visitor is found
            }
        }

        System.out.println("Login Failed. Invalid email or password.");
        return null; // Implement visitor functionalities (not implemented here).
    }
    private static void manageAnimals() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nManage Animals:");
            System.out.println("1. Add Animal");
            System.out.println("2. Update Animal");
            System.out.println("3. Remove Animal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (choice)
            {
                case 1:
                    // Implement functionality to add animals
                    System.out.print("Enter Animal Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Animal Type (Mammal, Reptile, or Amphibian): ");
                    String type = sc.nextLine();

                    // Create a new animal object based on the provided type.

                    switch (type.toLowerCase()) {
                        case "mammal":
                            Mammal newAnimal = new Mammal(name);
                            animals.add(newAnimal);
                            break;
                        case "reptile":
                            Reptile newAni = new Reptile(name);
                            animals.add(newAni);
                            break;
                        case "amphibian":
                            Amphibian newA = new Amphibian(name);
                            animals.add(newA);
                            break;

                        default:
                            System.out.println("Invalid animal type.");
                            continue;
                    }

                    // Add the new animal to the animals list.


                    System.out.println("Animal added successfully.");
                    break;

                case 2:
                    System.out.print("Enter the name of the animal you want to update: ");
                    String animalName = sc.nextLine();

                    // Find the animal by name
                    Animal animalToUpdate = null;
                    for (Animal animal : animals)
                    {
                        if (animal.getName().equalsIgnoreCase(animalName)) {
                            animalToUpdate = animal;
                            break;
                        }
                    }

                    if (animalToUpdate == null)
                    {
                        System.out.println("Animal not found.");
                    }
                    else
                    {
                        System.out.print("Enter new name for the animal: ");
                        String newAnimalName = sc.nextLine();
                        animalToUpdate.setName(newAnimalName);
                        System.out.println("Animal updated successfully.");
                    }
                    break;

                // Implement other cases for modifying and removing animals

                case 3:
                    System.out.print("Enter the name of the animal you want to remove: ");
                    String aName = sc.nextLine();

                    // Find the animal by name
                    Animal animalToRemove = null;
                    for (Animal animal : animals)
                    {
                        if (animal.getName().equalsIgnoreCase(aName))
                        {
                            animalToRemove = animal;
                            break;
                        }
                    }

                    if (animalToRemove == null)
                    {
                        System.out.println("Animal not found.");
                    }
                    else
                    {
                        // Remove the animal from the list
                        animals.remove(animalToRemove);
                        System.out.println("Animal removed successfully.");
                    }
                    break;
                case 4:
                    return;// Return to the admin menu

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void scheduleEvents()
    {
        System.out.println("Here are all events that can be scheduled");
        for (Attraction v : attractionList)
        {

            if (v.getIsscheduled()==0)
            {
                System.out.println(v.getAttractionID()+":"+v.getName());
            }

        }
        System.out.println("enter ID");
        Scanner sc = new Scanner(System.in);
        int i =sc.nextInt();
        // Attraction a= new Attraction("","");

        for (Attraction v : attractionList)
        {

            if (v.getAttractionID()==i)
            {
                v.setIsscheduled(1);
                System.out.println("Enter the cost");
                int j =sc.nextInt();
                v.setTicketPrice(j);
            }

        }


    }
    private static void setDiscounts()
    {
        // Implement discount setting logic here.
        System.out.println("Add Category") ;
        Scanner sc = new Scanner(System.in);
        String cat= sc.nextLine();
        System.out.println("Add percent");
        double per = sc.nextDouble();
        DiscountCategory obj =new DiscountCategory(cat,per);
        discounts.add(obj);
        // add into discount category arra

        System.out.println("done");
    }
    private static void setSpecialDeal()
    {
        // Implement special deal setting logic here.
        System.out.println("Add min num of tickets(make it more than 3 )") ;
        Scanner sc = new Scanner(System.in);
        int tick= sc.nextInt();
        System.out.println("Add percent");
        double per = sc.nextDouble();
        SpecialDeal obj =new SpecialDeal(tick,per);
        specialDeals.add(obj);
        System.out.println("done");


    }
    private static void viewVisitorStats()
    {
        // Implement visitor statistics viewing logic here.
        int max =0;
        for(Attraction a : attractionList)
        {
            if(a.getPopularity()>max)
            {
                max=a.getPopularity();
            }
        }
        for(Attraction a : attractionList)
        {
            if(max==a.getPopularity())
            {
                System.out.println("Most Popular Attraction is "+a.getName());
                break;
            }
        }
        System.out.println("Revenue is "+revenue);

    }
    private static void viewFeedback()
    {
        System.out.println("View Feedback:");

        if (visitors.isEmpty())
        {
            System.out.println("No feedback available. There are no registered visitors.");
        }
        else
        {
            // Loop through the visitors and display their feedback if available.
            for (visitor v : visitors)
            {
                String feedback = v.getFeedback();
                if (feedback != null && !feedback.isEmpty())
                {
                    System.out.println("Visitor: " + v.getName());
                    System.out.println("Feedback: " + feedback);

                }
            }
        }
    }
    public static void visitorMenu(visitor visitor)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome, " + visitor.getName() + "!");
        while (true) {
            System.out.println("1. Explore the Zoo");
            System.out.println("2. Buy Membership");
            System.out.println("3. Buy Tickets");
            System.out.println("4. View Discounts");
            System.out.println("5. View Special Deals");
            System.out.println("6. Visit Animals");
            System.out.println("7. Visit Attractions");
            System.out.println("8. Leave Feedback");
            System.out.println("9. Log Out");
            System.out.print("Enter your choice: ");
            int visitorChoice = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (visitorChoice) {
                case 1:
                    exploreZoo();
                    break;
                case 2:
                    buyMembership(visitor);
                    break;
                case 3:
                    buyTickets(visitor);
                    break;
                case 4:
                    for( DiscountCategory d : discounts)
                    {
                        System.out.println("Category:-"+d.getName());
                        System.out.println("Percent-"+d.getDiscountPercentage());
                        System.out.println("Code:-"+d.getCouponcode());
                    }
                    break;
                case 5:
                    viewSpecialDeals();
                    break;
                case 6:
                    if(visitor.hasMembership())
                    {
                        System.out.println("Select animal to visit by typing name ");
                        String name = sc.nextLine();
                        for(Object b :animals)
                        {
                            if(name.equals(((Animal)b).getName()))
                            {
                                System.out.println("1) Feed it");
                                System.out.println("2) Read description");
                                System.out.println("2) Leave");
                                int n =sc.nextInt();
                                Animal a;
                                switch (((Animal)b).getType().toLowerCase()) {
                                    case "mammal":
                                        a = new Mammal(((Animal) b).getName());

                                        break;
                                    case "reptile":
                                        a = new Reptile(((Animal) b).getName());

                                        break;
                                    case "amphibian":
                                        a = new Amphibian(((Animal) b).getName());

                                        break;

                                    default:
                                        System.out.println("Invalid animal type.");
                                        continue;
                                }
                                if(n==1)
                                {

                                    if (a instanceof Mammal)
                                    {
                                        ((Mammal) a).makeSound();
                                    }
                                    else if (a instanceof Reptile)
                                    {
                                        ((Reptile) a).makeSound();
                                    }
                                    else if (a instanceof Amphibian)
                                    {
                                        ((Amphibian) a).makeSound();
                                    }
                                    else
                                    {
                                        System.out.println("Error occurred");
                                    }


                                }
                                else if (n==2)
                                {

                                    if (a instanceof Mammal)
                                    {
                                        ((Mammal) a).showDescription();
                                    }
                                    else if (a instanceof Reptile)
                                    {
                                        ((Reptile) a).showDescription();
                                    }
                                    else if (a instanceof Amphibian)
                                    {
                                        ((Amphibian) a).showDescription();
                                    }
                                    else
                                    {
                                        System.out.println("Error occurred");
                                    }
                                }
                                else {
                                    return;
                                }
                            }
                        }
                    }
                    else
                    {
                        System.out.println("cant visit without membership");
                    }
                    // Implement functionality to visit animals
                    break;
                case 7:
                    // Implement functionality to visit attractions
                    viewAttraction(visitor);
                    break;
                case 8:
                    provideFeedback(visitor);
                    break;
                case 9:
                    System.out.println("Logged out.");
                    return;  // Return to the main menu
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    private static void viewSpecialDeals()
    {
        for (SpecialDeal deal : specialDeals)
        {
            System.out.println("Buy " + deal.getMinAttractions() + " tickets and get " + deal.getDiscountPercentage() + "% off");
        }
    }

    private static void provideFeedback(visitor visitor)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your feedback: ");
        String feedback = sc.nextLine();
        visitor.setFeedback(feedback);
        System.out.println("Thank you for your feedback!");
    }
    private static void exploreZoo()
    {
        System.out.println("ZOOtopia offers an adventure ride that allows you to explore unexplored trails. Buy your ticket now!\n");
        while (true)
        {
            System.out.println("Explore the Zoo:\n" +
                    "1. View Attractions\n" +
                    "2. View Animals\n" +
                    "3. Exit\n");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n==1)
            {
                System.out.println("Attractions :-\n");

                for (Attraction attraction : attractionList)
                {
                    System.out.println(attraction.getAttractionID() + ". " + attraction.getName());
                    System.out.println("Description: " + attraction.getDescription());
                    System.out.println("Open: " + (attraction.getIsscheduled()==1 ? "Yes" : "No"));
                }
            }
            else if (n==2)
            {
                System.out.println("Animals:");
                int i=1;
                for (Animal ani : animals)
                {
                    System.out.println(i++ +") "+ani.getName()+"   Type :-"+ani.getType());

                }
            }
            else
            {
                return;
            }}
    }

    private static void viewAttraction(visitor visitor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("View Attractions:");

        for (Attraction attraction : attractionList) {
            if (attraction.getIsscheduled() == 1) {
                System.out.println(attraction.getAttractionID() + ". " + attraction.getName());
            }
        }
        if (visitor.hasMembership()) {
            System.out.print("Enter the attraction ID to view (0 to exit): ");
            int attractionID = sc.nextInt();


            if (attractionID > 0) {
                if(visitor.getMembership().getType().equals("Premium"))
                {
                    for(Attraction a :attractionList)
                    {
                        a.increasepopularity();
                        if (a.getAttractionID()==attractionID)
                        {
                            System.out.println(a.getName()+" visited       Description:" +a.getDescription());
                            break;
                        }
                    }
                }
                else {


                    List<Ticket> available = visitor.getPurchasedTickets();
                    for(Ticket t  :available)
                    {
                        if(t.getAttractionID()==attractionID)
                        {   if(t.getNumberOfTickets()>0){
                            visitor.removeticket(t);
                            for(Attraction a :attractionList)
                            {
                                if (a.getAttractionID()==attractionID)
                                {  a.increasepopularity();
                                    System.out.println(a.getName()+" visited       Description:" +a.getDescription());
                                    return;
                                }
                            }
                            return;
                        }}
                    }


                }
            } else {
                System.out.println("Attraction not found.");
            }
        }
    }

    private static void buyMembership(visitor visitor)
    {   if(!visitor.hasMembership()){
        Scanner sc = new Scanner(System.in);
        System.out.println("Buy Membership:");
        System.out.println("1. Basic Membership - $20");
        System.out.println("2. Premium Membership - $50");
        System.out.print("Enter the membership type (1 for Basic, 2 for Premium, or 0 to exit): ");

        int membershipChoice = sc.nextInt();
        double disc=0;
//        System.out.println("Available Discount Categories:");
//
//        for (DiscountCategory discountCategory : discounts) {
//            System.out.println("Category: " + discountCategory.getName() + " Discount: " + discountCategory.getDiscountPercentage() + "%"+"    Code:"+discountCategory.getCouponcode());
//        }
//
//        System.out.print("Enter the coupon code: ");
//
//        String couponCode = sc.nextLine();
//        double disc =0;
//        // Check if the entered coupon code is valid
//        for (DiscountCategory discountCategory : discounts) {
//
//                if (couponCode.equals(discountCategory.getCouponcode())) {
//
//                    if(discountCategory.getName().equals("Senior")){
//                        if(visitor.getAge()>60)
//                        {
//                            disc = discountCategory.getDiscountPercentage();
//                            System.out.println("Coupon code applied: " + discountCategory.getName() + " Discount: " + discountCategory.getDiscountPercentage() + "%");
//                        }
//                        else
//                        {
//                            break;
//                        }
//                    }
//                    else if(discountCategory.getName().equals("Minor"))
//                    {
//                        if(visitor.getAge()<19)
//                        {
//                            disc = discountCategory.getDiscountPercentage();
//                            System.out.println("Coupon code applied: " + discountCategory.getName() + " Discount: " + discountCategory.getDiscountPercentage() + "%");
//                        }
//                        else
//                        {
//                            break;
//                        }
//                    }
//                   else {
//                        disc = discountCategory.getDiscountPercentage();
//
//                System.out.println("Coupon code applied: " + discountCategory.getName() + " Discount: " + discountCategory.getDiscountPercentage() + "%");
//                break;}
//            }
//        }


        if (membershipChoice == 1) {
            Membership basicMembership = new Membership("Basic");
            visitor.setMembership(basicMembership);
            double c=20*(1-disc/100.0);
            revenue+=c;
            visitor.setBalance(visitor.getBalance() - c);
            // Deduct the membership cost.
            System.out.println("Basic Membership purchased.");
            System.out.println("Balance is $"+visitor.getBalance());
        } else if (membershipChoice == 2) {
            Membership premiumMembership = new Membership("Premium");
            visitor.setMembership(premiumMembership);
            double c=50*(1-disc/100.0);
            revenue+=c;
            visitor.setBalance(visitor.getBalance() - c); // Deduct the membership cost.
            System.out.println("Premium Membership purchased.");
            System.out.println("Balance is $"+visitor.getBalance());
        } else if (membershipChoice == 0) {
            System.out.println("Membership purchase canceled.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
    else
    {
        System.out.println("Membership cant be upgraded");
    }
    }
    private static void buyTickets(visitor visitor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buy Tickets:");

        if (!visitor.hasMembership()) {
            System.out.println("You need a membership to buy tickets.");
            return;
        }

        // Check if the visitor has a premium membership
        if (visitor.getMembership().getType().equals("Premium")) {
            System.out.println("Premium members have free access to attractions.");
            return;
        }

        for (Attraction attraction : attractionList) {
            System.out.println(attraction.getAttractionID() + ". " + attraction.getName()+"("+attraction.getTicketPrice()+"$)");
        }

        System.out.print("Enter the attraction ID to buy a ticket (0 to exit): ");
        int attractionID = sc.nextInt();
        System.out.print("Enter the number of tickets to buy ");
        int num =sc.nextInt();


        if (attractionID > 0) {
            for(Attraction selectedAttraction :attractionList )
            {

                if (selectedAttraction.getAttractionID()==attractionID) {
                    double ticketPrice = selectedAttraction.getTicketPrice();

                    // Apply discount based on the visitor's membership and coupon code
                    double discountPercentage = 0.0;
                    if (visitor.hasMembership() && visitor.getMembership().getType().equals("Basic")) {
                        // Ask if the visitor wants to apply a coupon code
                        System.out.println("Would you like to add a coupon code? (1-Yes, 2-No)");
                        int applyCoupon = sc.nextInt();

                        if (applyCoupon == 1) {
                            System.out.println("Available Discount Categories:");
                            for (DiscountCategory discountCategory : discounts) {
                                System.out.println("Category: " + discountCategory.getName() + " Discount: " + discountCategory.getDiscountPercentage() + "%");
                            }

                            System.out.print("Enter the coupon code: ");
                            sc.nextLine();
                            String couponCode = sc.nextLine();

                            // Check if the entered coupon code is valid
                            for (DiscountCategory discountCategory : discounts) {
                                if (couponCode.equals(discountCategory.getCouponcode())) {
                                    if(discountCategory.getName().equals("Senior")){
                                        if(visitor.getAge()>60)
                                        {
                                            discountPercentage = discountCategory.getDiscountPercentage();
                                            ticketPrice = ticketPrice * (1 - discountPercentage / 100.0);
                                            System.out.println("Coupon code applied: " + discountCategory.getName() + " Discount: " + discountCategory.getDiscountPercentage() + "%");
                                        }
                                        else
                                        {
                                            break;
                                        }
                                    }
                                    else if(discountCategory.getName().equals("Minor"))
                                    {
                                        if(visitor.getAge()<19)
                                        {
                                            discountPercentage = discountCategory.getDiscountPercentage();
                                            ticketPrice = ticketPrice * (1 - discountPercentage / 100.0);
                                            System.out.println("Coupon code applied: " + discountCategory.getName() + " Discount: " + discountCategory.getDiscountPercentage() + "%");
                                        }
                                        else
                                        {
                                            break;
                                        }
                                    }
                                    else{
                                        discountPercentage = discountCategory.getDiscountPercentage();
                                        ticketPrice = ticketPrice * (1 - discountPercentage / 100.0);
                                        System.out.println("Coupon code applied: " + discountCategory.getName() + " Discount: " + discountCategory.getDiscountPercentage() + "%");
                                        break;}
                                }
                            }
                        }
                    }
                    if (num>0){
                        System.out.println("Applying special deals");
                        double specialdiscount=0;
                        int max =0;
                        for(SpecialDeal s :specialDeals)
                        {
                            if(num>=s.getMinAttractions()&& s.getMinAttractions()>max)
                            {
                                specialdiscount=s.getDiscountPercentage();
                                max=s.getMinAttractions();
                            }
                        }
                        // Check the visitor has enough balance to buy the ticket
                        ticketPrice=ticketPrice*(1-(specialdiscount/100.0));}
                    if (visitor.getBalance() >= num *ticketPrice)
                    {

                        visitor.setBalance(visitor.getBalance() - num* ticketPrice); // Deduct the ticket price from the visitor's balance
                        // selectedAttraction.decreaseTicketCount(1); // Decrease the available ticket count for the attraction
                        System.out.println(num +" Tickets purchased for " + selectedAttraction.getName());
                        System.out.println("Tickets Price: $" + num* ticketPrice);
                        System.out.println("Remaining Balance: $"+visitor.getBalance());

                        // Update the revenue
                        revenue += num * ticketPrice;

                        visitor.addPurchasedTicket(selectedAttraction.getAttractionID(),num );

                    }
                    else
                    {
                        System.out.println("Insufficient balance to buy a ticket.");
                    }

                }

            }
        }
    }
}

