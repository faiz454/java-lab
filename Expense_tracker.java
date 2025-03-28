import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class Expense{
    private String category;
    private double amount;
    private String description;

    public Expense(String category,double amount,String description){
        this.category=category;
        this.amount=amount;
        this.description=description;
    }

    public String getCategory(){
        return category;
    }
    public double getAmount(){
        return amount;
    }
    public String toString(){
        return "Category: "+category+"Amounnt: "+amount+"Description: "+description;
    }
}

class Expense_tracker{
    private static List<Expense>expense_list=new ArrayList<>();
    private static Scanner c=new Scanner(System.in);

    public static void main(String args[]){
        while(true){
            System.out.println("\n expense tracker MENU");
            System.out.println("-----------------------");
            System.out.println("1.add expenses");
            System.out.println("2.View all expenses");
            System.out.println("3.calculate total expenses");
            System.out.println("4.filter expenses by category");
            System.out.println("5.exit");
            System.out.println("chosse your option");
            int choice=c.nextInt();
            switch(choice){
                case 1:
                    addExpenses();
                    break;
                case 2:
                    ViewAllExpenses();
                    break;
                case 3:
                    calculateTotalExpenses();
                    break;
                case 4:
                    filterExpenseByCategory();
                    break;
                case 5:
                    System.out.println("Thank for using expense tracker");
                    return;
                default:
                    System.out.println("enter correct option");
            }
        }
    }
    private static void addExpenses(){
        System.out.println("enter expenses categories");
        String category=c.nextLine();
        System.out.println("Enter expenses amount");
        double amount=c.nextDouble();
        System.out.println("enter expenses description");
        String description=c.nextLine();

        expense_list.add(new Expense(category,amount,description));


    }

    public static void ViewAllExpenses(){
        if(expense_list.isEmpty()){
            System.out.println("no expenses reported");
        }else {
            System.out.println("\n list of expenses");
        }
        for (Expense expense:expense_list){
            System.out.println(expense);
        }
    }

    private static void calculateTotalExpenses(){
        double total=0;
        for (Expense expense:expense_list){
            total+= expense.getAmount();
        }
        System.out.println("total expenses: "+total);
    }
    private static void filterExpenseByCategory(){
        System.out.println("enter expense categories");
        String category=c.nextLine();
        boolean found=false;
        System.out.println("\nexpenses in category: "+category);
        for (Expense expense:expense_list){
            if (expense.getCategory().equalsIgnoreCase(category)){
                System.out.println(expense);
                found=true;
            }
        }
        if (!found){
            System.out.println("no expense found in this category");
        }
    }
}