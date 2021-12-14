public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava pzj = new PuzzleJava();

        //System.out.println(pzj.getTenRolls(1,20));
        //System.out.println(pzj.randomLetter());
       // System.out.println(pzj.generatePassword());
        System.out.println(pzj.getNewPasswordSet(5));
        int[] arr = {3,5,8,2,12,123};
        System.out.println(pzj.shuffleArray(arr));


    }


}
