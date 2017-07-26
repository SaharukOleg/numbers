import java.util.*;

public class Logic {
    List<Integer> list = new ArrayList();
    Scanner sc = new Scanner(System.in);

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int n = Integer.parseInt(sc.nextLine());
        list.add(n);
        System.out.println(list);

        System.out.println("If you want add  one more number enter 'y' ");
        System.out.println("If you want continue start second part enter 's' ");
        System.out.println("If you want exit enter 'e' ");

        String choice = sc.next();
        if (choice.equals("y")) {
            add();
        } else if (choice.equals("s")) {
            secondPart();
        } else if (choice.equals("e")) {
            System.exit(0);
        }
    }


    public void secondPart() {

        System.out.println("enter number ");
        int numb = sc.nextInt();
        if(numb>18 || numb<0){
            System.out.println("Sorry but in arrays there is not combination TRY AGAIN");


        }

        if (list.size() == 1) {
            System.out.println("sorry but you array have only one elements");
            System.out.println("if you want add  one more number enter 'y'?");
            System.out.println("if you want exit enter 'n'");
            String choice = sc.next();
            if (choice.equals("y")) {
                add();
            } else if (choice.equals("n")) {
                System.exit(0);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > 0; j--) {
                if (list.get(i) + list.get(j) == numb) {
                    System.out.println("[" + list.get(i) + " : " + list.get(j) + "]");
                }
            }
        }
    }
}
