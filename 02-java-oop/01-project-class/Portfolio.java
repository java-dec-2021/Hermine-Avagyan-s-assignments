import java.util.ArrayList;

public class Portfolio {
    ArrayList<Project> projects = new ArrayList<Project>();

    public Portfolio() {
    }
    public Portfolio(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }
    //calculates and returns the cost to buy the entire portfolio.
    public double getPortfolioCost(){
        double cost = 0;
        for (Project project: projects){
            cost += project.getInitialCost();

        }
        return cost;
    }
    public void showPortfolio(){
        for (int i = 0; i < this.projects.size(); i++){

            System.out.println(this.projects.get(i).elevatorPitch());
        }

    }


}
