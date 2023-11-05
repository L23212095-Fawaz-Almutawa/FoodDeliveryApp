/**
 */
package foodDeliveryAppEcore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage
 * @generated
 */
public interface FoodDeliveryAppEcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FoodDeliveryAppEcoreFactory eINSTANCE = foodDeliveryAppEcore.impl.FoodDeliveryAppEcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Customer Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Service</em>'.
	 * @generated
	 */
	CustomerService createCustomerService();

	/**
	 * Returns a new object of class '<em>Delivery Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delivery Driver</em>'.
	 * @generated
	 */
	DeliveryDriver createDeliveryDriver();

	/**
	 * Returns a new object of class '<em>User Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Base</em>'.
	 * @generated
	 */
	UserBase createUserBase();

	/**
	 * Returns a new object of class '<em>Restaurant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restaurant</em>'.
	 * @generated
	 */
	Restaurant createRestaurant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FoodDeliveryAppEcorePackage getFoodDeliveryAppEcorePackage();

} //FoodDeliveryAppEcoreFactory
