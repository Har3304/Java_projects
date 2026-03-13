public class StudentManagementSystem {
    
    private String name;
    private int rollno;
    private double percentage;

    
    public StudentManagementSystem(String name, int rollno, double percentage) {
        this.name = name;
        this.rollno = rollno;
        this.percentage = percentage;
    }

    
    public String getName() { 
        return name; 
    }

    
    public int getRollNo() { 
        return rollno; 
    }

    
    public double getPercentage() { 
        return percentage; 
    }

    
    public static void main(String[] args) {
        
        StudentManagementSystem student1 = new StudentManagementSystem("Alice Johnson", 101, 88.5);
        StudentManagementSystem student2 = new StudentManagementSystem("Bob Smith", 102, 92.3);
        StudentManagementSystem student3 = new StudentManagementSystem("Julian Nobel", 21, 68.01);

        
        System.out.println("--- Student 1 Details ---");
        System.out.println("Name: " + student1.getName());
        System.out.println("Roll No: " + student1.getRollNo());
        System.out.println("Percentage: " + student1.getPercentage() + "%");

        System.out.println(); 

        
        System.out.println("--- Student 2 Details ---");
        System.out.println("Name: " + student2.getName());
        System.out.println("Roll No: " + student2.getRollNo());
        System.out.println("Percentage: " + student2.getPercentage() + "%");

        
        System.out.println("--- Student 3 Details ---");
        System.out.println("Name: " + student3.getName());
        System.out.println("Roll No: " + student3.getRollNo());
        System.out.println("Percentage: " + student3.getPercentage() + "%");
    }
}
