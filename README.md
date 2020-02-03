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

### Entities

* **Product**: Each product has a product id (pk), name, price, category, rating.
* **Buyout**: Id transaction (pk), total price, id products (fk), status
* **User**: Id user (pk), email, password, address, payment method
* **Opinion**: Message, rating, id user (fk)

### Users and permissions

* **Web Managers (Salesman)**: Admin user. This user is able to edit the products the web is currently selling, see graphics, modify information ...
* **Client Users**: Logged User. This user can access and buy (processing the products stacked on the cart) all the products available. Comment, rate and add to favorites that products. The client can also edit his personal information and view his shopping list.  
* **Anonymous Users**: This user can access and see all features of the web, and put the products in the cart but he need to login for buy it.

### Images

All products have one associated image.

### Graphics

The website will have two bar graphs, which will be responsible of showing the best rated products and the most sold / most popular products. 

### Complementary Technology

As a complementary technology we choose to apply the use of websockets to implement a real-time chat that will take care of product comments. The website also use GoogleMaps maps.

### Algorithm or advanced query

Cause the website is product sale related. An evaluation system will be implemented, so that the search can be carried out taking into account the ratings (best rated first).
