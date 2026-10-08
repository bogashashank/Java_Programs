public class StudentMarksArray {
    public static void main (String[] args){

        int marks[] = {70, 35, 45, 40, 90};

        System.out.println("Student Marks:");

        for (int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");   
        }
        
        System.out.println(); 

        int search = 80;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == search ){
                System.out.println("80 found at index " + i);
            }
        }

        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 40){
                count++;
            }
        }
        
        
        System.out.println("Number of students who passed: " + count);

    } 
} 

int highest = marks[0];

int lowest = marks[0];

for (int = 1; i < marks.length; i++){

    if (marks[i] > highest){
        highest = marks[i];

    }

    if (marks[i] < lowest ){
        lowest = marks[i];

    }
}

System.out.println("Highest marks: " + highest);
System.out.println("Lowest marks: " + lowest);