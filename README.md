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
* **Rating**: Id rating (pk), id transaction (fk), message, rating.

### Users and permissions

* **Web Managers (Salesman)**: Admin user. This user is able to edit and add the products the web is currently selling, see graphics, modify information ...
* **Client Users**: Logged User. This user can access and buy (processing the products stacked on the cart) all the products available. Comment and rate products. The client can also edit his personal information.  
* **Anonymous Users**: This user can access and see all features of the web, and put the products in the cart. However, a user must be logged for buying as buying needs important information, and to be sure each transsaction has a user.

### Images

All products have one associated image. There are also some images for the backgrounds and headers for the different views of the application.

### Graphics

The website will have two bar graphs, which will be responsible of showing the best rated products and the most sold / most popular products. They can be found in the graphics view of the application, only accesible for the admin (salesman). 

### Complementary Technology

The website uses GoogleMaps maps and external e-mail sending in the contact us view, showing where the developper group is located and how to contact them.

### Algorithm or advanced query

Cause the website is product sale related. An evaluation system will be implemented, so that the search can be carried out taking into account the ratings (best rated first). The application also shows a pannel personalized for each user where recommended products can be found (based on the products bought by the user).
