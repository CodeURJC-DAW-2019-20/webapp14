# GSHOP

## Team members

| Name | Mail | Github user|
|--------|--------|------------|
|Daniel Lahera Esteban| d.lahera@alumnos.urjc.es | DaniL97 |
|Raúl Hernández del Amo| r.hernandezdel@alumnos.urjc.es | RaulHernandezdelAmo |
|Enrique Garrido Gónzalez | e.garridogon@alumnos.urjc.es | kikegg |
|Víctor López Rodríguez | v.lopezrodr@alumnos.urjc.es | Victorlopezro |
|Guillermo Martín García | g.martingarcia@alumnos.urjc.es | Wilhelm-mar |

## WEBAPP

### Description

GSHOP is a pc gaming online store, allowing users to buy and rate pc related products. It offers laptops, screens, mice and all kind of gaming items.

### Entities

* **Product**: Each product has a product id (pk), name, price, description, category, rating, stock.
* **Buyout**: Id transaction (pk), id product (fk), id user (fk), status (issue, shipped, payment accepted...).
* **User**: Id user (pk), email, password, address, payment method, rol.
* **Rating**: Id rating (pk), id transaction (fk), id product, rating.

### Users and permissions

* **Web Managers (Salesman)**: Admin user. This user is able to edit and add the products the web is currently selling, see graphics, modify information ...
* **Client Users**: Logged User. This user can access and buy (processing the products stacked on the cart) all the products available. Comment and rate products. The client can also edit his personal information.  
* **Anonymous Users**: This user can access and see all features of the web, and put the products in the cart. However, a user must be logged for buying as buying needs important information, and to be sure each transsaction has a user and view his shopping list.  

### Images

All products have one associated image. There are also some images for the backgrounds and headers for the different views of the application. There will also be a photo associated with each team member in the contacts section.

### Graphics

The website will have two bar graphs, which will be responsible of showing the best rated products and the most sold / most popular products. They can be found in the graphics view of the application, only accesible for the admin (salesman). 

### Complementary Technology

The website uses GoogleMaps maps and external e-mail sending in the contact us view, showing where the developper group is located and how to contact them.

### Algorithm or advanced query

Cause the website is product sale related, an evaluation system will be implemented, so that the search can be carried out taking into account the ratings (best rated first). The application also shows a pannel personalized for each user where recommended products can be found (based on the products bought by the user).
Users, depending on the purchases they have made, will receive a panel with customized products for them.
For this to work we will use the category of products in the transaction list of each user.

### Index
![github-small](https://github.com/CodeURJC-DAW-2019-20/webapp14/blob/develop/imagereadme/Index.png)

Main page of the website, from here we can access the different sections such as the store, contacts or graphics. We find the list of objects separated by categories and also the most popular products. Also the news of the store will be put so that the user can see it.


### Products
![github-small](https://github.com/CodeURJC-DAW-2019-20/webapp14/blob/develop/imagereadme/Products.png)

The store of the website. Here we find the list of all the objects for sale in the store, which can be divided by categories, by prices or by ranking. If we click on an object it will take us to its corresponding view with the product details and if we click on add to the cart we can put it in our personal cart for later purchase.

### Product detail
![githug-samll](https://github.com/CodeURJC-DAW-2019-20/webapp14/blob/develop/imagereadme/Singleproduct.png)

When you click on a specific product in the store it will take you to its corresponding detailed page where you will put the characteristics of the object in question, in addition to some photos, the price, a brief description, and the possibility of adding the object to the cart.

### Chekout
![github-small](https://github.com/CodeURJC-DAW-2019-20/webapp14/blob/develop/imagereadme/Checkout.png)

Once we have completed the cart we want in the store we will access this section, where we can review our purchase and we will have to enter our data to access our account. In case of not having an account, we must create one and enter the payment method.

### Transactions
![github-small](https://github.com/CodeURJC-DAW-2019-20/webapp14/blob/develop/imagereadme/transactions.png)

This page can only be accessed by a previously logged in user. This is a purchase history, where the user can check the data of previous purchases that he has made such as the product id, seller id or in what state the purchase is (it is on the way, there has been an error, etc. )

### Graphics
![github-small](https://github.com/CodeURJC-DAW-2019-20/webapp14/blob/develop/imagereadme/Graphics.png)

In view of the charts, we have two different charts, one of which contains the best rated category and a second chart with the best selling category. These graphics are updated according to sales and rankin that users put to each object.

### Contacts
![github-small](https://github.com/CodeURJC-DAW-2019-20/webapp14/blob/develop/imagereadme/contact.png)

This part of the website is the contacts section, where you will find the personal data of the group members and a photo of each. If you click on any member name, you will be redirected to his email, in case you want to have contact with him. We have also included a google maps space so that people know where to find us.

### User
![github-small](https://github.com/CodeURJC-DAW-2019-20/webapp14/blob/develop/imagereadme/user.png)

In this section of the website a logged-in user will be able to see the personal data that is stored in it and may change the data that needs a modification. At the bottom you will have a button to access the transactions section you have made.

### Register
![github-small](https://github.com/CodeURJC-DAW-2019-20/webapp14/blob/develop/imagereadme/Register.png)

In case of not having an account, the user can create one by accessing this section, filling in all the information they ask you for, among them: name, password, address, postal code, credit card, etc.

### Login
![github-small](https://github.com/CodeURJC-DAW-2019-20/webapp14/blob/develop/imagereadme/Login.png)

In order to become a logged-in user, after having created an account in the register section you must enter the login and enter your username and password and thus be able to access purchases and other exclusive sections of the logged-in users.

### Diagram
![github-small](https://github.com/CodeURJC-DAW-2019-20/webapp14/blob/develop/imagereadme/Diagram.png)
