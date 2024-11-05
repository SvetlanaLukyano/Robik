public class VacuumCleanerRobik extends Robot {
    public VacuumCleanerRobik () {
        super("Vacuum Cleaner Robik"); // передача модели Робик в конструктор базового класса
    }
    @Override
    public void sayHello() {
        System.out.println("Hi people! I'm " + getModel());
    }

}
