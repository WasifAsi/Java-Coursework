package Java_coursework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class Start {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public static ArrayList GroupA = new ArrayList();
    public static ArrayList GroupB = new ArrayList();
    public static ArrayList GroupC = new ArrayList();
    public static ArrayList GroupD = new ArrayList();


    @FXML
    public void Start_Game(ActionEvent event) throws IOException {
        ReadGA();
        ReadGB();
        ReadGC();
        ReadGD();

        root = FXMLLoader.load(getClass().getResource("Game.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public  void ReadGA() {
        String fileName = "Group A horse_details.txt"; // Name of the file to read

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                GroupA.add(line); // Add each line to the list
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the lines to verify they were read correctly
        for (Object horses : GroupA) {
            System.out.println(horses);
        }
    }

    public  void ReadGB() {
        String fileName = "Group B horse_details.txt"; // Name of the file to read

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                GroupB.add(line); // Add each line to the list
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the lines to verify they were read correctly
        for (Object horses : GroupB) {
            System.out.println(horses);
        }
    }

    public  void ReadGC() {
        String fileName = "Group C horse_details.txt"; // Name of the file to read

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                GroupC.add(line); // Add each line to the list
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the lines to verify they were read correctly
        for (Object horses : GroupC) {
            System.out.println(horses);
        }
    }

    public  void ReadGD() {
        String fileName = "Group D horse_details.txt"; // Name of the file to read

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                GroupD.add(line); // Add each line to the list
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the lines to verify they were read correctly
        for (Object horses : GroupD) {
            System.out.println(horses);
        };
    }
}

