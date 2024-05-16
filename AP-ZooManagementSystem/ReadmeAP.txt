AP assignment 2 readme

How to Run:
1) mvn clean
2) mvn compile
3) mvn package
4) mvn exec:java(to execute the program)

Assumptions
1-visitor after registration has to login
2- animal has 6 animals defined(lion,monkey for mammal , snake alligator for Reptile and frog turtle for amphibian) and others just come under category
3- 2 basic special deals are there user can add more
4- 2 basic minor and senior discount are there rest can be defined by admin but those coupon code will be direcly be applied but cannot be checked
5- animal here is my parent class
6 - can make sound interface has both the function needed to be defined
7 -at one iteration visitor can buy n number of tickets of 1 attraction then it can again select option to buy ticket to buy the tickets of other attraction
8 - first special deals is applied on ticket then the discount code
9 - discount code is in form category + percent +".0"
10 - only those 6 defined animal type has special sound and description others dont they just make sound and sho whether it is mammal amphibian etc..
