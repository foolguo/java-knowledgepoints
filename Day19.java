// 模板（方法设计模式）

//例子星巴克咖啡
import java.util.Scanner;
abstract class CaffenineBeverage{
    final void prepareRecipe(){
        boilWater();
        brew();
        pourIncup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourIncup(){
        System.out.println("pouring into cup");
    }
    //钩子方法
    boolean customerWantsCondiments(){//钩子方法
        return true;
    }
}
class Tea extends CaffenineBeverage{
    void brew(){
        System.out.println("Steeping the tea");
    }
    void addCondiments(){
        System.out.println("Adding Lemon");
    }
}
class Coffee extends CaffenineBeverage{
    void brew(){
        System.out.println("Brew coffee");
    }
    
    void addCondiments(){
        System.out.println("Adding suger and Milk");
    }
    public boolean customerWantsCondiments(){
        String answer =getUserInput();
        if(answer.equals("y")){
            return true;
        }else{
            return false;
        }
    }
    private String getUserInput(){
        String answer = null;
        System.out.println("您想要在咖啡中加入牛奶或糖么(y/n))");
        Scanner scanner=new Scanner(System.in);
        answer=scanner.nextLine();
        return answer;
    } 
}
public class Day19{
    public static void main(String[] args){
         CaffenineBeverage tea = new Tea();
         tea.prepareRecipe();
         CaffenineBeverage coffee = new Coffee();
         coffee.prepareRecipe();
        
    }
}