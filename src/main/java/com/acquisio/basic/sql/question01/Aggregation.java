package com.acquisio.basic.sql.question01;

import com.acquisio.util.dbutil.H2DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Write a query to extract the number of employees that are working on each project.
 * -- The select should output those columns
 * -- |ProjectTitle|NumberOfEmployees|
 *
 * Here is the database schema to use.
 * <p>
 * employees                             projects
 * +---------------+---------+           +---------------+---------+
 * | id            | int     |<----+  +->| id            | int     |
 * | first_name    | varchar |     |  |  | title         | varchar |
 * | last_name     | varchar |     |  |  | start_date    | date    |
 * | salary        | int     |     |  |  | end_date      | date    |
 * | department_id | int     |--+  |  |  | budget        | int     |
 * +---------------+---------+  |  |  |  +---------------+---------+
 * |  |  |
 * departments                  |  |  |  employees_projects
 * +---------------+---------+  |  |  |  +---------------+---------+
 * | id            | int     |<-+  |  +--| project_id    | int     |
 * | name          | varchar |     +-----| employee_id   | int     |
 * +---------------+---------+           +---------------+---------+
 */
public class Aggregation {
    public static void main(String[] args) throws SQLException {
        H2DBUtil.startDatabase();
        try {
            Aggregation instance = new Aggregation();
            instance.printNumberOfEmployeesPerProject();
        } finally {
            H2DBUtil.stopDatabase();
        }
    }

    private void printNumberOfEmployeesPerProject() throws SQLException {
        try (Connection conn = H2DBUtil.getConnection()) {
            
            String query = 
                    "SELECT title AS ProjectTitle, project_counts.NumberOfEmployees "
                  + "FROM projects "
                  + "INNER JOIN "
                  + "    (SELECT project_id, COUNT(*) AS NumberOfEmployees "
                  + "     FROM employees_projects "
                  + "     GROUP BY project_id) AS project_counts "
                  + "ON projects.id = project_counts.project_id";

            ResultSet resultSet = conn.createStatement().executeQuery(query);
            H2DBUtil.displayResultSet(resultSet);

        }
    }
}
