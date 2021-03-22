package compositeEx2;

class DataCreator{    
    static Project createData(){
        Contact contact1 = new ContactImpl("John", "Deere", "CEO", "Wise Guys LTD");
        Contact contact2 = new ContactImpl("Moises", "Eckengerg", "Banker", "No Money, Inc.");
        Contact contact3 = new ContactImpl("Erik", "Oloffson", "Brave man", "Viking, Inc.");
        Contact contact4 = new ContactImpl("Lem", "Ming", "Slow guy", "BDA");
        
        Project project = new Project("IslandParadise", "Acquire a personal island paradise");
        Deliverable deliverable1 = new Deliverable("Island Paradise", "", contact1);
        Task task1 = new Task("Fortune", "Get a lot of money", contact4, 12.0);
        Task task2 = new Task("Isle", "Find a good island", contact2, 4.5);
        Task task3 = new Task("Name", "Come up with a name for the island", contact3, 1.1);
        project.addProjectItem(deliverable1);
        project.addProjectItem(task1);
        project.addProjectItem(task2);
        project.addProjectItem(task3);
        
        Deliverable deliverable11 = new Deliverable("$1,000,000", "(total money)", contact1);
        Task task11 = new Task("Fortune1", "Cheat on the lottery", contact4, 12.5);
        Task task12 = new Task("Fortune2", "Invest money in the real estate business for more money", contact1, 16.3);
        task1.addProjectItem(task11);
        task1.addProjectItem(task12);
        task1.addProjectItem(deliverable11);
        
        Task task21 = new Task("Isle1", "Find out whether Fiji has better weather than French Polynesia", contact1, 1.0);
        Task task22 = new Task("Isle2", "Locate an island for auction on EBay", contact4, 6.3);
        Task task23 = new Task("Isle2a", "Buy the island", contact3, 7.1);
        task2.addProjectItem(task21);
        task2.addProjectItem(task22);
        task2.addProjectItem(task23);
        
        Deliverable deliverable31 = new Deliverable("Island Name", "", contact1);
        task3.addProjectItem(deliverable31);
        return project;
    }
}
