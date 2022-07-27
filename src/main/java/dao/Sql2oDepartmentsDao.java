package dao;

import Models.Departments;
import Models.Staff;
import models.Departments;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.sql.Connection;

public class Sql2oDepartmentsDao extends DepartmentsDao {
    private final Sql2o Sql2o;

    public Sql2oDepartmentsDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public Sql2o getAll(Staff departments) {
        try (Connection con = sql2o.open()) {
            return con.creatQuery("SELECT * FROM departments")
                    .executeAndFetch(departements.class);
        }
////---------------------
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Sql2oDepartmentsDao that = (Sql2oDepartmentsDao) o;
//        return Objects.equals(Sql2o, that.Sql2o);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(Sql2o);
//    }
//
//    public Sql2o getSql2o() {
//        return Sql2o;
//    }
//
//    public Sql2o getSql2o() {
//        return Sql2o;
//    }
//
//    @Override
//    Departments findById() {
//        return super.findById();
//    }
//--------------
        @Override
        public void add ;(Departments departments){
            String sql = "INSERT INTO departments (name) VALUES (:name)";
            try (Connection con = sql2o.open()) {
                int id = (int) con.createQuery(sql, true)
                        .bind(departments)
                        .executeUpdate()
                        .getKey();
                departments.setId(id);
            } catch (Sql2oException ex) {
                System.out.println(ex);
            }
        }


        @Override
        public Departments findById ( int id){
            try (Connection con = sql2o.open()) {
                return con.createQuery("SELECT * FROM departments WHERE id = :id")
                        .addParameter("id", id)
                        .executeAndFetchFirst(Departments.class);
            }
        }


        @Override
        public void update (int id, String name){
            String sql = "UPDATE departments SET name = :name WHERE id=:id";
            try (Connection con = sql2o.open()) {
                con.createQuery(sql)
                        .addParameter("name", name)
                        .addParameter("id", id)
                        .executeUpdate();
            } catch (Sql2oException ex) {
                System.out.println(ex);
            }
        }
        ;


        @Override
        public void deleteById ( int id){
            String sql = "DELETE from departments WHERE id=:id";
            try (Connection con = sql2o.open()) {
                con.createQuery(sql)
                        .addParameter("id", id)
                        .executeUpdate();
            } catch (Sql2oException ex) {
                System.out.println(ex);
            }
        }


        @Override
        public void deleteAllDepartments () {
            String sql = "DELETE from departments";
            try (Connection con = sql2o.open()) {
                con.createQuery(sql)
                        .executeUpdate();
            } catch (Sql2oException ex) {
                System.out.println(ex);
            }
        }


    }
}