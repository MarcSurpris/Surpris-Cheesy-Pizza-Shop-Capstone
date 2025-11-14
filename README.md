# Surpris-Cheesy-Pizza-

![img.png](img.png)

PIZZA-liciousCapstone 2: Advanced Java OOP – Point of Sale SystemPIZZA-licious Logo
Custom pizza ordering made deliciously simple.Project OverviewPIZZA-licious is a console-based point-of-sale (POS) system for a custom pizza shop. It replaces paper-based ordering with a fully automated, OOP-driven Java application that allows customers to:Build fully customizable pizzas (size, crust, toppings, extras, stuffed crust)  
Add drinks and garlic knots  
Validate orders (no empty orders!)  
Generate and save timestamped receipt files  
(Bonus) Order signature pizzas (Margherita, Veggie)

FeaturesFeature
Description
Custom Pizzas
3 sizes, 4 crusts, unlimited toppings (with extras)
Topping Categories
Meat, Cheese, Regular, Sauce, Side
Pricing Engine
Dynamic pricing per size (no enums!)
Order Validation
Must have pizza OR drink/knots
Receipt System
Auto-saved to receipts/yyyyMMdd-HHmmss.txt
Signature Pizzas
Margherita & Veggie (subclasses of Pizza)
Clean Architecture
Packages: model, util, app

Application Flow

Home Screen
└──> New Order
└──> Order Screen
├── Add Pizza (customize)
├── Add Drink
├── Add Garlic Knots
├── Checkout → View Receipt → Confirm → Save File
└── Cancel Order

ScreenshotsHome Screentext

Home Screen
1) New Order
0) Exit

Order Screentext

Order Screen
1) Add Pizza
2) Add Drink
3) Add Garlic Knots
4) Checkout
0) Cancel Order

Sample Receipt (receipts/20250405-143022.txt)text

Order Receipt
Date: 20250405-143022
MEDIUM_12_INCH REGULAR crust pizza with stuffed crust with toppings: Pepperoni (extra x1), Mozzarella - $17.00
Large Coke drink - $3.00
6 Garlic Knots - $9.00
Total: $29.00

Class DiagramClass DiagramGenerated with PlantUML. See diagrams/class-diagram.puml
Project Structure

PIZZA-licious/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── pizzalicious/
│                   ├── app/        → PizzaShopApp.java
│                   ├── model/      → Pizza, Topping, Order, etc.
│                   └── util/       → PizzaSize, CrustType, etc.
├── receipts/                   → Auto-generated receipts
├── diagrams/
│   ├── class-diagram.png
│   └── class-diagram.puml
├── README.md
└── .gitignore

How to RunPrerequisitesJava 14+ (for switch expressions)
Git

StepsClone the repo:bash

git clone https://github.com/MarcSurpris/Surpris-Cheesy-Pizza-shop.git
cd Surpris-Cheesy-Pizza-shop

Compile:bash

javac -d bin $(find src/main/java -name "*.java")

Run:bash

java -cp bin com.pizzalicious.app.PizzaShopApp

Order away! Receipts saved in receipts/

Interesting Code Snippetjava

// Dynamic meat pricing based on pizza size (no enums!)
public static double getMeatPrice(String size) {
return switch (size) {
case PERSONAL_8_INCH -> 1.00;
case MEDIUM_12_INCH  -> 2.00;
case LARGE_16_INCH   -> 3.00;
default -> 0.0;
};
}

From PizzaSize.java — clean, readable, and scalable!
GitHub Project BoardView Project Board →To Do → In Progress → Review → Done
20+ meaningful commits
Feature branches: feature/pizza, feature/order, etc.

Technologies UsedJava 17
OOP Principles: Inheritance, Polymorphism, Encapsulation, Abstraction
Git & GitHub
PlantUML for diagrams
Console I/O

Future EnhancementsWeb interface (Spring Boot)
Database storage (JDBC)
Online ordering
Loyalty points system

AuthorMarc Surpris
Pluralsight Java Capstone Student
GitHub Profile"Code like a chef. Deliver like a pro."
Thank you for reviewing PIZZA-licious!

