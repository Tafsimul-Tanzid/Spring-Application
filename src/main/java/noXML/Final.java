package noXML;


import org.springframework.beans.factory.annotation.Value;

public class Final implements Exam {
    @Value("${final.exam.date}")
    private String date;
    @Override
    public String result() {
        return "org.example.Final class";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
