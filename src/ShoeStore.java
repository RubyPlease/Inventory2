public class ShoeStore {
    public static void main(String[] args) throws Exception{
        ShoeStoreProcess.shoeStoreProcess();

    }

    static ShoeInventory createItem(String name, int quantity, String category) throws Exception{
        if (category.equalsIgnoreCase("SportCleat")){
            return new SportCleat(name, quantity);
        }
        if (category.equalsIgnoreCase("RunningShoe")){
            return new RunningShoe(name, quantity);
        }
        if (category.equalsIgnoreCase("WorkBoot")){
            return new WorkBoot(name, quantity);
        }
        if (category.equalsIgnoreCase("Sneaker")){
            return new Sneaker(name, quantity);
        }
        if (category.equalsIgnoreCase("DressShoe")){
            return new DressShoe(name, quantity);
        }

        throw new Exception();
    }
}
