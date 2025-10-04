import com.muneesh.queastions.*;

import javax.imageio.stream.ImageOutputStream;
import javax.swing.text.StringContent;

import java.util.*;
public class Main {
    void main(){
        Scanner sc = new Scanner(System.in);
        List<Questions> qa = new ArrayList<Questions>();
        qa.add(new Questions(
                "1. Which collection class allows duplicate elements?",
                new String[]{"A. Set", "B. List", "C. Map", "D. None"},
                'B'));
        qa.add(new Questions("2.What is the size of int in java?",new String[]{"A.1","B.4","C.8",},'B'));
        int score =0;
        for (Questions q :  qa){
            IO.println("/n"+ q.QueastionsText);
            for(String option : q.Options){
                IO.println(option);
            }
            IO.println("Enter your answer");
            char answer = Character.toUpperCase(sc.next().charAt(0));
            if(answer ==q.CorrectAnswers){
                IO.println("correct");
                score++;
            }
            else{
                IO.println("wrong answer"+ q.CorrectAnswers);
            }
            System.out.println("\n===== Quiz Completed =====");
            System.out.println("Your score: " + score + "/" + qa.size());

            // Optional: Apply logic for feedback
            if (score == qa.size()) {
                System.out.println("🌟 Excellent! You got all correct!");
            } else if (score >= qa.size() / 2) {
                System.out.println("👍 Good effort!");
            } else {
                System.out.println("📘 Keep practicing!");
            }
        }
        sc.close();
    }
}