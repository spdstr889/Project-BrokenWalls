import java.util.Scanner;
import java.util.ArrayList;
public class BrokenWalls {
    static ArrayList<ChecklistItem> checklist=new ArrayList<>();
    
     
    static void setupChecklist(){
        String [] steps={"Airport", "Sim Card", "SIN", "Bank Account", "Nearby Activities"};
        for (int i=0; i<steps.length;i++){
            ChecklistItem item=new ChecklistItem();
            item.description=steps[i];
            item.isComplete=false;
            checklist.add(item);
        }
    }
    static void printMenu(){
        for (int i=0; i<checklist.size();i++){
            int counter=i+1;
            System.out.println("["+ counter +"]"+""+ checklist.get(i).description + (checklist.get(i).isComplete ? "[x]":"[ ]"));
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        setupChecklist();
        printMenu();

    }
    
}
