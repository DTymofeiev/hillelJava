package lesson_6;

public class Povodir extends Pet {
    protected boolean isVaccinated;
    private boolean isTrained;

    Povodir(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name);
        this.isVaccinated = isVaccinated;
        this.isTrained = isTrained;
    }

    public static void goHome() {
    }

    @Override
    public String voice() {

        if (isTrained) {
            return super.voice() + ". I can take you home.";
        }
        return super.voice();
    }
}


