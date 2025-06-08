import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice {
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    static String WriteToFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            return "File has been Written";
        } catch (FileNotFoundException e) {
            return "Could not locate file";
        } catch (IOException e) {
            return "An error occured while writing the file";
        }
    }

    static String ReadFromFile(String filePath)
    {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String res = "" ;
            String line;
            while((line = reader.readLine()) != null){
                res += line;
                res += '\n';
            }
            return "Output is : " + res;  
        }
        catch(FileNotFoundException e){
            return "Could not locate file";
        }
        catch(IOException e){
            return "Something went wrong";
        }
    }

    public static void main(String[] args) {
        System.out.printf("%d \n", add(1, 2, 3, 4));
        System.out.println(factorial(5));

        Employee emp = new Employee();
        System.out.printf("Name is : %s and salary is :  %d \n", emp.name, emp.salary);
        emp.setName("Kushal");
        System.out.printf("Name is : %s and salary is :  %d \n", emp.name, emp.salary);

        // File Handling
        System.out.println(WriteToFile("./temp.txt", "Hello i am Animish\nNice to meet you ."));
        System.out.println(ReadFromFile("./temp.txt")) ;
        
        // Generics 
        Product <String , Integer> itemBag = new Product<>("bag" , 200 ) ; 
        Product <String , Double> itemBanana = new Product<>("banana" ,  4.13) ;

        System.out.println(itemBag.getItem());
        System.out.println(itemBanana.getItem());
        itemBanana.setItem("apple");
        System.out.println(itemBanana.getItem());



    }


}