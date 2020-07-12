package com.jaewoo.mapstruct.baeldung.mapper;

import com.jaewoo.mapstruct.baeldung.domain.DivisionDTO;
import com.jaewoo.mapstruct.baeldung.domain.Employee;
import com.jaewoo.mapstruct.baeldung.domain.EmployeeDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

class EmployeeMapperTest {

    private EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);

    @Test
    public void givenEmployeeDTOwithDiffNametoEmployee_whenMaps_thenCorrect() {
        // given
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeId(1);
        employeeDTO.setEmployeeName("Jaewoo");

        Employee employee = mapper.employeeDTOtoEmployee(employeeDTO);

        Assertions.assertThat(employee.getId()).isEqualTo(employeeDTO.getEmployeeId());
        Assertions.assertThat(employee.getName()).isEqualTo(employeeDTO.getEmployeeName());
    }

    @Test
    public void givenEmpDTONestedMappingToEmp_whenMaps_thenCorrect() {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setEmployeeId(1);
        dto.setEmployeeName("Jaewoo");
        dto.setEmployeeStartDt("01-04-2016 01:00:00");
        dto.setDivision(new DivisionDTO(1, "Division1"));
        Employee entity = mapper.employeeDTOtoEmployee(dto);
        Assertions.assertThat(dto.getDivision().getId()).isEqualTo(entity.getDivision().getId());
        Assertions.assertThat(dto.getDivision().getName()).isEqualTo(entity.getDivision().getName());
    }

}