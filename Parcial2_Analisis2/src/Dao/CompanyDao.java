package Dao;

import java.util.*;
import model.CompanyEntity;

public class CompanyDao {

    public CompanyDao() {
    }

    public void createCompany(CompanyEntity company) {
        // TODO implement here
        
    }

    public void deleteCompany(int id) {
        // TODO implement here
        
    }

    public List<CompanyEntity> readAllCompany() {
        List<CompanyEntity> companyEntity = new ArrayList<>();
        return companyEntity;
    }

    public CompanyEntity readCompanyById(int id) {
        CompanyEntity theCompany = new CompanyEntity();
        //CONEXION A DATOS
        return theCompany;
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