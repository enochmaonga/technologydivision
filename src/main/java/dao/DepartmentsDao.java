package dao;

import models.Departments;

import java.util.List;

public class DepartmentsDao {

    //list
    List<Departments>getAll();

    //Create

    void add (Departments category);

    //Read

    Departments findById(int();

    //Update
    void update(int id, String name);

    //Delete
    void deleteById(int id);
    voidDeleteAllDepartments();
}


