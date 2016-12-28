package com.ems.Dao.ems;

import com.ems.BaseDao.BaseDao;
import com.ems.Entity.ems.MaritalStatusSetup;
import com.ems.IDao.ems.IMaritalStatusSetupDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Apurbo on 11/21/2016.
 */
public class MaritalStatusSetupDAO extends BaseDao implements IMaritalStatusSetupDAO {

    @Transactional(readOnly = true)
    public void insertMaritalStauts(MaritalStatusSetup maritalStatusSetup) {
        em.persist(maritalStatusSetup);
        em.flush();
    }
}
