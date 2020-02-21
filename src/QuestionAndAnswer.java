public class QuestionAndAnswer {

    //POJO to represent questions and answers list

    private String questionNumber;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String correctAnswer;
    private String correctAnswerAbc;

    public QuestionAndAnswer() {
        super();
    }

    public QuestionAndAnswer(String questionNumber, String question, String answer1, String answer2, String answer3, String correctAnswer, String correctAnswerAbc) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.correctAnswer = correctAnswer;
        this.correctAnswerAbc = correctAnswerAbc;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }


    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getCorrectAnswerAbc() {
        return correctAnswerAbc;
    }

    public void setCorrectAnswerAbc(String correctAnswerAbc) {
        this.correctAnswerAbc = correctAnswerAbc;
    }

    @Override
    public String toString() {
        return  ", question='" + question + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}' + '\n'+ '\n';
    }

} //QuestionAndAnswer Class


