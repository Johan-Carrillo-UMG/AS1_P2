package service;

import java.util.*;
import model.CompanyEntity;

public class CompanyService {

    public CompanyService() {
    }

    public void createCompany(CompanyEntity company) {
        // TODO implement here
        
    }

    public void deleteCompany(int id) {
        // TODO implement here
        
    }

    public List<CompanyEntity> getAllCompany() {
        List<CompanyEntity> companyEntity = new ArrayList<>();
        return companyEntity;
    }

    public CompanyEntity getCompany(int id) {
        CompanyEntity companyEntity = new CompanyEntity();
        return companyEntity;
    }

    public double requestUniqueCode(int id) {
        double aleatorio = Math.random()*10000+1;
        //MANDAR NUMERO A LA LISTA CON EL ID PARA SABER A QUIEN
        return aleatorio;
    }

    public void scheduleAppointment(CompanyEntity company) {
        // TODO implement here
        
    }

}