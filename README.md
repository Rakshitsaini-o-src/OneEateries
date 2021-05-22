# OneEateries
#Instalation 
* go inside the directory through a terminal
* type ./mvnw clean package(linux/mac) / mvnw clean package(windows)
* then cd target
* java -jar OneEateries-0.0.1-SNAPSHOT.jar
* this will start the server  

#Created simple get and post request for restaurant using spring boot
  * Get Request is "/oneeateries/rest/restaurant/menu/"
  * Post Request is "/oneeateries/rest/restaurant/menu/"
  * A simple post request body:-
    {
	    "restaurantName": "A",
	    "menuName": "B",
	    "menuItem": [
		    {
			    "itemName": "C",
			    "description": "D",
			    "price": "100"
		    },
		    {
			    "itemName": "E",
			    "description": "F",
			    "price": "200"
		    }
	    ]
    }
