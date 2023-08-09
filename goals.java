import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class SustainableGoal {
    private String areaOfFocus;
    private String specificGoal;
    private String customization;
    private double progress;
    private boolean achieved;

    public SustainableGoal(String areaOfFocus, String specificGoal) {
        this.areaOfFocus = areaOfFocus;
        this.specificGoal = specificGoal;
        this.customization = "";
        this.progress = 0;
        this.achieved = false;
    }

    public String getAreaOfFocus() {
        return areaOfFocus;
    }

    public String getSpecificGoal() {
        return specificGoal;
    }

    public String getCustomization() {
        return customization;
    }

    public double getProgress() {
        return progress;
    }

    public boolean isAchieved() {
        return achieved;
    }

    public void customizeGoal(String customization) {
        this.customization = customization;
    }

    public void updateProgress(double newProgress) {
        this.progress = newProgress;
        if (progress >= 100) {
            achieved = true;
        }
    }
}

class User {
    private String username;
    private ArrayList<SustainableGoal> goals;

    public User(String username) {
        this.username = username;
        this.goals = new ArrayList<>();
    }

    public void addGoal(SustainableGoal goal) {
        goals.add(goal);
    }

    public ArrayList<SustainableGoal> getGoals() {
        return goals;
    }
}

public class EarthHeroApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Earth Hero!");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        
        User user = new User(username);
        
        System.out.println("Select an area of focus for your sustainable goals:");
        System.out.println("1. Energy Consumption");
        System.out.println("2. Waste Reduction");
        System.out.println("3. Transportation");
        int choice = scanner.nextInt();
        
        String areaOfFocus = "";
        switch (choice) {
            case 1:
                areaOfFocus = "Energy Consumption";
                break;
            case 2:
                areaOfFocus = "Waste Reduction";
                break;
            case 3:
                areaOfFocus = "Transportation";
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
        
        scanner.nextLine(); // Consume the newline
        
        System.out.print("Enter a specific goal within " + areaOfFocus + ": ");
        String specificGoal = scanner.nextLine();
        
        SustainableGoal goal = new SustainableGoal(areaOfFocus, specificGoal);
        user.addGoal(goal);
        
        System.out.println("Your goal has been set! Here are some suggestions:");
        System.out.println("1. Reduce energy consumption by turning off lights when not in use.");
        System.out.println("2. Start composting food waste to reduce landfill waste.");
        System.out.println("3. Use public transportation or carpool to reduce carbon emissions.");
        
        System.out.print("Do you want to customize your goal? (yes/no): ");
        String customizeChoice = scanner.nextLine();
        if (customizeChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter your customization: ");
            String customization = scanner.nextLine();
            goal.customizeGoal(customization);
        }
        
        System.out.println("Goal customization and setup complete!");
        
        while (!goal.isAchieved()) {
            System.out.println("Your progress towards the goal is " + goal.getProgress() + "%");
            System.out.println("Keep working on it!");
            goal.updateProgress(goal.getProgress() + 10); // Simulate progress
        }
        
        System.out.println("Congratulations! You have achieved your goal!");
        System.out.println("Here's a new goal suggestion: Install energy-efficient appliances at home.");
        
        scanner.close();
    }
}
