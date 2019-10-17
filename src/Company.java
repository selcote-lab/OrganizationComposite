public class Company {
    public static void main(String[] args) {

        Employee e1 = new Developer("EL AKIOUI Zouhaire", 12, "Software Developer");
        Employee e2 = new Developer("Jack Ma", 13, "Front-End Developer");

        Directory engDirectory = new Directory();
        engDirectory.add(e1);
        engDirectory.add(e2);

        Employee man1 = new Manager("Karl jack", 14, "Project Manager");

        Directory managerDir = new Directory();
        managerDir.add(man1);

        Directory companyDir = new Directory();
        companyDir.add(engDirectory);
        companyDir.add(managerDir);
        companyDir.showDetails();

    }
}
