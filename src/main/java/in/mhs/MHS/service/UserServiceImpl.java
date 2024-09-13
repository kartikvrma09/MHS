package in.mhs.MHS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.mhs.MHS.model.p_details;
import in.mhs.MHS.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;
    

    @Override
    public p_details createUser(p_details user) {
    	return userRepo.save(user);
       
    }
}