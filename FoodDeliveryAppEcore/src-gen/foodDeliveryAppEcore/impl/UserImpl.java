/**
 */
package foodDeliveryAppEcore.impl;

import foodDeliveryAppEcore.Customer;
import foodDeliveryAppEcore.CustomerService;
import foodDeliveryAppEcore.DeliveryDriver;
import foodDeliveryAppEcore.FoodDeliveryAppEcorePackage;
import foodDeliveryAppEcore.Restaurant;
import foodDeliveryAppEcore.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link foodDeliveryAppEcore.impl.UserImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.impl.UserImpl#getDeliverydriver <em>Deliverydriver</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.impl.UserImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.impl.UserImpl#getCustomerservice <em>Customerservice</em>}</li>
 *   <li>{@link foodDeliveryAppEcore.impl.UserImpl#getRestaurant <em>Restaurant</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeliverydriver() <em>Deliverydriver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverydriver()
	 * @generated
	 * @ordered
	 */
	protected EList<DeliveryDriver> deliverydriver;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customer;

	/**
	 * The cached value of the '{@link #getCustomerservice() <em>Customerservice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerservice()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerService> customerservice;

	/**
	 * The cached value of the '{@link #getRestaurant() <em>Restaurant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestaurant()
	 * @generated
	 * @ordered
	 */
	protected Restaurant restaurant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoodDeliveryAppEcorePackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodDeliveryAppEcorePackage.USER__USERNAME,
					oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodDeliveryAppEcorePackage.USER__PASSWORD,
					oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodDeliveryAppEcorePackage.USER__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeliveryDriver> getDeliverydriver() {
		if (deliverydriver == null) {
			deliverydriver = new EObjectResolvingEList<DeliveryDriver>(DeliveryDriver.class, this,
					FoodDeliveryAppEcorePackage.USER__DELIVERYDRIVER);
		}
		return deliverydriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomer() {
		if (customer == null) {
			customer = new EObjectResolvingEList<Customer>(Customer.class, this,
					FoodDeliveryAppEcorePackage.USER__CUSTOMER);
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerService> getCustomerservice() {
		if (customerservice == null) {
			customerservice = new EObjectResolvingEList<CustomerService>(CustomerService.class, this,
					FoodDeliveryAppEcorePackage.USER__CUSTOMERSERVICE);
		}
		return customerservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restaurant getRestaurant() {
		if (restaurant != null && restaurant.eIsProxy()) {
			InternalEObject oldRestaurant = (InternalEObject) restaurant;
			restaurant = (Restaurant) eResolveProxy(oldRestaurant);
			if (restaurant != oldRestaurant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FoodDeliveryAppEcorePackage.USER__RESTAURANT, oldRestaurant, restaurant));
			}
		}
		return restaurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restaurant basicGetRestaurant() {
		return restaurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestaurant(Restaurant newRestaurant) {
		Restaurant oldRestaurant = restaurant;
		restaurant = newRestaurant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodDeliveryAppEcorePackage.USER__RESTAURANT,
					oldRestaurant, restaurant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FoodDeliveryAppEcorePackage.USER__USERNAME:
			return getUsername();
		case FoodDeliveryAppEcorePackage.USER__PASSWORD:
			return getPassword();
		case FoodDeliveryAppEcorePackage.USER__NAME:
			return getName();
		case FoodDeliveryAppEcorePackage.USER__DELIVERYDRIVER:
			return getDeliverydriver();
		case FoodDeliveryAppEcorePackage.USER__CUSTOMER:
			return getCustomer();
		case FoodDeliveryAppEcorePackage.USER__CUSTOMERSERVICE:
			return getCustomerservice();
		case FoodDeliveryAppEcorePackage.USER__RESTAURANT:
			if (resolve)
				return getRestaurant();
			return basicGetRestaurant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FoodDeliveryAppEcorePackage.USER__USERNAME:
			setUsername((String) newValue);
			return;
		case FoodDeliveryAppEcorePackage.USER__PASSWORD:
			setPassword((String) newValue);
			return;
		case FoodDeliveryAppEcorePackage.USER__NAME:
			setName((String) newValue);
			return;
		case FoodDeliveryAppEcorePackage.USER__DELIVERYDRIVER:
			getDeliverydriver().clear();
			getDeliverydriver().addAll((Collection<? extends DeliveryDriver>) newValue);
			return;
		case FoodDeliveryAppEcorePackage.USER__CUSTOMER:
			getCustomer().clear();
			getCustomer().addAll((Collection<? extends Customer>) newValue);
			return;
		case FoodDeliveryAppEcorePackage.USER__CUSTOMERSERVICE:
			getCustomerservice().clear();
			getCustomerservice().addAll((Collection<? extends CustomerService>) newValue);
			return;
		case FoodDeliveryAppEcorePackage.USER__RESTAURANT:
			setRestaurant((Restaurant) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FoodDeliveryAppEcorePackage.USER__USERNAME:
			setUsername(USERNAME_EDEFAULT);
			return;
		case FoodDeliveryAppEcorePackage.USER__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case FoodDeliveryAppEcorePackage.USER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FoodDeliveryAppEcorePackage.USER__DELIVERYDRIVER:
			getDeliverydriver().clear();
			return;
		case FoodDeliveryAppEcorePackage.USER__CUSTOMER:
			getCustomer().clear();
			return;
		case FoodDeliveryAppEcorePackage.USER__CUSTOMERSERVICE:
			getCustomerservice().clear();
			return;
		case FoodDeliveryAppEcorePackage.USER__RESTAURANT:
			setRestaurant((Restaurant) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FoodDeliveryAppEcorePackage.USER__USERNAME:
			return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
		case FoodDeliveryAppEcorePackage.USER__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		case FoodDeliveryAppEcorePackage.USER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FoodDeliveryAppEcorePackage.USER__DELIVERYDRIVER:
			return deliverydriver != null && !deliverydriver.isEmpty();
		case FoodDeliveryAppEcorePackage.USER__CUSTOMER:
			return customer != null && !customer.isEmpty();
		case FoodDeliveryAppEcorePackage.USER__CUSTOMERSERVICE:
			return customerservice != null && !customerservice.isEmpty();
		case FoodDeliveryAppEcorePackage.USER__RESTAURANT:
			return restaurant != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UserImpl
