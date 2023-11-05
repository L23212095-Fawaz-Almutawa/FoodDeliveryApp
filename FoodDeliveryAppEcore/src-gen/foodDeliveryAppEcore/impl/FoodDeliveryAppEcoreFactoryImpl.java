/**
 */
package foodDeliveryAppEcore.impl;

import foodDeliveryAppEcore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FoodDeliveryAppEcoreFactoryImpl extends EFactoryImpl implements FoodDeliveryAppEcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FoodDeliveryAppEcoreFactory init() {
		try {
			FoodDeliveryAppEcoreFactory theFoodDeliveryAppEcoreFactory = (FoodDeliveryAppEcoreFactory) EPackage.Registry.INSTANCE
					.getEFactory(FoodDeliveryAppEcorePackage.eNS_URI);
			if (theFoodDeliveryAppEcoreFactory != null) {
				return theFoodDeliveryAppEcoreFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FoodDeliveryAppEcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodDeliveryAppEcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FoodDeliveryAppEcorePackage.CUSTOMER:
			return createCustomer();
		case FoodDeliveryAppEcorePackage.CUSTOMER_SERVICE:
			return createCustomerService();
		case FoodDeliveryAppEcorePackage.DELIVERY_DRIVER:
			return createDeliveryDriver();
		case FoodDeliveryAppEcorePackage.USER_BASE:
			return createUserBase();
		case FoodDeliveryAppEcorePackage.RESTAURANT:
			return createRestaurant();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerService createCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		return customerService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryDriver createDeliveryDriver() {
		DeliveryDriverImpl deliveryDriver = new DeliveryDriverImpl();
		return deliveryDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserBase createUserBase() {
		UserBaseImpl userBase = new UserBaseImpl();
		return userBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restaurant createRestaurant() {
		RestaurantImpl restaurant = new RestaurantImpl();
		return restaurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodDeliveryAppEcorePackage getFoodDeliveryAppEcorePackage() {
		return (FoodDeliveryAppEcorePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FoodDeliveryAppEcorePackage getPackage() {
		return FoodDeliveryAppEcorePackage.eINSTANCE;
	}

} //FoodDeliveryAppEcoreFactoryImpl
