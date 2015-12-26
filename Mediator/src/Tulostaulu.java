
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tulostaulu {
    
    private final List<Tulosrivi> tulosrivit = new ArrayList<>();
    
    public void lisaaTulosrivi(Tulosrivi tulosrivi) {
        tulosrivit.add(tulosrivi);
    }
    
    public void poistaTulosrivi(Tulosrivi tulosrivi) {
        tulosrivit.remove(tulosrivi);
    }

    public List<Tulosrivi> getTulosrivit() {
        return tulosrivit;
    }
    
    public void nayta() {
        new Ikkuna();
    }
    
    private class Ikkuna extends JFrame {
        
        private final JScrollPane tablePanel;
        private final JTable table;
        private final String[] columnNames = { "Hyppaaja", "Pituuspisteet",
            "Tyylipisteet", "Kokonaispisteet" };
        
        private final Object[][] rowData = new Object[tulosrivit.size()][4];
        
        public Ikkuna() {
            
            setTitle("Tulostaulu");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            for (int i=0; i<tulosrivit.size(); i++) {
                
                rowData[i][0] = tulosrivit.get(i).getHyppaaja().getNimi();
                rowData[i][1] = tulosrivit.get(i).getPituuspisteet();
                rowData[i][2] = tulosrivit.get(i).getTyylipisteet();
                rowData[i][3] = tulosrivit.get(i).getKokonaispisteet();
            }
            
            table = new JTable(rowData, columnNames);
            tablePanel = new JScrollPane(table);
            getContentPane().add(tablePanel);
            
            setVisible(true);
            pack();
        }
    }
}