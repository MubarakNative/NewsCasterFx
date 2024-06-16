module com.mubarak.notemake.quran {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.mubarak.notemake.quran to javafx.fxml;
    exports com.mubarak.notemake.quran;
}