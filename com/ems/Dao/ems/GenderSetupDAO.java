package com.ems.Dao.ems;

import com.ems.BaseDao.BaseDao;
import com.ems.Entity.ems.GenderSetup;
import com.ems.IDao.ems.IGenderSetupDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Apurbo on 11/20/2016.
 */
public class GenderSetupDAO extends BaseDao implements IGenderSetupDAO {
    @Transactional(readOnly = true)
    public void insertGender(GenderSetup genderSetup) {
        em.persist(genderSetup);
        em.flush();
    }
}
