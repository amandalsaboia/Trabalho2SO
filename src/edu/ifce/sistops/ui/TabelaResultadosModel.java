package edu.ifce.sistops.ui;

import edu.ifce.sistops.model.ResultadoTeste;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelaResultadosModel extends AbstractTableModel {

  private final String colnames[] = {
    "NÃºmero de frames",
    "Acertos FIFO",
    "Acertos Segunda Chance",
    "Acertos NUR",
    "Acertos MRU",
    "Acertos òtimo"
  };
  
  private List<ResultadoTeste> listResultados = new ArrayList<>(); 

  public List<ResultadoTeste> getListResultados() {
    return listResultados;
  }

  public void setListResultados(List<ResultadoTeste> listResultados) {
    this.listResultados = listResultados;
    this.fireTableDataChanged();
  }
  
  @Override
  public String getColumnName(int column) {
    return colnames[column];
  }

  @Override
  public int getRowCount() {
    return listResultados.size();
  }

  @Override
  public int getColumnCount() {
    return colnames.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    return listResultados.get(rowIndex).get(columnIndex);
  }

}
