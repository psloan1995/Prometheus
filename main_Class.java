import java.util.Scanner;
public class main_Class {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String response;	//Response holds the users String answer. 
		
		story_Method Story = new story_Method();	//The start and end of the story_Method  
		
		/*Here I am asking you which character you would like to be. */
		System.out.println("Are you ready to begin? (Yes/No): ");
		response = input.nextLine();
		
		if(response.equalsIgnoreCase ("Yes")){
			Story.story();
		}
		else{
			Story.endStory();
		}
		input.close();
	}
}