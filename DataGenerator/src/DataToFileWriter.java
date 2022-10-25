package DataGenerator.src;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataToFileWriter {
    private double[][] targets;
    private String filename;
    private String data;

    public void copyTargets(double[][] targets) throws IOException {
        this.targets = targets;
    }

    void writeToExcel() {
        try {
            filename = "output/" + LocalDateTime.now().toString() + ".xls";
            //XSSFWorkbook workbook = new XSSFWorkbook();
        } catch ( Exception ex ) {
            System.out.println(ex);
        }
        for (int i=0;i<targets.length;i++)
        {
            for (int j=0;j<targets[i].length;j++)
            {
                System.out.println(targets[i][j] + " ");
            }
        }
    }

    void writeToFile() throws IOException {
        DataOutputStream output = new DataOutputStream(new FileOutputStream(filename));
        output.writeChars(data);
        output.close();
    }
}
