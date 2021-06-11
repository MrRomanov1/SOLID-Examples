package dependency_inversion_principle.correct;

class Manager {
    Worker worker;

    void setWorker(Worker w) {
        worker = w;
    }

    void manage() {
        worker.work();
    }
}