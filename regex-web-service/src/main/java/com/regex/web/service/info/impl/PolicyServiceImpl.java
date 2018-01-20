package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.PolicyDAO;
import com.regex.web.common.dto.info.PolicyDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PolicyServiceImpl implements PolicyService{
    @Autowired
    private PolicyDAO policyDAO;
    @Override
    public long getPolicyDTORowCount(Assist assist){
        return policyDAO.getPolicyDTORowCount(assist);
    }
    @Override
    public List<PolicyDTO> selectPolicyDTO(Assist assist){
        return policyDAO.selectPolicyDTO(assist);
    }
    @Override
    public PolicyDTO selectPolicyDTOByObj(PolicyDTO obj){
        return policyDAO.selectPolicyDTOByObj(obj);
    }
    @Override
    public PolicyDTO selectPolicyDTOById(Long id){
        return policyDAO.selectPolicyDTOById(id);
    }
    @Override
    public int insertPolicyDTO(PolicyDTO value){
        return policyDAO.insertPolicyDTO(value);
    }
    @Override
    public int insertNonEmptyPolicyDTO(PolicyDTO value){
        return policyDAO.insertNonEmptyPolicyDTO(value);
    }
    @Override
    public int insertPolicyDTOByBatch(List<PolicyDTO> value){
        return policyDAO.insertPolicyDTOByBatch(value);
    }
    @Override
    public int deletePolicyDTOById(Long id){
        return policyDAO.deletePolicyDTOById(id);
    }
    @Override
    public int deletePolicyDTO(Assist assist){
        return policyDAO.deletePolicyDTO(assist);
    }
    @Override
    public int updatePolicyDTOById(PolicyDTO enti){
        return policyDAO.updatePolicyDTOById(enti);
    }
    @Override
    public int updatePolicyDTO(PolicyDTO value, Assist assist){
        return policyDAO.updatePolicyDTO(value,assist);
    }
    @Override
    public int updateNonEmptyPolicyDTOById(PolicyDTO enti){
        return policyDAO.updateNonEmptyPolicyDTOById(enti);
    }
    @Override
    public int updateNonEmptyPolicyDTO(PolicyDTO value, Assist assist){
        return policyDAO.updateNonEmptyPolicyDTO(value,assist);
    }

    public PolicyDAO getPolicyDAO() {
        return this.policyDAO;
    }

    public void setPolicyDAO(PolicyDAO policyDAO) {
        this.policyDAO = policyDAO;
    }

}