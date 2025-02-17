package com.kyungbae.practice5.controller;

import com.kyungbae.practice5.dto.Employee;

public class Function {

    /**
     * 복사하고 싶은 array 값을 넣어
     * 복사가 된 array를 출력받는다
     *
     * @param arr 복사를 진행할 array 값
     * @return 복사된 array 값
     */
    public Employee[] deepDeepCopy(Employee[] arr){
        Employee[] arrCopy = new Employee[arr.length];
        for (int i = 0; i < arr.length; i++) {
//            arrCopy[i].setEmpNo(arr[i].getEmpNo());
            arrCopy[i] = new Employee(arr[i].getEmpNo(),arr[i].getEmpName()
                    , arr[i].getDept(), arr[i].getJob(), arr[i].getAge(), arr[i].getGender()
                    , arr[i].getSalary(), arr[i].getBonusPoint(), arr[i].getPhone(), arr[i].getAddress()
            );
        }
        return arrCopy;
    }

} // class end
