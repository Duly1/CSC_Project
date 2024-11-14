module com.example.csc325_groupproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.csc325_groupproject to javafx.fxml;
    exports com.example.csc325_groupproject;
}