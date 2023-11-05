/**
 */
package foodDeliveryAppEcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see foodDeliveryAppEcore.FoodDeliveryAppEcoreFactory
 * @model kind="package"
 * @generated
 */
public interface FoodDeliveryAppEcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "foodDeliveryAppEcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/foodDeliveryAppEcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "foodDeliveryAppEcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FoodDeliveryAppEcorePackage eINSTANCE = foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link foodDeliveryAppEcore.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see foodDeliveryAppEcore.impl.UserImpl
	 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Deliverydriver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DELIVERYDRIVER = 3;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CUSTOMER = 4;

	/**
	 * The feature id for the '<em><b>Customerservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CUSTOMERSERVICE = 5;

	/**
	 * The feature id for the '<em><b>Restaurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__RESTAURANT = 6;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link foodDeliveryAppEcore.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see foodDeliveryAppEcore.impl.CustomerImpl
	 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Deliverydriver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DELIVERYDRIVER = USER__DELIVERYDRIVER;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER = USER__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Customerservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMERSERVICE = USER__CUSTOMERSERVICE;

	/**
	 * The feature id for the '<em><b>Restaurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__RESTAURANT = USER__RESTAURANT;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link foodDeliveryAppEcore.impl.CustomerServiceImpl <em>Customer Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see foodDeliveryAppEcore.impl.CustomerServiceImpl
	 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getCustomerService()
	 * @generated
	 */
	int CUSTOMER_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Deliverydriver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__DELIVERYDRIVER = USER__DELIVERYDRIVER;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__CUSTOMER = USER__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Customerservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__CUSTOMERSERVICE = USER__CUSTOMERSERVICE;

	/**
	 * The feature id for the '<em><b>Restaurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__RESTAURANT = USER__RESTAURANT;

	/**
	 * The number of structural features of the '<em>Customer Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Customer Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link foodDeliveryAppEcore.impl.DeliveryDriverImpl <em>Delivery Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see foodDeliveryAppEcore.impl.DeliveryDriverImpl
	 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getDeliveryDriver()
	 * @generated
	 */
	int DELIVERY_DRIVER = 3;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Deliverydriver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__DELIVERYDRIVER = USER__DELIVERYDRIVER;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__CUSTOMER = USER__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Customerservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__CUSTOMERSERVICE = USER__CUSTOMERSERVICE;

	/**
	 * The feature id for the '<em><b>Restaurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__RESTAURANT = USER__RESTAURANT;

	/**
	 * The number of structural features of the '<em>Delivery Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delivery Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link foodDeliveryAppEcore.impl.UserBaseImpl <em>User Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see foodDeliveryAppEcore.impl.UserBaseImpl
	 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getUserBase()
	 * @generated
	 */
	int USER_BASE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE__USERS = 1;

	/**
	 * The number of structural features of the '<em>User Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link foodDeliveryAppEcore.impl.RestaurantImpl <em>Restaurant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see foodDeliveryAppEcore.impl.RestaurantImpl
	 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getRestaurant()
	 * @generated
	 */
	int RESTAURANT = 5;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Deliverydriver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__DELIVERYDRIVER = USER__DELIVERYDRIVER;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__CUSTOMER = USER__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Customerservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__CUSTOMERSERVICE = USER__CUSTOMERSERVICE;

	/**
	 * The feature id for the '<em><b>Restaurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__RESTAURANT = USER__RESTAURANT;

	/**
	 * The number of structural features of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link foodDeliveryAppEcore.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see foodDeliveryAppEcore.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link foodDeliveryAppEcore.Customer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see foodDeliveryAppEcore.Customer#getAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Address();

	/**
	 * Returns the meta object for class '{@link foodDeliveryAppEcore.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see foodDeliveryAppEcore.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link foodDeliveryAppEcore.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see foodDeliveryAppEcore.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link foodDeliveryAppEcore.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see foodDeliveryAppEcore.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link foodDeliveryAppEcore.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see foodDeliveryAppEcore.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the reference list '{@link foodDeliveryAppEcore.User#getDeliverydriver <em>Deliverydriver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deliverydriver</em>'.
	 * @see foodDeliveryAppEcore.User#getDeliverydriver()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Deliverydriver();

	/**
	 * Returns the meta object for the reference list '{@link foodDeliveryAppEcore.User#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer</em>'.
	 * @see foodDeliveryAppEcore.User#getCustomer()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Customer();

	/**
	 * Returns the meta object for the reference list '{@link foodDeliveryAppEcore.User#getCustomerservice <em>Customerservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customerservice</em>'.
	 * @see foodDeliveryAppEcore.User#getCustomerservice()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Customerservice();

	/**
	 * Returns the meta object for the reference '{@link foodDeliveryAppEcore.User#getRestaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Restaurant</em>'.
	 * @see foodDeliveryAppEcore.User#getRestaurant()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Restaurant();

	/**
	 * Returns the meta object for class '{@link foodDeliveryAppEcore.CustomerService <em>Customer Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Service</em>'.
	 * @see foodDeliveryAppEcore.CustomerService
	 * @generated
	 */
	EClass getCustomerService();

	/**
	 * Returns the meta object for class '{@link foodDeliveryAppEcore.DeliveryDriver <em>Delivery Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Driver</em>'.
	 * @see foodDeliveryAppEcore.DeliveryDriver
	 * @generated
	 */
	EClass getDeliveryDriver();

	/**
	 * Returns the meta object for class '{@link foodDeliveryAppEcore.UserBase <em>User Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Base</em>'.
	 * @see foodDeliveryAppEcore.UserBase
	 * @generated
	 */
	EClass getUserBase();

	/**
	 * Returns the meta object for the attribute '{@link foodDeliveryAppEcore.UserBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see foodDeliveryAppEcore.UserBase#getName()
	 * @see #getUserBase()
	 * @generated
	 */
	EAttribute getUserBase_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link foodDeliveryAppEcore.UserBase#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see foodDeliveryAppEcore.UserBase#getUsers()
	 * @see #getUserBase()
	 * @generated
	 */
	EReference getUserBase_Users();

	/**
	 * Returns the meta object for class '{@link foodDeliveryAppEcore.Restaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant</em>'.
	 * @see foodDeliveryAppEcore.Restaurant
	 * @generated
	 */
	EClass getRestaurant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FoodDeliveryAppEcoreFactory getFoodDeliveryAppEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link foodDeliveryAppEcore.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see foodDeliveryAppEcore.impl.CustomerImpl
		 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ADDRESS = eINSTANCE.getCustomer_Address();

		/**
		 * The meta object literal for the '{@link foodDeliveryAppEcore.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see foodDeliveryAppEcore.impl.UserImpl
		 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Deliverydriver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__DELIVERYDRIVER = eINSTANCE.getUser_Deliverydriver();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__CUSTOMER = eINSTANCE.getUser_Customer();

		/**
		 * The meta object literal for the '<em><b>Customerservice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__CUSTOMERSERVICE = eINSTANCE.getUser_Customerservice();

		/**
		 * The meta object literal for the '<em><b>Restaurant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__RESTAURANT = eINSTANCE.getUser_Restaurant();

		/**
		 * The meta object literal for the '{@link foodDeliveryAppEcore.impl.CustomerServiceImpl <em>Customer Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see foodDeliveryAppEcore.impl.CustomerServiceImpl
		 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getCustomerService()
		 * @generated
		 */
		EClass CUSTOMER_SERVICE = eINSTANCE.getCustomerService();

		/**
		 * The meta object literal for the '{@link foodDeliveryAppEcore.impl.DeliveryDriverImpl <em>Delivery Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see foodDeliveryAppEcore.impl.DeliveryDriverImpl
		 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getDeliveryDriver()
		 * @generated
		 */
		EClass DELIVERY_DRIVER = eINSTANCE.getDeliveryDriver();

		/**
		 * The meta object literal for the '{@link foodDeliveryAppEcore.impl.UserBaseImpl <em>User Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see foodDeliveryAppEcore.impl.UserBaseImpl
		 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getUserBase()
		 * @generated
		 */
		EClass USER_BASE = eINSTANCE.getUserBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BASE__NAME = eINSTANCE.getUserBase_Name();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_BASE__USERS = eINSTANCE.getUserBase_Users();

		/**
		 * The meta object literal for the '{@link foodDeliveryAppEcore.impl.RestaurantImpl <em>Restaurant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see foodDeliveryAppEcore.impl.RestaurantImpl
		 * @see foodDeliveryAppEcore.impl.FoodDeliveryAppEcorePackageImpl#getRestaurant()
		 * @generated
		 */
		EClass RESTAURANT = eINSTANCE.getRestaurant();

	}

} //FoodDeliveryAppEcorePackage
