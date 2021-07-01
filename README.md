# OneEateries
It is a simple project which will help to order food.\
It's a work in progress.\
Currently, it includes feature of showing and adding of restaurant, menu Item and Corporation.\
## Prerequisite
* Java Sdk 11 or above [Download Here](https://adoptopenjdk.net)
* Mongo Community server [Download Here](https://www.mongodb.com/try/download/community)
* Docker Desktop [Download Here](https://www.docker.com/products/docker-desktop) (if u want to build with docker)
## Installation (Standalone)
* Clone the repo using 
```sh 
git clone https://github.com/Rakshitsaini-o-src/OneEateries.git

```
* go inside the directory through a terminal using 
```sh 
cd OneEateries
```
* To run the application on Mac/Linux:- type 
```sh
./mvnw package && java -jar target/OneEateries-0.0.1-SNAPSHOT.jar
```
* To run the application on Windows:- type 
```sh
mvnw package && java -jar target/OneEateries-0.0.1-SNAPSHOT.jar
```
* this will start the server  
## Installation (using docker)
* Clone the repo using 
```sh 
git clone https://github.com/Rakshitsaini-o-src/OneEateries.git
```
* go inside the directory through a terminal using 
```sh 
cd OneEateries
```
* To Build jar file on Mac/Linux:- type 
```sh
./mvnw clean package
```
* To Build jar file on Windows:- type 
```sh
mvnw clean package
```
* To build the docker image
```sh
docker-compose build
```
* To start the docker image in detached mode(container runs in the background of your terminal)
```sh
docker-compose up -d
```
* To start the docker image in non-detched mode
```sh
docker-compose up
```
#### If u used docker replace port 8080 with 9090 as im running nginx as Load Balancer in the steps given below.
## Created simple get and post request for restaurant using spring boot
  * Get Request for restaurant is `localhost:8080/restaurant/` =>	`Shows all restaurant`
  * `Post` Request for restaurant is `localhost:8080/restaurant/` => `Saves a restaurant`
  * `Get` Request for MenuItem is `localhost:8080/restaurant/:{id}/menu/` =>`gets menu of a particular restaurant whose id = :{id}`
  * `Post` Request for MenuItem is `localhost:8080/restaurant/:{id}/menu/` => `adds a list of menuitem in the particular restaurant's menu whose id = :{id}`\
 `In order to get the :{id} run the get request of restaurant and copy the value of restaurantId i.e "restaurantId": "60b1d567b229ac6ad1367cec" here :{id} = 60b1d567b229ac6ad1367cec.By Default there are no restaurant,So you need to add one.`
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
## Created simple get and post request for Corporation using spring boot 
* `Get` Request for corporation is `localhost:8080/corporation/` =>	`Shows all corporation`
* `Post` Request for corporation is `localhost:8080/corporation/` => `Saves a corporation`
* `Get` Request for particular corporation is `localhost:8080/corporation/:{id}/` => `gets particular corporation whose id = :{id}`\
` In order to get the :{id} run the get request of corporation and copy the value of corporationId i.e "corporationId": "60b1d567b229ac6ad1367cec" here :{id} = 60b1d567b229ac6ad1367cec.By Default there are no corporation,So you need to add one.`
* A simple post request body for adding restaurant:-\
  {
  "corporationName": "A"
  }
