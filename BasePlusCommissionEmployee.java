public class BasePlusCommissionEmployee extends CommissionEmployee{
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, 
   double commissionRate, double baseSalary) {
      super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }
      this.baseSalary = baseSalary;
   }

   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   }

   // return base-salaried commission employee's base salary
   public double getBaseSalary() {
      return baseSalary;
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString() {
      CommissionEmployee commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
      return String.format("%s %s\n%s: %.2f", "base-salaried", 
         commissionEmployee.toString(), "base salary", getBaseSalary());
   } 
}
