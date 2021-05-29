#OneEateries
It is a simple project which will help to order food.
It's a work in progress.Currently, it includes feature of showing and adding of restaurant and menu Item.
##Installation 
* go inside the directory through a terminal
* type ./mvnw clean package(linux/mac) / mvnw clean package(windows)
* then cd target
* java -jar OneEateries-0.0.1-SNAPSHOT.jar
* this will start the server  

##Created simple get and post request for restaurant using spring boot
  * Get Request for restaurant is "localhost:8080/restaurant/" =>	Shows all restaurant
  * Post Request for restaurant is "localhost:8080/restaurant/" => Saves a restaurant
  * Get Request for MenuItem is "localhost:8080/restaurant/:{id}/menu/" => gets menu of a particular restaurant whose id = :{id}
 * Get Request for MenuItem is "localhost:8080/restaurant/:{id}/menu/" => adds a list of menuitem in the particular restaurant's menu whose id = :{id}
 ### In order to get the :{id} run the get request of restaurant and copy the value of restaurantId i.e "restaurantId": "60b1d567b229ac6ad1367cec" here :{id} = 60b1d567b229ac6ad1367cec
  * A simple post request body for adding restaurant:-\
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
 * A simple post request body for adding menuItem:-\
   [
   	{
   		"itemName": "G",
   		"description": "H",
   		"price": "300"
   	},
   	{
   		"itemName": "I",
   		"description": "J",
   		"price": "400"
   	}
   ]
   