package report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JsonReportMerger {
    private static final String HTML_REPORT_FOLDER = "./target/html-cucumber-report";
    private static final String INPUT_JSON_FOLDER = "./target/cucumber-json-report";

    public static void main(String[] args) {

        new JsonReportMerger().mergeAndGenerateReport();
    }

    private void mergeAndGenerateReport() {
        File reportOutputDirectory = new File(HTML_REPORT_FOLDER);
        List<String> jsonFiles = new ArrayList<>();
        File jsonFilesDirectory = new File(INPUT_JSON_FOLDER);

        File[] files = jsonFilesDirectory.listFiles((dir, name) -> name.toLowerCase().endsWith(".json"));
        if (files != null) {
            for (File jsonFile : files) {
                //  If the JSON file is empty, just delete the file so the report generation is not messed up.
                if (jsonFile.length() == 0) {
                    jsonFile.delete();
                    continue;
                }

                String absolutePath = jsonFile.getAbsolutePath();
                jsonFiles.add(absolutePath);
            }

            Configuration configuration = new Configuration(reportOutputDirectory, "Baljeet Singh's Test automation Report");
            ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
            reportBuilder.generateReports();
        } else {
        }
    }
}
