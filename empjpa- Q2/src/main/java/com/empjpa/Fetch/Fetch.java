package com.empjpa.Fetch;
import javax.persistence.*;
import java.util.List;
import com.empjpa.Emp.EmployeeEntity;
public class Fetch {

  public static void main(String args[])

  {

    EntityManagerFactory emf=Persistence.createEntityManagerFactory("emp_details");

    EntityManager em=emf.createEntityManager();
    

    em.getTransaction().begin();

    EmployeeEntity s1=new EmployeeEntity();

    s1.setE_no(103);

    s1.setE_name("Raj");

    s1.setE_sal(4000);
    s1.setE_designation("clerk");

    

    EmployeeEntity s2=new EmployeeEntity();

    s2.setE_no(105);

    s2.setE_name("Ramu");

    s2.setE_sal(4566);
    s2.setE_designation("Manager");

    EmployeeEntity s3=new EmployeeEntity();

    s3.setE_no(107);

    s3.setE_name("Rahul");

    s3.setE_sal(4674);
    s3.setE_designation("Sr Manager");
    
    
   

    em.persist(s1);

    em.persist(s2);

    em.persist(s3);

em.getTransaction().commit();

Query q= em.createQuery("from EmployeeEntity");

List <EmployeeEntity> list= q.getResultList();

for(EmployeeEntity se:list)

{

 System.out.println(se.getE_no()+" "+se.getE_name()+" "+se.getE_designation()+" "+se.getE_sal());

}
  }
}
