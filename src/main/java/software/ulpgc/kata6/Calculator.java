package software.ulpgc.kata6;

public class Calculator {
    public String input;

    public Calculator(String input) {
        this.input = input;
    }

    public String calculate(){
        String[] problem = spliter();
        int solution = 0;
        for(int i = 0; i<problem.length;i++){
            if (!problem[i].equals("+")){
                solution += Integer.parseInt(problem[i]);
            }
        }
        return Integer.toString(solution);
//        return Integer.toString(Integer.parseInt(problem[0])+ Integer.parseInt(problem[2]));
    }

    private String[] spliter() {
        return input.split("((?=\\+)|(?=-))");
    }
}
