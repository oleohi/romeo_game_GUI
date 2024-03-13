module com.example.romeogame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.romeogame to javafx.fxml;
    exports com.example.romeogame;
}