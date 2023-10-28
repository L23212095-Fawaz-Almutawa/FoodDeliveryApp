
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

    ![App Screenshot]([https://via.placeholder.com/468x300?text=App+Screenshot+Here](https://pasteboard.co/Sb2w3Iks40Am.png))
## UML Requirement Model Part:
- 4 Actors in Use Case Diagram.
    - Customer
    - Customer Service Agent
    - Restaurant Manager
    - Delivery Driver
    ![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)
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
    ![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)
- 4 System Sequence Diagrams (SSDs) (1 for each Actor) with 24 Systm Operations in total
    - OrderRequestService
    - TrackOrderProfilesService
    - UpdateMenuService
    - PlaceOrderService
    ![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)
- 24 System Contracts (OCLs)
    ![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)
- 20 Concepetual Class Diagrams
    ![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)
## Limitations
During the work in this project, difficulties have been encountered in sevaral parts in this software requirements analysis and validation project.

## Limitations - OCL Contracts
Due to my limited understanding and lack of experience with OCL Contracts, there are inaccuracies in the project's implementation related to this aspect.
OCL Contracts, or Object Constraint Language Contracts, are essential for ensuring the correctness and reliability of software systems. They define preconditions, postconditions, and invariants that must be upheld during program execution. However, due to my lack of familiarity with OCL Contracts, I was unable to effectively incorporate them into the project's implementation.


## Limitations - Prototyping
The absence of proper contract enforcement led to a multitude of errors within the prototype. Without the necessary checks and balances provided by OCL Contracts, the integrity and functionality of the system were compromised. Consequently, the prototype cannot be executed as intended, and its overall performance is severely hindered.

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## Documentation

[Documentation - by RM2PT](https://rm2pt.com/doc/dev/eclipsemda)


## License

[RM2PT](https://rm2pt.com/)


## Acknowledgements

 - [Dr.Yilong Yang - 杨溢龙 GitHub [RM2PT Developer]](https://github.com/yylonly)
 - [Dr.Yilong Yang Website](https://yilong.io/)
 - [RM2PT About](https://rm2pt.com/about/)

