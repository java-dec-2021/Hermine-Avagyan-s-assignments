public class ProjectTest {
    public static void main(String[] args) {

        Portfolio portfolio = new Portfolio();
        Project project1 = new Project();
        project1.setName("Calculator");
        project1.setInitialCost(150.00);
        project1.setDescription("The project adds, subtracts, multiplies, and divides two given numbers");
        portfolio.getProjects().add(project1);

        Project project2 = new Project ("Bank account", "This project loops over the all the accounts of a user and returns the total of all the accounts", 200.00);
        Project project3 = new Project("Zoo keeper", "Practice with methods and classes", 300.00);
        portfolio.getProjects().add(project2);
        portfolio.getProjects().add(project3);


        //System.out.println(project2.elevatorPitch());
        System.out.println(portfolio.getPortfolioCost());
    portfolio.showPortfolio();}




}
