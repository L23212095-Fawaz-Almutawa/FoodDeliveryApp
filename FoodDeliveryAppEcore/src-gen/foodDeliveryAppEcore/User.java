/**
 */
package foodDeliveryAppEcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link foodDeliveryAppEcore.User#getUsername <em>Username</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.User#getPassword <em>Password</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.User#getName <em>Name</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.User#getDeliverydriver <em>Deliverydriver</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.User#getCustomer <em>Customer</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.User#getCustomerservice <em>Customerservice</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.User#getRestaurant <em>Restaurant</em>}</li>
 * </ul>
 *
 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage#getUser_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link foodDeliveryAppEcore.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage#getUser_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link foodDeliveryAppEcore.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link foodDeliveryAppEcore.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Deliverydriver</b></em>' reference list.
	 * The list contents are of type {@link foodDeliveryAppEcore.DeliveryDriver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverydriver</em>' reference list.
	 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage#getUser_Deliverydriver()
	 * @model derived="true"
	 * @generated
	 */
	EList<DeliveryDriver> getDeliverydriver();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference list.
	 * The list contents are of type {@link foodDeliveryAppEcore.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference list.
	 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage#getUser_Customer()
	 * @model derived="true"
	 * @generated
	 */
	EList<Customer> getCustomer();

	/**
	 * Returns the value of the '<em><b>Customerservice</b></em>' reference list.
	 * The list contents are of type {@link foodDeliveryAppEcore.CustomerService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customerservice</em>' reference list.
	 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage#getUser_Customerservice()
	 * @model derived="true"
	 * @generated
	 */
	EList<CustomerService> getCustomerservice();

	/**
	 * Returns the value of the '<em><b>Restaurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restaurant</em>' reference.
	 * @see #setRestaurant(Restaurant)
	 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage#getUser_Restaurant()
	 * @model derived="true"
	 * @generated
	 */
	Restaurant getRestaurant();

	/**
	 * Sets the value of the '{@link foodDeliveryAppEcore.User#getRestaurant <em>Restaurant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restaurant</em>' reference.
	 * @see #getRestaurant()
	 * @generated
	 */
	void setRestaurant(Restaurant value);

} // User
