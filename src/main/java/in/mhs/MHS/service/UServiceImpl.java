package in.mhs.MHS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.mhs.MHS.model.c_details;
import in.mhs.MHS.repository.C_Repository;

@Service
public class UServiceImpl implements UService {

    @Autowired
    private C_Repository counsellorRepo; 
    

    @Override
    public c_details createCounsellor(c_details counsellor) {
    	return counsellorRepo.save(counsellor);
       
    }
}
