package com.ecomerce.userws.mapper;

@Mappper
public interface UserMapper {

    PersonaMapper INSTANCIA= Mappers.getMapper(PersonaMapper.class);

    PersonaDTO personaToPersonaDto(Persona persona);

}
