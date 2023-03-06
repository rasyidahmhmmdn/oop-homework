import java.util.ArrayList;
import java.util.List;
    public class Main {
        public static void main(String[] args) {
            List<MathQuestion> questions = new ArrayList<>();
            List<School> schools = new ArrayList<>();

            schools.add(new School("SMK Alam","Jalan Batu","Encik Ahmad"));
            schools.add(new School("SMK Bukit Naga","Jalan Air","Puan Ani"));
            schools.add(new School("SMK Jaya","Jalan Purnama","Encik Ramlee"));

            // Add some math questions to the list
            questions.add(new MathQuestion("What is 2 + 2?",List.of("1", "2", "3", "4"), 4));
            questions.add(new MathQuestion("What is 10 - 5?", List.of("2", "5", "10", "15"), 2));
            questions.add(new MathQuestion("What is 4 * 3?", List.of("8", "12", "16", "20"), 2));
            questions.add(new MathQuestion("What is 21 / 7?", List.of("1", "2", "3", "4"), 3));

            MathSurvey survey = new MathSurvey(questions);
            survey.takeSurvey();

        }

    }