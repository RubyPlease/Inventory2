import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by RobertBarber on 4/8/16.
 */
public class ShoeStoreProcess {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<ShoeInventory> shoesInventory = new ArrayList<>();

    public static void shoeStoreProcess() throws Exception {

        while (true){
            System.out.println("1. Add new item\n" +
                    "2. Remove an item from shoeInventory\n" +
                    "3. Change quantity of an item\n" +
                    "4. View shoeInventory");

            String option = scanner.nextLine();

            switch (option) {
                case "1": {
                    System.out.println("Please enter category: \t[DressShoe, RunningShoe, Sneaker, WorkBoot, SportCleat");
                    String category = scanner.nextLine();
                    System.out.println("Please enter new item");
                    String text = scanner.nextLine();

                    ShoeInventory shoe = ShoeStore.createItem(text, 1, category);
                    shoesInventory.add(shoe);
                    break;
                }
                case "2": {
                    System.out.println("Please choose index number to remove");
                    int index = scanner.nextInt();

                    shoesInventory.remove(index);
                    break;
                }
                case "3": {
                    System.out.println("Please choose index number");
                    int index = scanner.nextInt();
                    System.out.println("Please enter new quantity");
                    int quantity = scanner.nextInt();
                    ShoeInventory tempShoeInv = shoesInventory.get(index);
                    tempShoeInv.setQuantity(quantity);
                    shoesInventory.remove(index);
                    shoesInventory.add(tempShoeInv);
                    break;
                }
                case "4": {
                    int i = 0;
                    for (ShoeInventory shoe : shoesInventory) {

                        System.out.printf("%s. %s", i++, shoe.toString());
                    }
                    break;
                }
                default:
                    System.out.println("Please choose an option");
                    break;

            }
        }
    }
}