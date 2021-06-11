package dependency_inversion_principle.incorrect;

class Manager {
    Employee employee;

    void setWorker(Employee e) {
        employee = e;
    }

    void manage() {
        employee.work();
    }
}