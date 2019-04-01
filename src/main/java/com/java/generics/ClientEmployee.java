package com.java.generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClientEmployee {

    static <E,T> List<T> extractRequiredEmployeesRawType(List<E> employees, Class<T> cls){

        return  employees.stream().filter(obj -> {
            return  cls.isInstance(obj);
        }).map(filObj -> (T)filObj).collect(Collectors.toList());

    }

    static <T> List<T> extractRequiredEmployeesUpperBound(List<? extends IEmployee> employees, Class<T> cls){

        return  employees.stream().filter(obj -> {
            return  cls.isInstance(obj);
        }).map(filObj -> (T)filObj).collect(Collectors.toList());

    }


    static List<? super IEmployee> addPermanentEmployee(List<? super IEmployee> employees, PermanentEmployee employee){
        employees.add(employee);
        return employees;
    }



    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {


       List<IEmployee> employees =  Arrays.asList(new PermanentEmployee(10,"prakash",27,5000),
                new TemporaryEmployee(4,"kumar",27,5000),
                new ContractEmployee("pp",23,3333)   );

       // List<IEmployeeBonus> employees1 = employees.stream().filter(e -> e instanceof IEmployeeBonus).map(e -> (IEmployeeBonus)e).collect(Collectors.toList());
     List<ContractEmployee> contractEmployees=  extractRequiredEmployeesRawType(employees,ContractEmployee.class);

     System.out.println(contractEmployees.size());

        PermanentEmployee pe1= new PermanentEmployee(10,"prakash",27,5000);
              TemporaryEmployee te=  new TemporaryEmployee(4,"kumar",27,5000);
                ContractEmployee ce = new ContractEmployee("pp",23,3333);

                List<IEmployee> permanentEmployeesList =new ArrayList<>();
        List<? super IEmployee> res= addPermanentEmployee(permanentEmployeesList,pe1);

        System.out.println(permanentEmployeesList.size());








        //filteredList.forEach(x -> System.out.println("employee name"+x.getClass().getSimpleName()));
        /*System.out.println("Permanent employee bonus amount is "+ permEmp.getBonusAmount());
        System.out.println("Temp employee bonus amount is "+ tempEmp.getBonusAmount());
        System.out.println("Contract employee bonus amount is "+ contEmp.getBonusAmount());*/
    }
}
