package primeiraaplicacao.primeiroprojeto;

public class ControlFlow {
    public static void main(String[] args) {

        int realiseYear = 2022;
        double movieRating = 8.1;
        boolean isIncludedInPlan = true;
        String subscriptionPlanType = "premium";

        if ( realiseYear >= 2022) {
            System.out.println("The movie is a new release and currently popular. ");
        } else {
            System.out.println("A classic retro film - highly recommended");
        }

        if (isIncludedInPlan && subscriptionPlanType.equals("premium")) {
            System.out.println("Unlocked content");
        } else {
            System.out.println("Content available for rent");
        }

    }
}
