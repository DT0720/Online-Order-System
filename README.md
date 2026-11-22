# Online Order System

A Java desktop application prototype for shopping online, built with **Java Swing** and **JGoodies Forms**. Customers can browse products by category (Electronic, Food, Dress, Sports), while administrators have a separate login. Prices are in **BDT** (Bangladeshi Taka).

> **Status:** Work in progress. The user interface for every screen is built, but screen navigation, authentication, and order processing are not wired up yet. See [Current Status](#current-status) below.

## Screens

| Screen | Class | Description |
|---|---|---|
| Welcome | `SelectUser` | Landing page with **Admin** and **Customer** buttons |
| Admin Login | `AdminLogin` | Username and password form with Login, Reset, and Back |
| Customer Login | `User_Login` | Username and password form, with a link to register |
| Registration | `Registration` | Sign-up form: username, password, contact, gender, terms checkbox |
| Dashboard | `Dashboard` | "Shop Now" page with a button for each category |
| Electronic | `Electronic` | TV, gaming desktop PC, air conditioner |
| Food | `Food` | Burger, pizza, milkshake |
| Dress | `Dress` | Sharee, women's winter clothes, kamiz, men's shirt, jeans |
| Sports | `Sports` | Cricket bat, carrom board, football |

Each product card shows an image, a description, a price, and an **Add Qty** field with an **OK** button. The category screens also have **Pay** and **Back** buttons.

### Product Catalog

| Category | Item | Price (BDT) |
|---|---|---|
| Electronic | LG Smart TV 36'' (4K UHD) | 50,000 |
| Electronic | Intel 12th Gen Core i5-12400F Gaming Desktop PC | 80,000 |
| Electronic | Xiaomi Viomi A1 1 Ton Split Smart AC | 60,000 |
| Food | Creamy Double Cheese Burger | 200 |
| Food | Grilled Chicken Pizza (Large) | 1,350 |
| Food | Oreo Milkshake | 150 |
| Dress | Bengali Sharee | 7,000 |
| Dress | Women's Winter Clothes | 5,000 |
| Dress | Kamiz | 2,000 |
| Dress | Men's Shirt | 1,000 |
| Dress | Denim Jeans | 2,000 |
| Sports | Tape Tennis Cricket Bat | 500 |
| Sports | Carrom Board 40" (Mahogany) | 3,000 |
| Sports | Football (Deer V, Black & White) | 1,200 |

## Tech Stack

- **Language:** Java
- **GUI:** Swing (`JFrame`, `JPanel`, `JTextField`, etc.), designed with Eclipse WindowBuilder
- **Layout/UI helpers:** [JGoodies Forms 1.8.0](https://www.jgoodies.com/freeware/libraries/forms/) and JGoodies Common 1.8.0
- **IDE:** Eclipse

## Project Structure

```
Online Order System/
├── src/
│   ├── OnlineOrderSystem/        # All Java source files (package OnlineOrderSystem)
│   │   ├── SelectUser.java
│   │   ├── AdminLogin.java
│   │   ├── User_Login.java
│   │   ├── Registration.java
│   │   ├── Dashboard.java
│   │   ├── Electronic.java
│   │   ├── Food.java
│   │   ├── Dress.java
│   │   ├── Sports.java
│   │   ├── Button.java
│   │   └── AbstractClass.java
│   └── images/                   # Product images loaded from the classpath
├── jgoodies-common-1.8.0.jar
├── jgoodies-common-1.8.0-sources.jar
├── jgoodies-forms-1.8.0.jar
├── jgoodies-forms-1.8.0-sources.jar
├── .classpath
└── .project
```

The product screens load images from `/images/` on the classpath, so the following files must be in `src/images/`:

`saree.png`, `wcloth.png`, `kamiz.jpg`, `shirt.png`, `jeans.png`, `tv.png`, `computer.png`, `ac.png`, `burger.png`, `pizza.png`, `shake.png`, `cricketbat.png`, `carrom.png`, `football.png`

## Getting Started

### Prerequisites

- JDK 8 or later
- Eclipse IDE (recommended, since the project includes Eclipse config files)

### Run in Eclipse

1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR-USERNAME/online-order-system.git
   ```
2. In Eclipse, choose **File → Import → General → Existing Projects into Workspace** and select the cloned folder.
3. Make sure the two JGoodies jars are on the build path (they are listed in `.classpath`).
4. Open `SelectUser.java` and choose **Run → Run As → Java Application**.

### Run from the command line

```bash
# Compile
javac -cp "jgoodies-common-1.8.0.jar:jgoodies-forms-1.8.0.jar" -d bin src/OnlineOrderSystem/*.java

# Copy images onto the classpath
cp -r src/images bin/

# Run the welcome screen
java -cp "bin:jgoodies-common-1.8.0.jar:jgoodies-forms-1.8.0.jar" OnlineOrderSystem.SelectUser
```

On Windows, use `;` instead of `:` in the classpath and `xcopy` instead of `cp`.

Every screen class has its own `main` method, so you can also run any screen on its own to preview it.

## Current Status

**Working**
- All screens are laid out and can be launched individually
- Reset buttons on the login, admin login, and registration forms clear their fields

**Not yet implemented**
- Navigation between screens (Login, Back, Register, and category buttons have no actions yet)
- Credential validation and user storage (no database or file persistence)
- Cart, quantity handling, and payment (the **OK** and **Pay** buttons do nothing yet)
- Form validation on the registration screen

**Known issues**
- `Button.java` and `AbstractClass.java` still contain code from another project. They reference classes that don't exist here (`Login`, `ExpDate`, `ManageMedicine`, `ManageAgent`) and are missing `Logger`/`Level` imports, so they will not compile as-is. Remove or rewrite them for this project.
- `SelectUser.java` loads a background image from an absolute path on the author's computer (`C:\Users\User\Pictures\...`). Move the image into `src/images/` and load it with `getResource` like the other screens.
- The font names used on some labels (Stencil, Sugarpunch DEMO, Star Black Inline) may not be installed on every machine, in which case Java falls back to a default font.

## Roadmap

- [ ] Connect screens: Welcome → Login/Register → Dashboard → Categories
- [ ] Store users (file or database) and validate logins
- [ ] Shopping cart with running total
- [ ] Payment/checkout screen and order confirmation
- [ ] Admin features (manage products and view orders)

## Author

[Durjoy Talukdar]
