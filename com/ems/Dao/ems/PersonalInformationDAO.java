package com.ems.Dao.ems;

import com.ems.BaseDao.BaseDao;
import com.ems.Entity.ems.PersonalInformationEntity;
import com.ems.IDao.ems.IPersonalInformationDAO;
import com.ems.dto.ems.PersonalInformationDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Apurbo on 11/18/2016.
 */
public class PersonalInformationDAO extends BaseDao implements IPersonalInformationDAO {

    @Transactional(readOnly = true)
    public void insertPersonalInformation(PersonalInformationEntity personalInformationEntity) {
        em.persist(personalInformationEntity);
        em.flush();
    }

    public List<PersonalInformationDTO> personalInformationDetails() {
        String query = properties.getProperty("personalInformationDao.personalInformationDetails");
        org.hibernate.Query hQuery = hibernateQuery(query);
        return hQuery.list();
    }
}
