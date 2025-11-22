package in.vatsaryan.foodiesapi.service;

import in.vatsaryan.foodiesapi.io.UserRequest;
import in.vatsaryan.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
