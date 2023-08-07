package Service;

import java.util.List;

import entities.Customer;

public interface UserService {

	void ApproveUser(Customer customer1) throws CustomerNotEligibleException, CustomerAlreadyPresentException;

	void ModifyUser(Customer customer1) throws CustomerNotFoundException;

	List<Customer> Viewalluser();

	int login(String userName, String password);

}
