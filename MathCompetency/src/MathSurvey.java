import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

    public class MathSurvey {
        private List<MathQuestion> questions;
        private List<Integer> userResponses;
        private int score;

        public MathSurvey(List<MathQuestion> questions) {
            this.questions = questions;
            this.userResponses = new ArrayList<>();
            this.score = 0;
        }

        public void takeSurvey() {
            Scanner scanner = new Scanner(System.in);

            for (MathQuestion question : questions) {
                System.out.println(question.getQuestionText());
                List<String> answerChoices = question.getAnswerChoices();

                for (int i = 0; i < answerChoices.size(); i++) {
                    System.out.printf("%d. %s\n", i + 1, answerChoices.get(i));
                }

                System.out.print("Enter your answer (1-" + answerChoices.size() + "): ");
                int userAnswer = scanner.nextInt();
                userResponses.add(userAnswer);

                if (userAnswer == question.getCorrectAnswer()) {
                    score++;
                }
            }

            System.out.printf("Your score is %d out of %d.\n", score, questions.size());
            System.out.printf("Your percentage score is %.2f%%.\n", (double) score / questions.size() * 100);
        }
    }