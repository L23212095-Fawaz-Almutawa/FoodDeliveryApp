//User Requirements
As a customer, I want to browse restaurants and their menus, so that I can choose what to order and delivered to my current location 
As a customer, I want to filter restaurants by cuisine or restaurant type, so that I can norrow down my choice
As a customer, I want to see total price of my order including delivery fee and taxes before ordering, so that I know how much I will pay in total
As a customer, I want to pay using various methods, so that I can coose any method of my choice
As a customer, I want to track my order and check latest status of order, so that I know how much I have to wait
As a customer, I want to rate dishes and restaurant and delivery driver, so that I provide feedback
As a restaurant owner, I want to be notified by customer placing order, so that I can confirm and prepare his order
As a restaurant owner, I want to update menu and prices, so that I offer more flexibility 
As a restaurant owner, I want to see ratings and reviews from customers, so that I get insights
As a delivery driver, I want to accept delivery tasks, so that I choose optimal location and schedule preference
As a delivery driver, I want to see restaurant and customer location, so that I can deliver correctly
As a customer service, I want to communicate with restaurant and customer and delivery driver, so that I can resolve issues
As a customer service, I want to view orders of users, so that I can view details 


//User Basic Flow and Alternative Flow
As a customer, I want to browse nearby restaurants and their menus, so that I can choose what to order and delivered to my address
{
	Basic Flow {
		(User) 1. the customer shall arrive at homepage.
		(System) 2. When at homepage, the app shall show restaurants based on filter requested.
		(User) 3. the customer shall view restaurant and its menu.
	}
	
	Alternative Flow {
		A. At any time, system fails :
			1. Customer restarts or refreshes homepage.
			2. Homepage returns to prior state.
				a2. System detected anomalies preventing restart.
					1. System signals error to Customer and force closes app.
	}
}


As a customer, I want to add customized dishes and drinks to my cart
{
	Basic Flow {
		(User) 1. the customer shall select dish or drink they want.
		(System)2. When dish is selected, the app shall display available customized dish options.
		(User) 3. the customer shall add selections to cart.
		(System) 4. When customer adds to cart, the app shall show list of items and quantity.
	}
	
	Alternative Flow {
		A. At any time, restaurant closes :
			1. System notifies customer restaurant closed.
			2. System returns to homepage to prior state.
	}
}


As a customer, I want to see total price of my order including deliery fee and taxes
{
	Basic Flow {
		(User) 1. the customer shall arrive at checkout.
		(System) 2. When orders are added to cart, the app shall show summary of order including items quantites prices and subtotal.
		(System) 3. the app shall calculate delivery fee based on user location and distance to restaurant.
		(System) 4. When everything is calculated, the app shall show total final price to pay.
	}
	
	Alternative Flow {
		A. At any time, override delivery range :
			1. System notifies Customer delivery out of range.
			2. Customer accepts additional payment.
			3. System updates new total.
	}
}


As a customer, I want to pay using various methods, so that I can coose any method of my choice
{
	Basic Flow {
		(System) 1. When checking out, the system shall provide multiple payment methods.
		(User) 2. the customer shall select payment method preferred.
		(System) 3. the system shall direct customer to third party interface for payment.
		(User) 4. the customer shall complete payment and get notified of payment status.
		(System) 5. the system shall notify user of payment transaction and receipt.
		(System) 5. When paid, the system shall record each payment transaction details.
	}
	
	Alternative Flow {
		A. At any time, customer cancels :
			1. System returns to prior state.
		B. At any time, transaction fails :
			To support recovery and ensure sensitive state and events can be recovered from any step of scenario.
			1. System restarts input and recovers prior state.
			2. System recovers prior state.
			3. Customer edits information and tries again.
				a3. System detects multiple failed entries.
					1. System records error and enters new clean state.
	}
}


As a customer, I want to track my order and check latest status of order, so that I know how much I have to wait
{
	Basic Flow {
		(User) 1. the customer shall view latest order update once completed order.
		(System) 2. When transaction is complete, the system shall display status of order and tracking and update map in real time.
		(System) 3. the system shall notify customer that order is close to customer location.
		(User) 4. the customer shall receive notification that delivery is near.
	}
	
	Alternative Flow {
		A. At any time, customer service agent requests override operation :
			1. System enters authorized mode.
			2. Customer service agent performs agent operation such as add time or change location.
			3. System reverts to normal mode.
	}
}


As a customer, I want to rate dishes and restaurant and delivery driver, so that I provide feedback
{
	Basic Flow {
		(User) 1. the customer shall rate each food out of five stars.
		(User) 2. the customer shall rate delivey driver out of five stars.
		(User) 3. the customer shall rate restaurant out of five stars.
		(System) 4. When order is delivered by one hour, the system shall ask user to rate food driver and restaurant.
		(System) 5. When rating, the system shall record each rating.
	}
	
	Alternative Flow {
		A. At any time, customer skips :
			1. System ignored rating and returns to homepage.
	}
}


As a restaurant owner, I want to be notified by customer placing order, so that I can confirm and prepare his order
{
	Basic Flow {
		(System) 1. When order is place, the system shall inform restaurant about order.
		(User) 2. the restaurant owner shall receive order information order.
		(System) 3. the system shall ask restaurant to accept order or refuse.
		(User) 4. the restaurant owner shall accept or decline order.
		(System) 5. When accepted, the system shall record each order of restaurant.
	}
	
	Alternative Flow {
		A. At any time, System fails :
			1. Customer agent informs restaurant and records order manually.
			2. Restaurant accepts or declines.
			3. Customer agent informs customer.
	}
}


As a restaurant owner, I want to update menu and prices, so that I offer more flexibility 
{
	Basic Flow {
		(User) 1. the restaurant owner shall edit menu to change price and food.
		(User) 2. the restaurant owner shall save his changed and confirm.
		(System) 3. When menu is changed, the system shall reflect and update.
	}
	
	Alternative Flow {
		A. At any time, database upload fails :
			1. Restaurant owner restarts system.
			2. System reconstructs prior prices.
				a2. System detects anomalies preventing recovery.
					1. System signals error to restaurant owner records error state and enters clean state.
	}
}


As a restaurant owner, I want to see ratings and reviews from customers, so that I get insights
{
	Basic Flow {
		(User) 1. the restaurant owner shall see insights and ratings of customers.
		(System) 2. the system shall provide insights and visualization of feedback to restaurant owners.
	}
	
}


As a delivery driver, I want to accept delivery tasks, so that I choose optimal location and schedule preference
{
	Basic Flow {
		(User) 1. the driver shall be notified about an order service.
		(User) 2. the driver shall be shown delivery information such as location and distance.
		(System) 3. When order is placed, the system shall notify available delivery drivers.
		(User) 4. the driver shall choose to accept or decline delivery request.
		(System) 5. When driver accepts, the system shall update customer and restaurant of details.
		(System) 6. When driver accepts, the system shall record details of driver and order.
	}
	
}


As a delivery driver, I want to see restaurant and customer location, so that I can deliver correctly
{
	Basic Flow {
		(User) 1. the delivery driver shall view route to restaurant and customer.
		(System) 2. When driver moves, the system shall show optimal route to restaurant and customer.
		(System) 3. When driver moves, the system shall calculate approximate time for arrival.
		(System) 4. the system shall update customer and restaurant with real time updates.
		
	}
}


As a customer service, I want to communicate with restaurant and customer and delivery driver, so that I can resolve issues
{
	Basic Flow {
		(User) 1. the customer service agent shall communicate with both driver and customer.
		(System) 2. When customer service agent requires communication, the system shall provide means of communication.	
		(User) 3. the customer service agent shall choose to call or chat with whom.
		(System) 4. When customer service agent communicates, the system shall notify person being contacted.
		(System) 5. When communicating, the system shall record chat.
	}
}


As a customer service, I want to view orders of users, so that I can view details 
{
	Basic Flow {
		(User) 1.  the customer service agent shall review orders and their details.
		(System) 2. When order have been placed, the system shall show each order with its corresponding customer and details.
	}
	
	Alternative Flow {
		A. At any time, System database fails fetch :
			1. The system prompts customer service agent with an error.
			2. The customer service agent may restart or refresh system.
	}
}


//Functional System Requirements
As a system, I want to allow users to sign up and create account, so that they can access its feature
As a system, I want to allow users to browse menu of restaurants view food items, so that they can access details such as images desciption and price
As a system, I want to let users select food items and customize their orders, so that they can add items to cart and place orders
As a system, I want to support secure and convenient payments methods, so that customers can pay
As a system, I want to lets users track their order and status, so that they can see it in real time
As a system, I want to notify users to provide constant updates, so that they can check status delivery time and special offers
As a system, I want to allow users to rate and review restaurants dishes and delivery drivers, so that they can provide feedback and help others users make informed decisions
As a system, I want to allow users to view order history, so that they can order again or view logs
As a system, I want to provide easy interface for restaurant managers, so that they can manage menus update items and track incoming orders
As a system, I want to provide easy interface for delivery drivers, so that they can accept orders and view their details such as locations
As a system, I want to provid easy interface for customer service agent, so that they can communicate with users and resolve issues

//Function System Basic Flow and Alternative Flow
As a system, I want to allow users to sign up and create account, so that they can access its feature
{
	Basic Flow {
		(User) 1. the customer shall create a new account and sign up.
		(System) 2. the system shall make sure input is correct and matching correct REGEX.
		(System) 3. the system shall check that account or email not already created.
		(System) 4. the system shall take data and store in system database using hash function for security.
		(System) 5. when system is complete, the system shall notify user of completetion and success.
	}
	
	Alternative Flow {
		A. At any time, system database fails storage :
			1. The system prompts user of such error.
			2. The system preserves prior state of information and data to try again.
	}
}


As a system, I want to allow users to browse menu of restaurants view food items, so that they can access details such as images desciption and price
{
	Basic Flow {
		(User) 1. the customer shall enter home page to view restaurants and dishes.
		(System) 2. the system shall retrieve geographical user location and user filter.
		(System) 3. the system shall retrieve from database restaurants and dishes in range of user location and filter preference.
	}
}


As a system, I want to let users select food items and customize their orders, so that they can add items to cart and place orders
{
	Basic Flow {
		(User) 1.  the customer shall select dishes and modify them to add to cart.
		(System) 2. the system shall provide an interface that allows dish customization based on what is available.
		(System) 3. the system shall retrieve image and description of dish from database to view to user.
		(System) 4. the system shall allow adding of dish with customized requirements to list of user dishes into cart and save state.
	}
}


As a system, I want to support secure and convenient payments methods, so that customers can pay
{
	Basic Flow {
		(User) 1. the customer shall arrive payment page to pay for his dishes and delivery.
		(System) 2. the system shall provide multiple payment methods such as cash on delivery or credit card or third part payments such as AliPay or WeChat.
		(System) 3. the system shall interface with third party APIs to secure payment and confirm payment.
		(System) 4. the system shall ask user for credit card information and process with bank API for payment confirmation.
	}
}


As a system, I want to lets users track their order and status, so that they can see it in real time
{
	Basic Flow {
		(User)  1. the customer shall track order and check latest status in real time.
		(System) 2. the system shall display a map of current GPS location of driver related to customer order.
		(System) 3. the system shall display restaurant status of dish preparation to customer through restaurant API.
		(System) 4. the sytem shall display estimated time from driver location to customer and restaurant location using time calculations and traffic data API.
	}
}


As a system, I want to notify users to provide constant updates, so that they can check status delivery time and special offers
{
	Basic Flow {
		(User) 1. the customer shall allow user notifications to get updates even in system running at background.
		(System) 2. the system shall push notifications to user using platform notification services.
	}
}


As a system, I want to allow users to rate and review restaurants dishes and delivery drivers, so that they can provide feedback and help others users make informed decisions
{
	Basic Flow {
		(User) 1. the customer shall decide to review everything or not.
		(System) 2. the system shall let customer choose wether to rate dishes or restaurants or delivery driver or completely skip.
		(System) 3. the system shall store customer reviews in relative database and records to allow other users to view.
		(System) 4. the system shall use this data to provide insights to management or restaurants.
	}
}


As a system, I want to allow users to view order history, so that they can order again or view logs
{
	Basic Flow {
		(User) 1. the customer shall be able to see his history of orders with relative information.
		(System) 2. the system shall query user previous orders depending on search criteria.
		(system) 3. the system shall provide instant order of previous order and persist state till checkout and payment.
	}
}


As a system, I want to provide easy interface for restaurant managers, so that they can manage menus update items and track incoming orders
{
	Basic Flow {
		(User) 1. the restaurant managers shall update their menu and receive order requests.
		(System) 2. the system shall have a separate interface for restaurant managers.
		(System) 3. the system shall allow restaurant owners modify their own menu and prices and images of their restaurant.
		(System) 4. the system shall instantly update current database viewed to users to see new modified menu.
		(System) 5. the system shall send push notifications to restaurant owners through their API about needed customer orders.
	}
}


As a system, I want to provide easy interface for delivery drivers, so that they can accept orders and view their details such as locations
{
	Basic Flow {
		(User) 1. the delivery drivers shall view their rides and delivery tasks.
		(System) 2. the system shall have a separate interface for delivery drivers.
		(System) 3. the system shall push notifications to delivery drivers about needed order deliveries.
	}
}


As a system, I want to provid easy interface for customer service agent, so that they can communicate with users and resolve issues
{
	Basic Flow {
		(User) 1. the customer service agent shall communicate with users and resolve issues.
		(System) 2. the system shall provide a means of communication between customer service agent and users.
		(System) 3. the system shall provide an API of messaging system that users can use to communicate with a safe and reliable protocol.
		(System) 4. the system shall push notifications and use an integrated API platform between all user interfaces and devices.
	}
}


//Nonfunctional System Requirements
As a system, I want to be responsive and provide fast loading times, so that I can provide smooth user experience at whole times
As a system, I want to be reliable, so that I can ensure orders are placed correctly and delivered on time
As a system, I want to be secure, so that I can protect user data such as payment detail and location from outside access and breaches
As a system, I want to have an intuitive user interface, so that it is easier for users to navigate and perform other tasks
As a system, I want to be scalable, so that I can handle large amount of users without performance degradation
As a system, I want to be compatible, so that a wider user base can be reached
As a system, I want to be multilingual, so that foreigners can use app
As a system, I want to be integrated with other systems and APIs, so that payment gateways or mapping servies or restaurant management systems can intergrate easily
As a system, I want to provide analytics and reports, so that stakeholders can monitor app performance and provide insights and improve system functionality
