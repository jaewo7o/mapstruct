package com.jaewoo.mapstruct.mapper;

import com.jaewoo.mapstruct.domain.Division;
import com.jaewoo.mapstruct.domain.DivisionDTO;
import com.jaewoo.mapstruct.domain.Employee;
import com.jaewoo.mapstruct.domain.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface EmployeeMapper {
    @Mappings({
            @Mapping(target="employeeId", source="entity.id"),
            @Mapping(target="employeeName", source="entity.name"),
            @Mapping(target="employeeStartDt", source = "entity.startDt",
                    dateFormat = "dd-MM-yyyy HH:mm:ss")
    })
    EmployeeDTO employeeToEmployeeDTO(Employee entity);
    @Mappings({
            @Mapping(target="id", source="dto.employeeId"),
            @Mapping(target="name", source="dto.employeeName"),
            @Mapping(target="startDt", source="dto.employeeStartDt",
                    dateFormat="dd-MM-yyyy HH:mm:ss")
    })
    Employee employeeDTOtoEmployee(EmployeeDTO dto);

    DivisionDTO divisionToDivisionDTO(Division entity);

    Division divisionDTOtoDivision(DivisionDTO dto);
}
