package company;


public class WorkPermitSimulation extends Thread{

    public WorkPermitSimulation() {
        super("WorkPermitSimulation");
    }
    
    @Override
    public void run() {
        System.out.println(getName());
    }
}
