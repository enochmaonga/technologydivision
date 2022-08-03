package dao;

import Models.Departments;
import org.sql2o.Sql2o;

import java.util.List;

public class DepartmentsDao {

    //list


    //Create

    public DepartmentsDao() {
    }

    public void add(Departments category) {

    }

    //Read
//
//    public List<Departments> getAll(FileChannel sql2o) {
//        try(Connection con = sql2o.open()){
//            return con.createQuery("SELECT * FROM departments")
//                    .executeAndFetch(Departments.class);
//        }
//    }

    public Departments findById(int departmentId) {
        return null;
    }

    //Update
    public void update(int id, String name) {

    }

    //Delete
    public void deleteById(int id) {

    }

    void voidDeleteAllDepartments() {

    }

//    public void deleteAllDepartments() {
//        String sql = "DELETE from departments";
//        FileChannel sql2o = null;
//        try (Connection con = sql2o.open()) {
//            con.createQuery(sql)
//                    .executeUpdate();
//        } catch (Sql2oException ex){
//            System.out.println(ex);
//        }
//    }

    public List<Departments> getAll(Sql2o sql2o) {
        return null;
    }
}


