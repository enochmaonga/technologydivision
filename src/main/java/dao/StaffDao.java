package dao;

import Models.Staff;

import java.util.List;

public interface StaffDao {




    // LIST
    List<Staff> getAll();
    List<Staff> getByDepartment(int departmentId);


    // CREATE
    void add(Staff staff);


    // READ
    Object findById(int id);


    // UPDATE
    void update(int id, String content);


    // DELETE
    void deleteById(int id);
    void deleteAllStaff();


}

