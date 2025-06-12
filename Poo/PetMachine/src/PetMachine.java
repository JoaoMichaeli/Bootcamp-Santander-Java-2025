public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet para iniciar o banho");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade máxima de água atingida");
            return;
        }
        water += 30;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade máxima de shampoo atingido");
            return;
        }
        shampoo += 10;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("Máquina suja, limpe-a para utilizar novamente");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }

    public void removePet(){
        this.clean = this.pet.isClean();

        System.out.println("O pet " + this.pet.getName() + " está limpo");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;

        System.out.println("Máquina limpa");
    }
}
