package compositeEx2;

public class HWComposite {
    public static void main(String [] arguments){        
        Project project = DataCreator.createData();
        
        System.out.println("Calculating total time for the project");
        System.out.println("\t" + project.getDescription());
        System.out.println("Time Required: " + project.getTimeNeeded());
        
    }
}