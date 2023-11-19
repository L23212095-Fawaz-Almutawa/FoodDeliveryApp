
# Software Requirements Analysis and Validation - Using RM2PT

Use RM2PT prototype automatic generation tool to model requirements based on UML modeling methods (use case diagrams, system sequence diagrams, conceptual class diagrams), and generate prototypes to validate requirements.

The app basically resembles a food delivery appliation where a customer can signup and order food to required location. He is allowed to browse the menus and apply filters to search for whatever items he requires. Then proceeds to add them to cart and pays to track his order and status. The restaurant accepts orders, modifies their menus for customers and prepares the foods and informs delivery drivers about a pickup.. Delivery Drivers accept these orders and deliver them to location of customer of going to location of restaurant for pickup. Customer Service agents can contact between the all parties incase of issue or disputes that need to be resolved.
## Model Requirements
- Natural Language Requirements 
- UML Requirement Model
## Natural Language Requirements Part:
- 13 User Requirements. (With Basic and Alternative Flow)
- 11 Functional System Requirements. (With Basic and Alternative Flow)
- 9 Nonfunctional System Requirements. (Without Basic and Alternative Flow)

     <img width="829" alt="NaturalLanguage" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/5459214b-44c3-42e9-bd40-59730cf63c24">

## UML Requirement Model Part:
- 4 Actors in Use Case Diagram.
    - Customer
    - Customer Service Agent
    - Restaurant Manager
    - Delivery Driver
- 13 Use Cases in Use Case Diagram (with Include and Extend relationships between use cases)
    - register
    - login
    - trackOrder
    - cancelOrder
    - browseMenu
    - placeOrder
    - pay
    - showOrderDetails
    - contact
    - trackOrderProfiles
    - reviews
    - updateMenu
    - orderRequest
      
         <img width="841" alt="image" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/5cba8b60-2c24-4837-acdc-05bde6b8a83e">

- 4 System Sequence Diagrams (SSDs) (1 for each Actor) with 24 Systm Operations in total
    - OrderRequestService
    - TrackOrderProfilesService
    - UpdateMenuService
    - PlaceOrderService
      
         <img width="341" alt="image" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/2c8a79cf-854f-4fe6-a094-c33795d40975">

      
- 24 System Contracts (OCLs)
  
     <img width="531" alt="image" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/bf22bea5-9649-4b26-856a-f6ac520cfb4e">

  
- 20 Concepetual Class Diagrams
  
     <img width="860" alt="image" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/d6723499-54c9-47cd-b9c4-c2c8ba16cf33">

  
## Limitations
During the work in this project, difficulties have been encountered in sevaral parts in this software requirements analysis and validation project.

## Limitations - OCL Contracts
Due to my limited understanding and lack of experience with OCL Contracts, there are inaccuracies in the project's implementation related to this aspect.
OCL Contracts, or Object Constraint Language Contracts, are essential for ensuring the correctness and reliability of software systems. They define preconditions, postconditions, and invariants that must be upheld during program execution. However, due to my lack of familiarity with OCL Contracts, I was unable to effectively incorporate them into the project's implementation.


## Limitations - Prototyping
The absence of proper contract enforcement led to a multitude of errors within the prototype. Without the necessary checks and balances provided by OCL Contracts, the integrity and functionality of the system were compromised. Consequently, the prototype cannot be executed as intended, and its overall performance is severely hindered.

<img width="594" alt="image" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/fa27e08f-a4cf-47ae-9c23-19ce2417dd8d">


<img width="703" alt="image" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/25f5b4b2-a55f-4bb4-840c-9631935f9cef">

## LAB3 Extensions - Automated Architecture Design and Detailed Design

<img width="1001" alt="Screenshot 2023-11-19 215951" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/078305a4-3b3c-449d-8266-c48ceec47187">

<img width="1004" alt="Screenshot 2023-11-19 215931" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/899a25f7-7ff9-41c3-ae7a-c319fbfb90e5">

<img width="546" alt="Screenshot 2023-11-19 215901" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/6b0caa5f-ab55-4714-b46b-0fca80406171">

<img width="1280" alt="Screenshot 2023-11-19 214148" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/257aab72-b889-4fe0-93c9-13460718cee9">

<img width="389" alt="Screenshot 2023-11-19 200103" src="https://github.com/L23212095-Fawaz-Almutawa/FoodDeliveryApp/assets/148682608/31402e24-bfd9-4362-8db4-f631f5906b88">



## Documentation

[Documentation - by RM2PT](https://rm2pt.com/doc/dev/eclipsemda)


## License

[RM2PT](https://rm2pt.com/)


## Acknowledgements

 - [Dr.Yilong Yang - 杨溢龙 GitHub [RM2PT Developer]](https://github.com/yylonly)
 - [Dr.Yilong Yang Website](https://yilong.io/)
 - [RM2PT About](https://rm2pt.com/about/)

