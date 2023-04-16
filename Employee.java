package Lab01;

import java.time.LocalDate;

class Employee implements Measurable {
    private String nazwa;
    private double pensja;
    private LocalDate dataZatrudnienia;
  
    public Employee(String nazwa, double pensja, LocalDate dataZatrudnienia) {
      this.nazwa = nazwa;
      this.pensja = pensja;
      this.dataZatrudnienia = dataZatrudnienia;
    }
  
    public String toString() {
      return "Imie: " + this.nazwa + " pensja: " + this.pensja + " data zatrudnienia: " + this.dataZatrudnienia;
    }
  
    @Override
    public double getMeasure() {
      return pensja;
    }
  }