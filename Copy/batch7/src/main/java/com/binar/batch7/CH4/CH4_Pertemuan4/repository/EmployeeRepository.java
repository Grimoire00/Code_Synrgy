package com.binar.batch7.CH4.CH4_Pertemuan4.repository;


import com.binar.batch7.CH4.CH4_Pertemuan4.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
//public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
public interface EmployeeRepository extends JpaRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {
    //JPA
    @Query(value = "select e from Employee e ")
    public List<Employee> getALlPage();

    //    Store prosedure
    @Query(value = "select * from getemployee6()",nativeQuery = true)
    public List<Object> getListSP();

    @Procedure("insert1")
    @Transactional
    void saveEmployeeSP(@Param("resid") Long resid, @Param("rqnama") String rqnama);

    @Transactional
    @Procedure("update_employee")
    void updateEmployeeSP(@Param("resid") Long resid,@Param("rqnama") String rqnama);

    @Transactional
    @Procedure("deleted_employee1")
    void deleted_employee1(@Param("resid") Long resid);

    @Query(value = "select * from getemployeebyid(:rqid)",nativeQuery = true)
    Object getemployeebyid(@Param("rqid") Long rqid);

}

