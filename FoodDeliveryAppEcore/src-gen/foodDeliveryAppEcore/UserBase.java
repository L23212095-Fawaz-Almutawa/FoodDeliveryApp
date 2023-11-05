/**
 */
package foodDeliveryAppEcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link foodDeliveryAppEcore.UserBase#getName <em>Name</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.UserBase#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage#getUserBase()
 * @model
 * @generated
 */
public interface UserBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage#getUserBase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link foodDeliveryAppEcore.UserBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link foodDeliveryAppEcore.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see foodDeliveryAppEcore.FoodDeliveryAppEcorePackage#getUserBase_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // UserBase
