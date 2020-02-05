package com.itacademy.day2;

import java.time.LocalDate;


public class LoansApplication {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Vardenis");
        customer.setLastName("Pavardenis");
        customer.setAge(23);
        customer.setPersonalNumber("21321321332424");

        Loan leasingLoan = new Loan(1,200,LoanType.LEASING,LocalDate.now());
        Loan consumerLoan = new Loan();
        consumerLoan.setId(2);
        consumerLoan.setAmount(2650);
        consumerLoan.setLoanType(LoanType.CONSUMER_LOAN);
        consumerLoan.setTerminationDate(LocalDate.now());

        Loan[] loans = new Loan[2];
        loans[0] = leasingLoan;
        loans[1] = consumerLoan;
        customer.setLoanArray(loans);

        System.out.println(customer.toString());
    }
}
